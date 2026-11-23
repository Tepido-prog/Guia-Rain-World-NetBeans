package controlador;

import Modelo.Bestiario;
import Modelo.Inimigo;
import java.awt.Image;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ControladorBestiario {

    private Bestiario bestiario;
    private DefaultListModel<String> modeloLista;

    public ControladorBestiario() {
        this.bestiario = new Bestiario();
        this.modeloLista = new DefaultListModel<>();
    }

    public DefaultListModel<String> getModeloLista() {
        return modeloLista;
    }

    public void carregarListaCompleta() {
        atualizarExibicaoLista(bestiario.getListaInimigos());
    }

    public void filtrarInimigos(JTextField txtBusca,
                            JCheckBox jCheckBoxLagarto, JCheckBox jCheckBoxArtropode, JCheckBox jCheckBoxPlanta,
                            JCheckBox jCheckBoxOutros, JCheckBox jCheckBoxEspeciais,
                            JCheckBox jCheckBoxpacifico, JCheckBox jCheckBoxHostil, JCheckBox jCheckBoxAgressivo) {

    String textoBusca = (txtBusca != null) ? txtBusca.getText().trim().toLowerCase() : "";

    boolean fLagartos = jCheckBoxLagarto != null && jCheckBoxLagarto.isSelected();
    boolean fArtropodes = jCheckBoxArtropode != null && jCheckBoxArtropode.isSelected();
    boolean fPlantas = jCheckBoxPlanta != null && jCheckBoxPlanta.isSelected();
    boolean fOutros = jCheckBoxOutros != null && jCheckBoxOutros.isSelected();
    boolean fEspeciais = jCheckBoxEspeciais != null && jCheckBoxEspeciais.isSelected();

    boolean fPacificos = jCheckBoxpacifico != null && jCheckBoxpacifico.isSelected();
    boolean fHostis = jCheckBoxHostil != null && jCheckBoxHostil.isSelected();
    boolean fAgressivos = jCheckBoxAgressivo != null && jCheckBoxAgressivo.isSelected();

    List<Inimigo> listaFiltrada = new ArrayList<>();

    for (Inimigo inimigo : bestiario.getListaInimigos()) {
        String nome = inimigo.getNome() != null ? inimigo.getNome().toLowerCase() : "";
        String tipo = inimigo.getTipo() != null ? inimigo.getTipo().trim() : "";
        String ameaca = inimigo.getAmeaca() != null ? inimigo.getAmeaca().trim() : "";

        // Critério A: Busca por nome
        boolean matchTexto = nome.contains(textoBusca);

        // Critério B: Categoria (se nenhuma estiver marcada, passa qualquer uma)
        boolean matchTipo = true;
        if (fLagartos || fArtropodes || fPlantas || fOutros || fEspeciais) {
            matchTipo = false;
            if (fLagartos && tipo.equalsIgnoreCase("Lagarto")) matchTipo = true;
            if (fArtropodes && tipo.equalsIgnoreCase("Artrópode")) matchTipo = true;
            if (fPlantas && tipo.equalsIgnoreCase("Planta")) matchTipo = true;
            if (fEspeciais && tipo.equalsIgnoreCase("Especial")) matchTipo = true;

            if (fOutros) {
                boolean ehTipoConhecido = tipo.equalsIgnoreCase("Lagarto")
                        || tipo.equalsIgnoreCase("Artrópode")
                        || tipo.equalsIgnoreCase("Planta")
                        || tipo.equalsIgnoreCase("Especial");
                if (!ehTipoConhecido) {
                    matchTipo = true;
                }
            }
        }

        // Critério C: Nível de ameaça (se nenhuma estiver marcada, passa qualquer um)
        boolean matchAmeaca = true;
        if (fPacificos || fHostis || fAgressivos) {
            matchAmeaca = false;
            if (fPacificos && ameaca.equalsIgnoreCase("Pacífico")) matchAmeaca = true;
            if (fHostis && ameaca.equalsIgnoreCase("Hostil")) matchAmeaca = true;
            if (fAgressivos && ameaca.equalsIgnoreCase("Agressivo")) matchAmeaca = true;
        }

        if (matchTexto && matchTipo && matchAmeaca) {
            listaFiltrada.add(inimigo);
        }
    }

    atualizarExibicaoLista(listaFiltrada);
}

    private void atualizarExibicaoLista(List<Inimigo> lista) {
        modeloLista.clear();
        for (Inimigo inimigo : lista) {
            modeloLista.addElement(inimigo.getNome());
        }
    }

    public void exibirDetalhesInimigo(String nomeInimigo,
                                      JLabel jLabelNomeBestiario,
                                      JLabel jLabelBestiarioTipo,
                                      JLabel jLabelAmeacaBestiario,
                                      JTextArea jTextAreaDescricaoBestiario,
                                      JTextArea jTextAreaDicaBestiario,
                                      JLabel jLabelIcone1) {
        if (nomeInimigo == null || nomeInimigo.isEmpty()) {
            return;
        }

        Inimigo inimigo = bestiario.buscarPorNome(nomeInimigo);

        if (inimigo != null) {
            jLabelNomeBestiario.setText("Nome: " + inimigo.getNome());
            jLabelBestiarioTipo.setText("Tipo: " + inimigo.getTipo());
            jLabelAmeacaBestiario.setText("Ameaça: " + inimigo.getAmeaca());

            jTextAreaDescricaoBestiario.setText(inimigo.getDescricao());
            jTextAreaDicaBestiario.setText(inimigo.getDicaCombate());

            atualizarIconeInimigo(inimigo, jLabelIcone1);
        }
    }

    private void atualizarIconeInimigo(Inimigo inimigo, JLabel jLabelIcone1) {
        try {
            String caminhoFoto = inimigo.getIconeInimigo();

            if (caminhoFoto != null && !caminhoFoto.isEmpty()) {
                ImageIcon ref = new ImageIcon(getClass().getResource(caminhoFoto));
                Image imgRedimensionada = ref.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                jLabelIcone1.setIcon(new ImageIcon(imgRedimensionada));
            } else {
                jLabelIcone1.setIcon(null);
            }
        } catch (Exception e) {
            System.err.println("Não foi possível carregar a imagem do inimigo: " + inimigo.getNome());
            jLabelIcone1.setIcon(null);
        }
    }
}