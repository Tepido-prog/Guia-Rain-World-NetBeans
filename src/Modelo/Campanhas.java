/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leovo
 */
//Classe que cria uma lista para os Slugcats e a manipula.
public class Campanhas {
    
    private List<Slugcat> ListaLesgato;
    
    public Campanhas() {
        this.ListaLesgato = new ArrayList<>();
        carregarLesgatosIniciais();
    }
    
    private void carregarLesgatosIniciais() {
        Slugcat Survivor = new Slugcat(
            "O Sobrevivente",
            "Média",
            "Um onívoro ágil, tanto predador quanto presa. Perdido em uma terra dura e indiferente, você deve fazer seu próprio caminho, com astúcia e cautela como seus maiores trunfos.",
            "Sem habilidades com quais se gabar.",
            "/Recursos/campanhas/Survivor_select_screen.png",
            "/Recursos/The_Survivor_icon_(big).png"
        );
        
        Slugcat Monk = new Slugcat(
            "O Monge",
            "Fácil",
            "Fraco de corpo, mas forte de espírito. Em sintonia com os mistérios do mundo e empático com suas criaturas, sua jornada será significativamente mais pacífica.",
            "Faz amizade com criaturas com mais facilidade.",
            "/Recursos/campanhas/Monk_select_screen.png",
            "/Recursos/The_Monk_icon_(big).png"
        );
        
        Slugcat Hunter = new Slugcat(
        "O Caçador",
        "Difícil",
        "Forte e ágil, com um metabolismo feroz que exige uma dieta constante de carne. Mas o estômago não será sua única preocupação, pois o caminho do caçador é repleto de perigos extremos.",
        "Álem de ser mais ágil em comparação a outros lesgatos, você pode armazenar uma lança extra.",
        "/Recursos/campanhas/Hunter_select_screen.png",
        "/Recursos/The_Hunter_icon_(big).png"
        );
        
        Slugcat Gourmand = new Slugcat(
        "O Guloso",
        "Moderado",
        "Um indulgente dos prazeres mais simples da vida. Carregar o mundo no seu estômago oferece muitas vantagens táticas, mas tem um custo maior de sustentabilidade.",
        "Pode-se fabricar itens ao combina-los; Esse lesgato usa seu próprio peso para esmagar seus inimigos.",
        "/Recursos/campanhas/Gourmand_select_screen.png",
        "/Recursos/Karma_4_icon_(no_circle).png"
        );
        
        Slugcat Artificer = new Slugcat(
        "O Artífice",
        "Difícil",
        "Um combatente feroz, mestre em pirotecnia e explosivos. Ansioso por subir na cadeia alimentar, sua jornada certamente será marcada por derramamento de sangue e guerras constantes.",
        "Movimentação ágil; É possível fabricar armas explosivas.",
        "/Recursos/campanhas/Artificer_select_screen.png",
        "/Recursos/Karma_1_icon_(no_circle).png"
        );
        
        Slugcat Rivulet = new Slugcat(
        "O Ribeiro",
        "Difícil",
        "Respira debaixo d'água e se move pelo mundo com facilidade. Essas adaptações são essenciais, pois você será confrontado com um mundo de inundações cada vez mais frequentes, onde o tempo é essencial.",
        "Movimentação super ágil; Respiração Aquática.",
        "/Recursos/campanhas/Rivulet_select_screen.png",
        "/Recursos/The_Nomad_icon_(big).png"
        );
        
        Slugcat Spearmaster = new Slugcat(
        "O Lanceiro",
        "Difícil",
        "Uma anormalidade que se alimenta usando 'lanças' retiradas de seu corpo. Um viajante de uma terra distante; Um sentimento em suas profundezas te chama mais uma vez, mensageiro....",
        "Pode fabricar lanças ilimitadas",
        "/Recursos/campanhas/Spearmaster_select_screen.png",
        "/Recursos/The_Dragon_Slayer_icon_(big).png"
        );
        
        Slugcat Saint = new Slugcat(
        "O Santo",
        "Difícil",
        "Frágil e armado com uma língua comprida. Sua jornada será de iluminação perfeita, mas trilhar esse caminho requer paciência, cuidado e sintonia completa com o mundo.",
        "Usa sua língua para melhor mobilidade",
        "/Recursos/campanhas/Saint_select_screen.png",
        "/Recursos/The_Saint_icon_(big).png"
        );
        
        Slugcat Inv = new Slugcat(
        "???",
        "Difícil",
        "Valeu, Andrew",
        "",
        "/Recursos/campanhas/Inv_select_screen.png",
        "/Recursos/transferir.jpe"
        );
        
        ListaLesgato.add(Survivor);
        ListaLesgato.add(Monk);
        ListaLesgato.add(Hunter);
        ListaLesgato.add(Gourmand);
        ListaLesgato.add(Artificer);
        ListaLesgato.add(Rivulet);
        ListaLesgato.add(Spearmaster);
        ListaLesgato.add(Saint);
        ListaLesgato.add(Inv);
        
    }
    
    public List<Slugcat> getListaLesgato() {
        return ListaLesgato;
    }
    
    // Método para filtrar por tipo (para usar nos filtros do Swing)
    public List<Slugcat> filtrarPorDificuldade(String dificuldadeDesejada) {
        if (dificuldadeDesejada.equalsIgnoreCase("Todos")) {
            return ListaLesgato;
        }

        List<Slugcat> filtrados = new ArrayList<>();
        for (Slugcat i : ListaLesgato) {
            if (i.getDificuldade().equalsIgnoreCase(dificuldadeDesejada)) {
                filtrados.add(i);
            }
        }
        
        return filtrados;
    }
    
    public Slugcat buscarPorNome(String nome) {
        for (Slugcat i : ListaLesgato) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return null;
    }
}