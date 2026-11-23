/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author leovo
 */
//modelo de entidadde que representa um inimigo.
public class Inimigo{
    private String nome;
    private String tipo; // lagarto, artrópode...
    private String ameaca; //pacífico, agressivo...
    private String descricao;
    private String dicaCombate;
    private String iconeInimigo;

        public Inimigo(String nome, String tipo, String ameaca, String descricao, String dicaCombate, String iconeInimigo) {
            this.nome = nome;
            this.tipo = tipo;
            this.ameaca = ameaca;
            this.descricao = descricao;
            this.dicaCombate = dicaCombate;
            this.iconeInimigo = iconeInimigo;
        }

        public String getNome() {
            return nome;
        }

        public String getTipo() {
            return tipo;
        }

        public String getAmeaca() {
            return ameaca;
        }

        public String getDescricao() {
            return descricao;
        }

        public String getDicaCombate() {
            return dicaCombate;
        }
        
        public String getIconeInimigo() {
            return iconeInimigo;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setAmeaca(String periculosidade) {
            this.ameaca = periculosidade;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public void setDicaCombate(String dicaCombate) {
            this.dicaCombate = dicaCombate;
        }
        
        public void setIcon(String icon) {
            this.iconeInimigo = iconeInimigo;
        }
        
        // Importante para o JList mostrar o nome bonito do inimigo em vez de código de memória
    @Override
    public String toString() {
        return this.nome;
    }

    
    }