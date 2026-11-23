/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Regiao;
import Modelo.AtlasRegiao;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author leovo
 */
public class ControladorRegiao {

    /**
     * Inicializa os botões da tela com os nomes das regiões do banco e configura os cliques.
     */
    public static void inicializarTelaRegioes(List<JButton> botoesDaTela, 
                                              JLabel jLabelNomeRegiao, 
                                              JLabel jLabelIconeRegiao, 
                                              JTextArea jTextAreaDescricaoRegiao, 
                                              JLabel jLabelSubRegioes, 
                                              JLabel jLabelConexoes) {
        
        // Pega a lista de regiões do nosso BancoRegioes
        List<Regiao> listaRegioes = AtlasRegiao.getListaRegioes();

        // Percorre os botões da tela para associar com as regiões cadastradas
        for (int i = 0; i < botoesDaTela.size(); i++) {
            JButton btn = botoesDaTela.get(i);

            // Se temos uma região cadastrada para este botão:
            if (i < listaRegioes.size()) {
                Regiao r = listaRegioes.get(i);
                
                // Define o texto do botão com o nome da região
                btn.setText(r.getNome());
                btn.setEnabled(true);

                // Configura o evento de clique do botão
                btn.addActionListener(e -> exibirDetalhesRegiao(
                    r, jLabelNomeRegiao, jLabelIconeRegiao, jTextAreaDescricaoRegiao, jLabelSubRegioes, jLabelConexoes
                ));
            } else {
                // Se houver mais botões na tela do que regiões no banco, desativa o botão excedente
                btn.setText("---");
                btn.setEnabled(false);
            }
        }
        
        // Se houver pelo menos uma região, já exibe os detalhes dela ao abrir a tela (opcional)
        if (!listaRegioes.isEmpty()) {
            exibirDetalhesRegiao(listaRegioes.get(0), jLabelNomeRegiao, jLabelIconeRegiao, jTextAreaDescricaoRegiao, jLabelSubRegioes, jLabelConexoes);
        }
    }

    /**
     * Exibe os detalhes da região selecionada nos componentes visuais correspondentes.
     */
    public static void exibirDetalhesRegiao(Regiao r, 
                                            JLabel jLabelNomeRegiao, 
                                            JLabel jLabelIconeRegiao, 
                                            JTextArea jTextAreaDescricaoRegiao, 
                                            JLabel jLabelSubRegioes, 
                                            JLabel jLabelConexoes) {
        if (r == null) return;

        // 1. Atualiza o nome da região no label superior
        if (jLabelNomeRegiao != null) {
            jLabelNomeRegiao.setText(r.getNome().toUpperCase());
        }

        // 2. Carrega e redimensiona a capa da região no JLabel de imagem com alta qualidade
        try {
            if (r.getIconeMapa() != null && !r.getIconeMapa().isEmpty()) {
                ImageIcon ref = new ImageIcon(ControladorRegiao.class.getResource(r.getIconeMapa()));
                Image img = ref.getImage().getScaledInstance(
                    jLabelIconeRegiao.getWidth() > 0 ? jLabelIconeRegiao.getWidth() : 300, 
                    jLabelIconeRegiao.getHeight() > 0 ? jLabelIconeRegiao.getHeight() : 150, 
                    Image.SCALE_SMOOTH
                );
                jLabelIconeRegiao.setIcon(new ImageIcon(img));
                jLabelIconeRegiao.setText(""); 
            }
        } catch (Exception e) {
            jLabelIconeRegiao.setIcon(null);
            jLabelIconeRegiao.setText("Imagem indisponível");
        }

        // 3. Joga a descrição, ameaça e karma no JTextArea em formato de tópicos
        if (jTextAreaDescricaoRegiao != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("=== RELATÓRIO DA REGIÃO ===\n\n");
            sb.append("• Nível de Ameaça: ").append(r.getAmeaca()).append("\n");
            sb.append("• Karma Base do Portão: Nível ").append(r.getNvKarma()).append("\n\n");
            sb.append("• Descrição:\n  ").append(r.getDescricao()).append("\n");
            jTextAreaDescricaoRegiao.setText(sb.toString());
        }

        // 4. Formata e joga as sub-regiões no label inferior esquerdo (usando HTML para quebrar linhas)
        if (jLabelSubRegioes != null) {
            StringBuilder sbSub = new StringBuilder("<html><b>Sub-regiões:</b><br>");
            if (r.getSubRegioes() != null && !r.getSubRegioes().isEmpty()) {
                for (String sub : r.getSubRegioes()) {
                    sbSub.append("• ").append(sub).append("<br>");
                }
            } else {
                sbSub.append("• Nenhuma");
            }
            sbSub.append("</html>");
            jLabelSubRegioes.setText(sbSub.toString());
        }

        // 5. Formata e joga as conexões no label inferior direito
        if (jLabelConexoes != null) {
            StringBuilder sbCon = new StringBuilder("<html><b>").append(r.getNome()).append(" | Conexões:</b><br>");
            if (r.getConexoes() != null && !r.getConexoes().isEmpty()) {
                for (String conexao : r.getConexoes()) {
                    sbCon.append("• ").append(conexao).append("<br>");
                }
            } else {
                sbCon.append("• Nenhuma");
            }
            sbCon.append("</html>");
            jLabelConexoes.setText(sbCon.toString());
        }
    }
}