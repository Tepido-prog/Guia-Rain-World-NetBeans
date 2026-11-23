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
public class BancoConquistas {
    private List<Conquista> ListaConquista;
    
    public BancoConquistas(){
        this.ListaConquista = new ArrayList<>();
        carregarConquistasIniciais();
        
    }
    
    private void carregarConquistasIniciais(){
        Conquista Sobrevivente = new Conquista(
    "O Sobrevivente",
    "Passagem",
    "Esta terra agora se tornou seu lar.",
    "Hiberne por 5 ciclos com o karma no nível máximo.",
    "",
    ""
);

Conquista Monge = new Conquista(
    "O Monge",
    "Passagem",
    "O caminho do vegetariano.",
    "Hiberne por 6 ciclos mantendo uma dieta vegetariana.",
    "",
    ""
);

Conquista Cacador = new Conquista(
    "O Caçador",
    "Passagem",
    "O caminho do carnívoro.",
    "Hiberne por 5 ciclos consecutivos alimentando-se de criaturas.",
    "",
    ""
);

Conquista Santo = new Conquista(
    "O Santo",
    "Passagem",
    "O caminho do pacifista.",
    "Passe por 6 ciclos sem ferir criaturas.",
    "",
    ""
);

Conquista ForaDaLei = new Conquista(
    "O Fora da Lei",
    "Passagem",
    "O caminho da agressividade.",
    "Mate pelo menos 7 criaturas ao longo de ciclos consecutivos.",
    "",
    ""
);

Conquista MatadorDeDragoes = new Conquista(
    "O Matador de Dragões",
    "Passagem",
    "O predador se tornou a presa.",
    "Mate 6 tipos diferentes de lagartos.",
    "",
    ""
);

Conquista Chefe = new Conquista(
    "O Chefe",
    "Passagem",
    "Abraçado por uma nova tribo.",
    "Alcance 80 pontos de reputação com os Scavengers.",
    "",
    ""
);

Conquista Viajante = new Conquista(
    "O Viajante",
    "Passagem",
    "Suas viagens o levaram longe.",
    "Hiberne pelo menos uma vez em cada região do jogo.",
    "",
    ""
);

Conquista Estudioso = new Conquista(
    "O Estudioso",
    "Passagem",
    "Lições de história.",
    "Toque em 3 pérolas coloridas após cumprir as condições necessárias para seu personagem.",
    "",
    ""
);

Conquista Amigo = new Conquista(
    "O Amigo",
    "Conquista",
    "Não é preciso viajar sozinho.",
    "Encontre Looks to the Moon e hiberne sem roubar um neurônio dela.",
    "",
    ""
);

Conquista IluminacaoRoubada = new Conquista(
    "Iluminação Roubada",
    "Conquista",
    "Um ganho considerável, mas a que preço?",
    "Roube um neurônio de Looks to the Moon durante sua primeira visita, jogando como Survivor ou Monk, e hiberne.",
    "",
    ""
);

Conquista Jornada = new Conquista(
    "A Jornada",
    "Conquista",
    "Vá para o oeste, passando por Farm Arrays, e depois desça profundamente na terra.",
    "Encontre Five Pebbles em seu complexo e hiberne após o encontro.",
    "",
    ""
);

Conquista Peregrinacao = new Conquista(
    "Peregrinação",
    "Conquista",
    "A iluminação suprema, alcançada pelo caminho mais difícil. Um feito que até os guardiões respeitam.",
    "Alcance o karma máximo sem visitar Five Pebbles, encontrando 4 dos 6 Ecos.",
    "",
    ""
);

Conquista Ascensao = new Conquista(
    "Ascensão",
    "Conquista",
    "Você deixou este mundo para trás.",
    "Complete o jogo ascendendo nas Depths.",
    "",
    ""
);

Conquista Martir = new Conquista(
    "O Mártir",
    "Passagem",
    "O caminho do autossacrifício.",
    "Passe por 4 ciclos de fome forçada.",
    "",
    ""
);

Conquista Nomade = new Conquista(
    "O Nômade",
    "Passagem",
    "Grandes passos foram dados.",
    "Atravesse 4 Karma Gates diferentes sem hibernar entre eles.",
    "",
    ""
);

Conquista Peregrino = new Conquista(
    "O Peregrino",
    "Passagem",
    "Ouviu a confluência dos Ecos.",
    "Visite todos os Ecos disponíveis para seu personagem.",
    "",
    ""
);

Conquista Mae = new Conquista(
    "A Mãe",
    "Passagem",
    "Seguiu seus instintos parentais.",
    "Hiberne com Slugpups amigáveis durante 5 progressos de passagem.",
    "",
    ""
);

Conquista Ajuda = new Conquista(
    "Uma Mão Amiga",
    "Conquista",
    "Um último ato de caridade.",
    "Entregue o neurônio inicial de Hunter para Looks to the Moon ou Five Pebbles.",
    "",
    ""
);

Conquista DentroDoTempo = new Conquista(
    "Dentro do Tempo",
    "Conquista",
    "Você encontrou outra saída.",
    "Complete a campanha de Hunter.",
    "",
    ""
);

Conquista Migracao = new Conquista(
    "Migração",
    "Conquista",
    "Você retorna de uma exploração de uma nova terra.",
    "Complete a campanha de Gourmand alcançando o final de Journey's End ou ascendendo.",
    "",
    ""
);

Conquista Encerramento = new Conquista(
    "Encerramento",
    "Conquista",
    "As consequências de sua jornada alcançaram você.",
    "Complete a campanha de Artificer derrotando o Chieftain Scavenger ou ascendendo.",
    "",
    ""
);

Conquista VelhoAmigo = new Conquista(
    "Um Velho Amigo",
    "Conquista",
    "Os destinos foram invertidos.",
    "Complete a campanha de Rivulet restaurando Looks to the Moon com a Rarefaction Cell ou ascendendo.",
    "",
    ""
);

Conquista Mensageiro = new Conquista(
    "Mensageiro",
    "Conquista",
    "Você entregou sua mensagem mais importante.",
    "Complete a campanha de Spearmaster entregando a pérola de Looks to the Moon na Communications Array ou ascendendo.",
    "",
    ""
);

Conquista Ciclo = new Conquista(
    "O Ciclo",
    "Conquista",
    "Tudo retorna ao seu início.",
    "Complete a campanha de Saint ascendendo no topo de Rubicon.",
    "",
    ""
);

Conquista Campeao = new Conquista(
    "Campeão",
    "Conquista",
    "Você completou todos os desafios que lhe foram apresentados.",
    "Complete todos os desafios do Challenge Mode.",
    "",
    ""
);

Conquista LiderExpedicao = new Conquista(
    "Líder de Expedição",
    "Conquista",
    "Você completou todas as expedições que lhe foram apresentadas.",
    "Complete todas as 75 missões do Expedition Mode.",
    "",
    ""
);
        
        ListaConquista.addAll(List.of(
            Sobrevivente,
            Monge,
            Cacador,
            Santo,
            MatadorDeDragoes,
            ForaDaLei,
            Chefe,
            Viajante,
            Estudioso,
            Amigo,
            IluminacaoRoubada,
            Jornada,
            Peregrinacao,
            Ascensao,
            Martir,
            Nomade,
            Peregrino,
            Mae,
            Ajuda,
            DentroDoTempo,
            Migracao,
            Encerramento,
            VelhoAmigo,
            Mensageiro,
            Ciclo,
            Campeao,
            LiderExpedicao
        ));
}
    public List<Conquista> getListaConquista() {
    return ListaConquista;
}
    // Método para filtrar por tipo (para usar nos filtros do Swing)
    public List<Conquista> filtrarPorTipo(String tipoDesejado) {
        if (tipoDesejado.equalsIgnoreCase("Todos")) {
            return ListaConquista;
        }

        List<Conquista> filtrados = new ArrayList<>();
        for (Conquista i : ListaConquista) {
            if (i.getTipo().equalsIgnoreCase(tipoDesejado)) {
                filtrados.add(i);
            }
        }
        
        return filtrados;
    }
    
    public Conquista buscarPorNome(String nome) {
        for (Conquista i : ListaConquista) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i; // Retorna a criatura correspondente
            }
        }
        return null; // Caso não ache a criatura com o nome informado
    }
}
