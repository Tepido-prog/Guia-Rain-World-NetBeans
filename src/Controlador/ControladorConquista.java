/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.BancoConquistas;
import Modelo.Conquista;
import Modelo.Inimigo;
import java.awt.Image;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class ControladorConquista {

    private BancoConquistas repositorio;

    public ControladorConquista() {
        this.repositorio = new BancoConquistas();
    }

    /**
     * 1. Popula dinamicamente o painel da esquerda (dentro do ScrollPane) com os CheckBoxes.
     */
    public void carregarConquistasNoPainel(JPanel painelCheckboxesEsquerda, 
                                          JProgressBar ProgressoConquista,
                                          JLabel IconeConquista, 
                                          JLabel IconePassagem, 
                                          JTextArea jTextAreaRequisitoConquista, 
                                          JLabel jLabelConclusao, JLabel jlabelDescricaoConquista,
                                          JLabel jLabelNomeCOnquista,
                                          JLabel jLabelTipoConquista,
                                          boolean FiltroPassagem, 
                                          boolean FiltroConquista) {
        
        
        // Limpa o painel da esquerda antes de carregar
        painelCheckboxesEsquerda.removeAll();
        
        // CORREÇÃO: Usando o método correto do BancoConquistas
        List<Conquista> lista = repositorio.getListaConquista();

        if (lista != null) {
            if (lista != null) {
            for (Conquista c : lista) {
                // Lê o tipo do objeto (ex: "Passagem" ou "Conquista") com segurança contra nulos
                String tipo = c.getTipo() != null ? c.getTipo().trim() : "";

                // ** AQUI ESTÁ A LÓGICA EXATA DO FILTRO POR TIPO **
                // Se o usuário marcou "Apenas passagens", ignoramos tudo que NÃO for Passagem
                if (FiltroPassagem && !tipo.equalsIgnoreCase("Passagem")) {
                    continue; 
                }
                
                // Se o usuário marcou "Apenas conquistas", ignoramos tudo que NÃO for Conquista
                if (FiltroConquista && !tipo.equalsIgnoreCase("Conquista")) {
                    continue; 
                }
                JCheckBox chk = new JCheckBox(c.getNome());
                chk.setForeground(new java.awt.Color(50, 50, 50)); 
                chk.setAlignmentX(Component.LEFT_ALIGNMENT);
                chk.setFocusPainted(false);

                // Evento 1: Passar o mouse exibe os detalhes à direita instantaneamente
                chk.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent evt) {
                        exibirDetalhesConquista(c, IconeConquista, IconePassagem, jTextAreaRequisitoConquista, jlabelDescricaoConquista, jLabelNomeCOnquista, jLabelTipoConquista);
                        atualizarStatusConcluido(chk, jLabelConclusao);
                    }
                });

                // Evento 2: Caso o usuário clique na caixa para marcar/desmarcar
                chk.addItemListener(e -> {
                    atualizarBarraProgresso(painelCheckboxesEsquerda, ProgressoConquista);
                    atualizarStatusConcluido(chk, jLabelConclusao);
                });
                
                // Evento 3 (Segurança Extra): Se usar as setas do teclado para navegar na lista
                chk.addChangeListener(e -> {
                    if (chk.isSelected() || chk.hasFocus()) {
                        exibirDetalhesConquista(c, IconeConquista, IconePassagem, jTextAreaRequisitoConquista, jlabelDescricaoConquista, jLabelNomeCOnquista, jLabelTipoConquista);
                        atualizarStatusConcluido(chk, jLabelConclusao);
                    }
                });

                painelCheckboxesEsquerda.add(chk);
            }
        }
        }

        // Atualiza visualmente o painel da esquerda
        painelCheckboxesEsquerda.revalidate();
        painelCheckboxesEsquerda.repaint();
        
        // Inicializa a barra de progresso com base no estado atual
        atualizarBarraProgresso(painelCheckboxesEsquerda, ProgressoConquista);
    }

    /**
     * 2. Atualiza o painel de detalhes à direita com as imagens e descrições corretas.
     */
    public void exibirDetalhesConquista(Conquista c, JLabel IconeConquista, JLabel IconePassagem, JTextArea jTextAreaRequisitoConquista, JLabel jLabelDescricaoConquista, JLabel jLabelNomeConquista, JLabel jLabelTipoConquista) {
        if (c == null) return;

        // Exibe o requisito e a descrição no JTextArea
        jTextAreaRequisitoConquista.setText("Requisito:\n" + c.getRequisito());
        jLabelDescricaoConquista.setText("Descrição:\n " + c.getDescricao());
        jLabelNomeConquista.setText(c.getNome());
        jLabelTipoConquista.setText(c.getTipo());

        // Carrega o ícone pequeno da conquista (o símbolo no canto superior)
        try {
            if (c.getIconeConquista() != null && !c.getIconeConquista().isEmpty()) {
                ImageIcon ref = new ImageIcon(getClass().getResource(c.getIconeConquista()));
                Image img = ref.getImage().getScaledInstance(260, 240, Image.SCALE_SMOOTH);
                IconeConquista.setIcon(new ImageIcon(img));
            }
        } catch (Exception e) {
            IconeConquista.setIcon(null);
        }

        // Carrega a arte cinematográfica da passagem
        try {
            if (c.getIconePassagem() != null && !c.getIconePassagem().isEmpty()) {
                ImageIcon refPassagem = new ImageIcon(getClass().getResource(c.getIconePassagem()));
                Image imgPassagem = refPassagem.getImage().getScaledInstance(80,80, Image.SCALE_SMOOTH);
                IconePassagem.setIcon(new ImageIcon(imgPassagem));
            }
        } catch (Exception e) {
            IconePassagem.setIcon(null);
        }
    }

    /**
     * 3. Controla a visibilidade do rótulo "CONCLUÍDO!" em cima da arte da passagem.
     */
    public void atualizarStatusConcluido(JCheckBox chk, JLabel jLabelConclusao) {
        if (chk.isSelected()) {
            jLabelConclusao.setText("CONCLUÍDO!");
            jLabelConclusao.setVisible(true);
        } else {
            jLabelConclusao.setVisible(false);
        }
    }

    /**
     * 4. Recalcula e atualiza a barra de progresso com base nos checkboxes marcados.
     */
    public void atualizarBarraProgresso(JPanel painelCheckboxesEsquerda, JProgressBar ProgressoConquista) {
        int total = 0;
        int marcados = 0;

        for (Component comp : painelCheckboxesEsquerda.getComponents()) {
            if (comp instanceof JCheckBox) {
                total++;
                if (((JCheckBox) comp).isSelected()) {
                    marcados++;
                }
            }
        }

        ProgressoConquista.setMaximum(total > 0 ? total : 1);
        ProgressoConquista.setValue(marcados);
        ProgressoConquista.setString(marcados + " / " + total + " Concluídos");
        ProgressoConquista.setStringPainted(true);
        
    } 
}