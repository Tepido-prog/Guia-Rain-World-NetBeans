/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author leovo
 */
public class Conquista {
    private String nome;
    private String tipo; //passagem, conquista
    private String descricao;
    private String requisito;
    private String IconeConquista;
    private String IconePassagem;

    public Conquista(String nome, String tipo, String descricao, String requisito, String IconeConquista, String IconePassagem) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.requisito = requisito;
        this.IconeConquista = IconeConquista;
        this.IconePassagem = IconePassagem;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getRequisito() {
        return requisito;
    }

    public String getIconeConquista() {
        return IconeConquista;
    }
    
    public String getIconePassagem(){
        return IconePassagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public void setIconeConquista(String IconeConquista) {
        this.IconeConquista = IconeConquista;
    }
    
    public void setIconePassagem(String IconePassagem) {
        this.IconePassagem = IconePassagem;
    }
    
}
