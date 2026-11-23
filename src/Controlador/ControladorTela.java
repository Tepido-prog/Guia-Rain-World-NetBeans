
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Visao.TelaBestiario;
import Visao.TelaCampanha;
import Visao.TelaConquista;
import Visao.TelaRegiao;
import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class ControladorTela {
    
    JDesktopPane jDesktop;
    
     public void abrirTelaBestiario() {
        jDesktop.removeAll();
        jDesktop.updateUI();
        Dimension resolucao = jDesktop.getSize(); //captura resolução do container
        TelaBestiario tela1 = new TelaBestiario();
        tela1.setSize(resolucao);
        tela1.setLocation(0, 0);
        jDesktop.add(tela1);
        tela1.setVisible(true);
    }
     
     public ControladorTela(JDesktopPane jDesktop) {
        this.jDesktop = jDesktop;
    }
     
     public void abrirTelaCampanha(){
         jDesktop.removeAll();
         jDesktop.updateUI();
         Dimension resolucao = jDesktop.getSize();
         TelaCampanha tela2 = new TelaCampanha();
         tela2.setSize(resolucao);
         tela2.setLocation(0, 0);
         jDesktop.add(tela2);
         tela2.setVisible(true);
     }
     
     public void abrirTelaConquista() {
         jDesktop.removeAll();
         jDesktop.updateUI();
         Dimension resolucao = jDesktop.getSize();
         TelaConquista tela3 = new TelaConquista();
         tela3.setSize(resolucao);
         tela3.setLocation(0, 0);
         jDesktop.add(tela3);
         tela3.setVisible(true);
     }
     
     public void abrirTelaRegiao(){
         jDesktop.removeAll();
         jDesktop.updateUI();
         Dimension resolucao = jDesktop.getSize();
         TelaRegiao tela4 = new TelaRegiao();
         tela4.setSize(resolucao);
         tela4.setLocation(0, 0);
         jDesktop.add(tela4);
         tela4.setVisible(true);
     }
}
