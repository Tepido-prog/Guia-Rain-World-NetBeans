/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author leovo
 */
public class Regiao {
    private String nome;
    private String descricao;
    private String ameaca;
    private List<String> conexoes;
    private List<String> subRegioes;
    private String iconeMapa;
    private int nvKarma;
    
    public Regiao(String nome, String descricao, String ameaca, 
                  List<String> conexoes, List<String> subRegioes, 
                  String iconeMapa, int nvKarma ){
        this.nome = nome;
        this.descricao = descricao;
        this.ameaca = ameaca;
        this.conexoes = conexoes;
        this.subRegioes = subRegioes;
        this.iconeMapa = iconeMapa;
        this.nvKarma = nvKarma;
        
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAmeaca() {
        return ameaca;
    }

    public List<String> getConexoes() {
        return conexoes;
    }
    
    public List<String> getSubRegioes(){
        return subRegioes;
    }

    public String getIconeMapa() {
        return iconeMapa;
    }

    public int getNvKarma() {
        return nvKarma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAmeaca(String ameaca) {
        this.ameaca = ameaca;
    }

    public void setConexoes(List<String> conexoes) {
        this.conexoes = conexoes;
    }
    
    public void setSubRgioes(List<String> subRgioes){
        this.subRegioes = subRegioes;
    }

    public void setIconeMapa(String iconeMapa) {
        this.iconeMapa = iconeMapa;
    }

    public void setNvKarma(int nvKarma) {
        this.nvKarma = nvKarma;
    }
    
    
}
