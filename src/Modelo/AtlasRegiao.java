/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author leovo
 */

public class AtlasRegiao {

    public static List<Regiao> getListaRegioes() {
        return Arrays.asList(
            new Regiao(
                "Periferia",
                "A zona inicial e de baixa altitude. Ruínas cobertas de vegetação e estruturas antigas decrépitas. É o lar de lagartos verdes e criaturas menores, servindo como o ponto de partida do Slugcat.",
                "Moderado",
                Arrays.asList(
                    "Complexo Industrial (Karma 3)",
                    "Conjuntos Agrários (Karma 5)",
                    "Esgotos (Karma 1)"
                ),
                Arrays.asList(
                    "Área Inicial (Outskirts Shelter)",
                    "Ruínas Superiores",
                    "Túneis de Cima"
                ),
                "/Recursos/regioes/Outskirts_region_screen.png",
                1
            ),
            new Regiao(
                "Complexo Industrial",
                "Uma extensa rede subterrânea de tubulações enferrujadas, maquinário antigo e fumaça densa. Conecta várias regiões centrais do mapa e abriga predadores mais agressivos.",
                "Moderado",
                Arrays.asList(
                    "Periferia (Karma 2)",
                    "Cobertura de Chaminés (Karma 4)",
                    "Resíduos de Lixo (Karma 3)",
                    "Sistema de Esgotos (Karma 2)"
                ),
                Arrays.asList(
                    "Fábrica de Tubulações",
                    "Torre de Resfriamento",
                    "Bloco de Fornalhas"
                ),
                "/Recursos/regioes/Industrial_Complex_region_screen.png", // Ajuste para o nome do arquivo
                2
            ),
            new Regiao(
                "Cobertura de Chaminés",
                "Ruínas verticais expostas aos ventos fortes e céus abertos. Possui abismos perigosos e criaturas voadoras letais. Exige muita habilidade de movimento.",
                "Alto / Extremo",
                Arrays.asList(
                    "Complexo Industrial (Karma 4)",
                    "Complexo do Cérebro / Five Pebbles (Karma 8)",
                    "Fenda do Céu (Karma 5)"
                ),
                Arrays.asList(
                    "Torre Ventosa",
                    "Ponte Quebrada",
                    "Plataformas Superiores"
                ),
                "/Recursos/regioes/Chimney_Canopy_region_screen.png", // Ajuste para o nome do arquivo
                4
            )
        );
    }
}