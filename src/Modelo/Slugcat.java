
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author leovo
 */
//modelo de entidadde que representa um Slugcat.
public class Slugcat {
    private String nome;
    private String dificuldade;
    private String descricao;
    private String atributos;
    private String iconeCampanha;
    private String simboloLesgato;

    public Slugcat(String nome, String dificuldade, String descricao, String atributos, String iconeCampanha, String simboloLesgato) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.descricao = descricao;
        this.atributos = atributos;
        this.iconeCampanha = iconeCampanha;
        this.simboloLesgato = simboloLesgato;
    }

    public String getNome() {
        return nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAtributos() {
        return atributos;
    }
    
    public String getIconeCampanha() {
        return iconeCampanha;
    }
    
    public String getSimboloLesgato() {
        return simboloLesgato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAtributos(String atributos) {
        this.atributos = atributos;
    }
    
    public void setIconeCampanha(String iconeCampanha) {
        this.iconeCampanha = iconeCampanha;
    }
    
     public void setSimboloLesgato(String simboloLesgato) {
         this.simboloLesgato = simboloLesgato;
    }
}
