/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Bestiario;
import Modelo.Campanhas;
import Modelo.Inimigo;
import Modelo.Slugcat;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author leovo
 */
public class ControladorCampanha {
    private Campanhas campanhas;

    public ControladorCampanha() {
        // Instancia a classe de dados onde os inimigos foram cadastrados
        this.campanhas = new Campanhas();
    }

    /**
     * Preenche o JComboBox com os nomes de todos os inimigos cadastrados no Bestiario.
     */
    public void carregarComboCampanha(JComboBox<String> cbSlugcat) {
        cbSlugcat.removeAllItems(); // Limpa itens antigos/padrão
        
        for (Slugcat slugcat : campanhas.getListaLesgato()) {
            cbSlugcat.addItem(slugcat.getNome());
        }
    }

    /**
     * Busca o inimigo selecionado e atualiza os componentes da tela com as informações e a imagem.
     */
    public void exibirDetalhesLesgato(String nomeSlugcat, JLabel jLabelNomeCampanha, JLabel jLabelDificuldadeCampanha, JLabel jLabelAtributosCampanha, 
                                      JTextArea jTextAreaCampanha, JLabel IconeCampanha, JLabel SimboloLesgato) {
        if (nomeSlugcat == null || nomeSlugcat.isEmpty()) {
            return;
        }

        Slugcat slugcat = campanhas.buscarPorNome(nomeSlugcat);

        if (slugcat != null) {
            // 1. Atualiza os Labels com os textos
            jLabelNomeCampanha.setText("Nome: " + slugcat.getNome());
            jLabelDificuldadeCampanha.setText("Dificuldade: " + slugcat.getDificuldade());
            jLabelAtributosCampanha.setText("Atributos: " + slugcat.getAtributos());

            // 2. Preenche a descrição
            jTextAreaCampanha.setText(slugcat.getDescricao());

            // 3. Carrega a FOTO GRANDE de seleção do Slugcat
            // (Substitua getCaminhoFoto() pelo nome real do método na sua classe Slugcat que retorna a foto de seleção)
            carregarImagemNoLabel(slugcat.getIconeCampanha(), IconeCampanha, 200, 200);

            // 4. Carrega o SÍMBOLO DE KARMA no label menor
            carregarImagemNoLabel(slugcat.getSimboloLesgato(), SimboloLesgato, 90, 90);
        }
    }

    /**
     * Método auxiliar genérico para carregar e redimensionar qualquer imagem em um JLabel específico.
     */
    private void carregarImagemNoLabel(String caminho, JLabel labelDestino, int largura, int altura) {
        try {
            if (caminho != null && !caminho.isEmpty() && labelDestino != null) {
                ImageIcon ref = new ImageIcon(getClass().getResource(caminho));
                Image imgRedimensionada = ref.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
                labelDestino.setIcon(new ImageIcon(imgRedimensionada));
            } else if (labelDestino != null) {
                labelDestino.setIcon(null); // Limpa caso não tenha imagem
            }
        } catch (Exception e) {
            System.err.println("Não foi possível carregar a imagem: " + caminho);
        }
    }
}
