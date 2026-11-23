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
//Classe que cria uma lista para os inimigos e a manipula.
public class Bestiario {
    
    private List<Inimigo> listaInimigos;

    //criando a lista e carregando os inimigos.
    public Bestiario() {
        this.listaInimigos = new ArrayList<>();
        carregarInimigos();
    }

    // Método pra digitar/cadastrar as criaturas.
    private void carregarInimigos() {
        Inimigo LagartoVerde = new Inimigo(
            "Lagarto Verde",
            "Lagarto",
            "Hostil",
            "Um predador pesado e blindado que habita as áreas inferiores.",
            "Evite combate frontal. Use pedras para desorientar e atire lanças no corpo.",
            "/Recursos/bestiario/Green_Lizard_icon.png"
        );

        Inimigo LagartoRosa = new Inimigo(
            "Lagarto Rosa",
            "Lagarto",
            "Agressivo",
            "Mais ágil que o verde, capaz de escalar postes verticais.",
            "Mantenha distância e aproveite que eles se distraem facilmente com outros animais.",
            "/Recursos/bestiario/Pink_Lizard_icon.png"
        );
        
        Inimigo LagartoAzul = new Inimigo(
            "Lagarto Azul",
            "Lagarto",
            "Hostil",
            "Lagarto capaz de escalar qualquer tipo de estrutura. Possui grande mobilidade.",
            "É o lagarto mais fraco do ecosisstema. além de ser o mais pequeno, é derrotado apenas com 2 golpes de lança.",
            "/Recursos/bestiario/Blue_Lizard_icon.png"
        );
        
        Inimigo LagartoBranco = new Inimigo(
            "Lagarto Branco",
            "Lagarto",
            "Hostil",
            "Lagarto que se camufla pelo cenário. Também possui uma grande lingua para capturar suas presas caso tentem fugir.",
            "Seja meticuloso e analise bem o cenário, é possível notar erros e texturas estranhas no cenário que entreguem sua posição.",
            "/Recursos/bestiario/White_Lizard_icon.png"
        );
        
        Inimigo LagartoPreto = new Inimigo (
            "Lagarto Preto",
            "Lagarto",
            "Hostil",
            "Lagarto que habita profundezas e usa a escuridão como camuflagem.",
            "Preste atenção em seus movimentos, esse lagarto pode emitir pequenos pulsos de luz de sua cabeça, revelando sua localização.",
            "/Recursos/bestiario/Black_Lizard_icon.png"
        );
        
        Inimigo LagartoAmarelo = new Inimigo (
            "Lagarto Amarelo",
            "Lagarto",
            "Agressivo",
            "Lagarto com hábitos predatórios constantes. Ele utiliza antenas em sua cabeça para se comunicar com os demais próximos, fazendo um ataque combinado contra a presa.",
            "Evite ser visto e seja cauteloso. Se um deles te ver ou sentir, todos ficarão sabendo.",
            "/Recursos/bestiario/Yellow_Lizard_icon.png"
        );
        
        Inimigo LagartoCiano = new Inimigo (
            "Lagarto Ciano",
            "Lagarto",
            "Agressivo",
            "Esse lagarto pode realizar grandes saltos usando impulsos a gás ao seu favor para superar obstáculos e caçar suas presas, além de poder escalar paredes e postes.",
            "Seus impulsos não conseguem ser usados em canos. Utilize os próprios impulsos dele para o enganar e faze-lo cair em abismos.",
            "/Recursos/bestiario/Cyan_Lizard_icon.png"
        );
        
        Inimigo LagartoCaramelo = new Inimigo (
            "Lagarto Caramelo",
            "Lagarto",
            "Hostil",
            "Esse lagarto possui mobilidade e velocidade bem limitados, por isso, lança bolas de gosma de sua boca para acertar suas presas, as incapacitando, atrasando ou fazendo-as cair, caso estejam fora de seu alcançe.",
            "Utilize a cobertura da região para se protejer de seus projéteis.",
            "/Recursos/bestiario/Caramel_Lizard_icon.png"
        );
        
        Inimigo LagartoMorango = new Inimigo (
            "Lagarto Morango",
            "Lagarto",
            "Hostil",
            "Este lagarto possui grande mobilidade, uma vez que utiliza sua grande lingua para se agarrar e se balançar em paredes e estruturas, além de usá-la para pegar suas presas. Mais frequente de se aparecer na campanha do Santo.",
            "O Lagarto Morango é lento andando normalmente. Evite cenários com muitas estruturas o qual ele pode usar para se agarrar.",
            "/Recursos/bestiario/Strawberry_Lizard_icon.png"
        );
        
        Inimigo LagartoVermelho = new Inimigo (
            "Lagarto Vermelho",
            "Lagarto",
            "Agressivo",
            "O maior dos lagartos, o mais agressivo entre eles. Com grande agilidade, resistência e um cuspe ácido incapacitante, tudo em seu caminho é sua presa ",
            "Nunca o combata de frente. Utilize o cenário (como pulos entre abismos e ventilações) para ter vantagem. As vezes, a melhor estratégia é fugir.",
            "/Recursos/bestiario/Red_Lizard_icon.png"
        );
        
        Inimigo Trem = new Inimigo (
            "Lagarto Trem",
            "Lagarto",
            "Agressivo",
            "Lagarto secreto disponível apenas na campanha de Inv. Ridiculamente forte e quase impossível de escapar.",
            "Boa sorte :)",
            "/Recursos/bestiario/Train_Lizard_icon.png"
        );
        
        Inimigo Salamandra = new Inimigo (
            "Salamandra",
            "Lagarto",
            "Hostil",
            "Criatura aquática capaz de respirar e caçar em ambientes com água, sendo mais comum encontrar ela no Litoral.",
            "Extremamente desajeitada quando em superfície, mas consegue escalar postes.",
            "/Recursos/bestiario/Salamander_icon.png"
        );
        
        Inimigo LagartoEnguia = new Inimigo (
            "Lagarto Enguia",
            "Lagarto",
            "Hostil",
            "Criatura aquática extremamente rápida. Capaz de se adaptar em superfície melhor que uma Salamandra, uma vez que pode escalar paredes e cenários.",
            "Utilize impulsos aquáticos e nado sincronizado para fugir da criatura, sempre administrando bem o oxigênio. Em terra, ela continua sendo fraca, podendo ser derrotada apenas com 2 golpes de lança.",
            "/Recursos/bestiario/Eel_Lizard_icon.png"
        );
        
        Inimigo Abutre = new Inimigo (
            "Abutre",
            "Áereo",
            "Agressivo",
            "Uma grande criatura esquelética voadora que utiliza asas mecânicas. O Abutre é o principal predador dos Lagartos, os quais ficam com medo quando avistam um voando pelo cenário.",
            "A principal maneira de lidar com eles é entrando em estruturas com cobertura, como túneis e canos, onde ele não pode te alcançar.",
            "/Recursos/bestiario/Vulture_icon.png"
        );
        
        Inimigo ReiAbutre = new Inimigo (
            "Rei Abutre",
            "Áereo",
            "Agressivo",
            "Uma grande criatura esquelética voadora que utiliza asas mecânicas. O Abutre é o principal predador dos Lagartos, os quais ficam com medo quando avistam um voando pelo cenário.",
            "A principal maneira de lidar com eles é entrando em estruturas com cobertura, como túneis e canos, onde ele não pode te alcançar.",
            "/Recursos/bestiario/King_Vulture_icon.png"
        );

        Inimigo RatoLanterna = new Inimigo(
            "Rato Lanterna",
            "Roedor",
            "Pacífico",
            "Pequeno roedor bioluminescente inofensivo.",
            "Não ataca. Serve como fonte de luz ao ser transportado em locais escuros.",
            "/Recursos/bestiario/Lantern_Mouse_icon.png"
        );
        
        Inimigo Morcemosca = new Inimigo (
            "Morcemosca",
            "Artrópode",
            "Pacífico",
            "Pequena criatura inofensiva que voa pelos arredores. Serve como fonte de comida.",
            "Morcemoscas podem tentar se esconder na grama alta se detectarem você, tente caça-las pegando desprevinidas.",
            "/Recursos/bestiario/Batfly_icon.png"
        );
        
        Inimigo Cervo = new Inimigo (
            "Cervo-da-chuva",
            "Cervo",
            "Pacífico",
            "Criatura gigante com enormes e resistentes pernas que protegem seu corpo dos perigos terrestres.",
            "A Rena é o principal meio para avançar no jogo. Para montar nela, procure uma bomba de esporos para atraí-lo. Quando ele se abaixar para comer a bomba ou cheirar os esporos, suba nele e segure firme em seus chifres. Você pode controlar a direção focando seu peso para o local desejado.",
            "/Recursos/bestiario/Rain_Deer_icon.png"
        );
        
        Inimigo PlantaPoste = new Inimigo (
            "Planta Poste",
            "Planta",
            "Hostil",
            "Vegetação que imita perfeitamente superfícies agarráveis como postes. Qualquer criatura que encostar nela, é agarrado e levado para o subsolo.",
            "Preste atenção no cenário se houver postes em excesso, pode haver alguma Planta Poste planejando uma armadilha.",
            "/Recursos/bestiario/Pole_Plant_icon.png"
        );
        
        Inimigo GramaVerme = new Inimigo (
            "Grama Verme",
            "Planta",
            "Agressivo",
            "Conjunto de vegetação que imita grama alta, mas entrando em contato, gruda em sua presa e começa a sugar as energias do azarado.",
            "Cuide onde pisa e fique atento com a vegetação. Gramas Verme possuem uma cor característica, facilitando identificação.",
            "/Recursos/bestiario/Worm_Grass_icon.png"
        );
        
        Inimigo AlgaMonstro = new Inimigo (
            "Alga Monstro",
            "Planta",
            "Hostil",
            "Similar a Planta Poste, a Alga Monstro mimetiza um Kelp em locais aquáticos e úmidos.",
            "fique atento a qualquer vegetação aquática densa muito perto da superfície",
            "/Recursos/bestiario/Monster_Kelp_icon.png"
        );
        
        Inimigo MoscaMacarrao = new Inimigo (
            "Mosca Macarrão",
            "Artrópode",
            "hostil",
            "Criatura voadora que lembra um macarrão rosado. Geralmente anda em bando, com seus filhotes",
            "Tenha em mente que, caso você tente pegar um de seus filhotes para se alimentar, a Mosca Macarrão não ficará nem um pouco contente.",
            "/Recursos/bestiario/Adult_Noodlefly_icon.png"
        );
        
       Inimigo Centopeia = new Inimigo (
            "Centopeia",
            "Artrópode",
            "hostil",
            "Inseto que pode variar de tamanho, podendo alcançar até 5x o seu tamanho quando era um filhote que, inclusive, podem servir como alimento.",
            "Centopeias são rápidas, mas se movimentam em investidas, com intervalo entre elas. Provocar seus filhotes podem deixa-las ainda mais agressivas.",
            "/Recursos/bestiario/Mature_Centipede_icon.png"
        );
       
       Inimigo CentopeiaAqua = new Inimigo (
            "Centopeia Aquática",
            "Artrópode",
            "Agressivo",
            "Centopeia que vive exclusivamente de baixo da água. Sua descarga elétrica consegue matar qualquer um dentro do raio de alcançe.",
            "Apesar de ser extremamente rápida, perde velocidade em curvas. Nade em zigue-zague para atrasa-la. Bombas de esporos são sua principal fraqueza.",
            "/Recursos/bestiario/Aquapede_icon.png"
        );
       
       Inimigo AranhaG = new Inimigo (
            "Aranha Grande",
            "Artrópode",
            "hostil",
            "Conhecida também como Aranha Lobo, ela é consideravelmente maior que as outras aranhas, caçando suas presas com botes letais, habitando principalmente locais escuros e úmidos, como a Cidadela Sombreada e O Subterrâneo.",
            "São frágeis, um golpe de lança é o suficiente para matá-la. Bombas de esporos e frutos de luz são suas maiores fraquezas.",
            "/Recursos/bestiario/Big_Spider_icon.png"
        );
       
       Inimigo LulaCigarra = new Inimigo (
            "Lula Cigarra",
            "Cefalópode",
            "hostil",
            "Uma criatura voadora que habita lugares altos, como Ilhas do Céu e Cobertura de Chaminés. Por mais que não possam matar nem machucar, podem se bater contra você caso invada seu território(o que pode te derrubar ou atrapalhar em fugas).",
            "Pode-se agarrar elas para usa-las como um planador vivo. é possível passar por elas sem ser empurrado caso as domestique com sangue-sugas.",
            "/Recursos/bestiario/Black_Squidcada_icon.png"
        );
       
       Inimigo CentopeiaAlada = new Inimigo (
            "Centopeia Alada",
            "Artrópode",
            "hostil",
            "Centopeia com a capacidade de voar. Diferentes das outras espécies, ela prefere a fuga do que a luta, mas não hesitará em atacar se for ameaçada ou sentir sua presença por muito tempo.",
            "Seu campo de visão e audição são super limitados. Bomba de esporos são fatais para ela.",
            "/Recursos/bestiario/Centiwing_icon.png"
        );
       
       Inimigo CatadorChefe = new Inimigo (
            "Catador Chefe",
            "catador",
            "Agressívo",
            "Líder supremo dos Catadores e o alvo final da vingança da Artífice.",
            "Foque em derrubar sua máscara primeiro, assim ele ficará mais vulnerável."
                    + "Tome cuidado com lanças elétricas, elas te deixam incapacitado e vulnerável para o próximo golpe."
                    + "Use os saltos explosivos da Artífice a vontade.",
            "/Recursos/bestiario/Chieftain_Scavenger_icon.png"
        );
       
        Inimigo AranhaDeEnxame = new Inimigo (
            "Aranha de Enxame",
            "Artrópode",
            "Hostil",
            "Aranha que sozinha é inofensiva, mas quando em grupo, se juntam para formar uma criatura maior e letal.",
            "Carregue sempre com você uma lanterna ou frutos de luz para assustar as aranhas. Bombas de esporos são sua fraqueza.",
            "/Recursos/bestiario/Coalescipede_icon.png"
        );
        
        Inimigo Rot = new Inimigo (
            "Podridão",
            "Especial",
            "Agressivo",
            "Câncer, Podridão ou rot é uma consequência de experimentos falhos de Cinco Seixos. Uma amontuado de tumores com tentáculos grandes imparável.",
            "É impossível matá-lo, sua melhor opção é fugir e se esconder em locais fechados. Utilize pedras e outros arremessáveis para destrai-lo com sons.",
            "/Recursos/bestiario/Daddy_Long_Legs_icon.png"
        );
        
        Inimigo BesouroArmadilheiro = new Inimigo (
            "Besouro Armadilheiro",
            "Artrópode",
            "Agressivo",
            "Um inseto com um par de mandíbulas estilo tesoura afiados que se camufla nos tetos e espera alguma criatura passar para dar um bote super rápido! Itens de valor, como frutas e lanças são usados por ele para incentivar ainda mais a presa a se aproximar.",
            "Preste atenção na localização dos itens. Itens isolados podem entregar seu local da armadilha.",
            "/Recursos/bestiario/Dropwig_icon.png"
        );
        
        Inimigo Echo = new Inimigo (
            "Echo",
            "Especial",
            "Pacífico",
            "Restos espectrais dos Antigos que não puderam ascender por completo, como se a alma de alguns deles estivessem ainda vagando por esse mundo.",
            "Echos aparecem em locais específicos, interagir com eles é super benéfico.",
            "/Recursos/bestiario/Echo_icon.png"
        );
        
        Inimigo Ovoseto = new Inimigo (
            "Ovoseto",
            "Artrópode",
            "Pacífico",
            "Uma criatura que carrega todos os seus ovos nas costas. Matá-lo com certeza lhe trará um banquete.",
            "Ágil, porem frágil. Um único golpe de lança é capaz de matá-lo e fazer seus ovos desprenderem de seu corpo.",
            "/Recursos/bestiario/Eggbug_icon.png"
        );
        
        Inimigo CatadorDeElite = new Inimigo (
            "Catador de Elite",
            "Catador",
            "Agressivo",
            "Guerreiros de elite armados com lanças explosivas, armadura e super pulos combinados com uma mira quase perfeita.",
            "Utilize explosivos ou lanças para deixa-los sem defesa para finalmente poder cravar sua lança em algum.",
            "/Recursos/bestiario/Elite_Scavenger_icon.png"
        );
        
        Inimigo InsetoFogo = new Inimigo (
            "Inseto Fogo",
            "Artrópode",
            "Hostil",
            "Inseto semelhante ao InsetoOlho, mas que se provocado, não hesitará em ser mais agressivo. Ele é exclusívo da campanha do Santo.",
            "Basta deixá-lo quieto e ele não irá incomodar.",
            "/Recursos/bestiario/Firebug_icon.png"
        );
        
        Inimigo MinhocaDoLixo = new Inimigo (
            "Minhoca Do Lixo",
            "especial",
            "hostil",
            "Um verme que vive nos Resíduos de Lixo. Tem o hábito de roubar lanças (inclusive as que estão em suas costas) e se recolherem em seus buracos com elas.",
            "Não é possível matá-la, mas caso seja provocada ou ferida, ficará com raiva e irá alertar as outras de sua espécie para terem comportamentos mais agressivos com você.",
            "/Recursos/bestiario/Garbage_Worm_icon.png"
        );
        
        Inimigo VermeArpão = new Inimigo (
            "Verme Arpão",
            "Artrópode",
            "Agressivo",
            "Inseto pacífico que fica atracado entre paredes.",
            "Pode ser usado como um atirador de gancho vivo, ganhando mais mobilidade.",
            "/Recursos/bestiario/Grappling_Worm_icon.png"
        );
        
        Inimigo Guardião = new Inimigo (
            "Guardião",
            "Especial",
            "Hostil",
            "Um ser gigante construído pelos Antigos encontrado nas Profundezas. Qualquer um que tentar passar por ele sem o nível de karma requirido é barrado, se insistir... Morto.",
            "Não é possível matá-lo ou detê-lo.",
            "/Recursos/bestiario/Guardian_icon.png"
        );
        
        Inimigo LulaEsfumacante = new Inimigo (
            "Lula Esfumaçante",
            "Cefalópode",
            "Pacífico",
            "Uma lula que habita as águas perigosas desse mundo. Quando encontrado em cuperfície, na beira de lagos e rios, muda sua pigmentação para se camuflar no cenário. Disperça uma névoa preta ao se sentir ameaçada.",
            "É possível utilizar a lula como uma granada de fumaça, ja que nenhum inimigo conseguirá enxergar você enquanto dentro dela.",
            "/Recursos/bestiario/Hazer_icon.png"
        );
        
        Inimigo Inspetor = new Inimigo (
            "Inspetor",
            "Especial",
            "Agressivo",
            "Também conhecidos como Hidras ou Axônios, são criaturas encontradas nas superestruturas dos Iteradores que atuam como protetoras dos neurônios dos Iteradores.",
            "Fique longe dos cenários onde eles protegem os neurônios.",
            "/Recursos/bestiario/Inspector_icon.png"
        );
        
        Inimigo AguaViva = new Inimigo (
            "Água-viva",
            "Cnidário",
            "Hostil",
            "Uma água-viva normal, mexa com ela e ganhe um choque atordoante! Pode ser consumida como alimento.",
            "Seja o mais rápido possível para comê-la antes dela revidar! Evite ficar muito tempo encostando nela.",
            "/Recursos/bestiario/Jellyfish_icon.png"
        );
        
        Inimigo PeixeAJato = new Inimigo (
            "Peixe a Jato",
            "Peixe",
            "Pacífico",
            "Um peixe que usa propulsão na água para se mover rapidamente. Embora não cause dano, seu instinto brincalhão faz com que ele bata de frente com você várias vezes, o que pode fazer você perder fôlego e se afogar. .",
            "Pode ser usado como um jetski vivo se agarrado, tornando viagens na água super rápidas e práticas!.",
            "/Recursos/bestiario/Jetfish_icon.png"
        );
        
        Inimigo SanguessugaDaFloresta = new Inimigo (
            "Sanguessuga da Floresta",
            "Verme",
            "Agressivo",
            "Sanguessuga com a habilidade de poder sobreviver fora da água e drenar pontos de comida do Slugcat.",
            "Evite pular na água :)",
            "/Recursos/bestiario/Jungle_Leech_icon.png"
        );
        
        Inimigo Leviata = new Inimigo (
            "Leviatã",
            "Especial",
            "Agressivo",
            "Ser colossal que habita as águas mais profundas do Litoral. uma única mordida engole você inteiro.",
            "É inútil lutar. Utilize animais mortos ou pedras para tentar distrair a atenção do leviatã",
            "/Recursos/bestiario/Leviathan_icon.png"
        );
        
        Inimigo Miros = new Inimigo (
            "Pássaro de Miros",
            "Ave",
            "Agressivo",
            "Pássaros biomecânicos incapazes de voar, mas que são armados com bicos afiados, como tesouras. Habitam principalmente as Criptas da Memória.",
            "Sempre que ouvir sons de tesoura, corra para um local subterrãneo ou abertura no chão imediatamente, pois qualquer coisa que estiver em seu caminho será fatiado na hora. Tmabém ficam deesorientados com a explosão de uma fruta de luz.",
            "/Recursos/bestiario/Miros_Bird_icon.png"
        );
        
        Inimigo MirosV = new Inimigo (
            "Abutre de Miros",
            "Ave",
            "Agressivo",
            "O rei dos céus, uma mescla de Abutre com Pássaro de Miros. Possui mobilidade áerea e terrestre, emitindo um laser explosivo de sua boca que aniquila qualquer presa. Frutos de luz não o atordoam.",
            "Use obstáculos e paredes sólidas para bloquear seus dispaaros. Prefira fugir para áreas pequenas do que lutar",
            "/Recursos/bestiario/Miros_Vulture_icon.png"
        );
        
        Inimigo AranhaMae = new Inimigo (
            "Aranha Mãe",
            "Artrópode",
            "Hostil",
            "Aracnídeo que prefere a fuga do que o combate. Caso a mate, seus filhotes sairão do seu corpo e se juntarão em uma criatura ainda maior para acabar com você.",
            "Evite matá-la. Caso queira, certifique-se que esteja carrgeando uma bomba de esporos ou um fruto de luz",
            "/Recursos/bestiario/Mother_Spider_icon.png"
        );
        
        Inimigo CentopeiaVermelha = new Inimigo (
            "Centopeia Vermelha",
            "Artrópode",
            "Agressivo",
            "Uma variação de centopeia super agressiva, marcante pelo sua coloração vermelha. Sua velocidade absurda facilmente ultrapassa a de um Lesgato",
            "Ela penas te vê e te ouve enquanto parada. use isso ao seu favor. Prefira fugir do que lutar.",
            "/Recursos/bestiario/Red_Centipede_icon.png"
        );
        
        Inimigo SanguessugaVermelho = new Inimigo (
            "Sanguessuga Vermelho",
            "Verme",
            "Agressivo",
            "Vermes que habitam as aguas dos Sistemas de Drenagem e Resíduos de Lixo. 3 sanguessugas grudadas em você já é o suficiente para fazer você afundar.",
            "Estouros de Caracóis Pipoca podem ferir e até matar sanguessugas. Você pode dar uma carcaça de algum animal para elas se distraírem por um determinado tempo.",
            "/Recursos/bestiario/Red_Leech_icon.png"
        );
        
        Inimigo Catador = new Inimigo (
            "Catador",
            "Catador",
            "hostil",
            "Seres tribais capazes de confeccionar ferramentas, manusear armas, se comunicar e realizar trocas por objetos de valor. Seu nível de ameaça irá depender de sua reputação com eles.",
            "Demonstrar que você não é uma maeaça (como presentear pérolas, pagar pedágios, realizar trocas, salvar Catadores de Lagartos, etc...) aumenta sua reputação com os catadores. Utilize dessa dádiva para unir forças com eles.",
            "/Recursos/bestiario/Scavenger_icon.png"
        );
        
        Inimigo SanguessugaDoMar = new Inimigo (
            "Sanguessuga do Mar",
            "Verme",
            "Agressivo",
            "Mais comuns em águas profundas, como as do Litoral, as Sanguessugas do Mar são uma variante maior das Sanguessugas Vermelhas, dando mais peso para afogar sua presa ao agarrar nela.",
            "Estouros de Caracóis Pipoca podem ferir e até matar sanguessugas. Você pode dar uma carcaça de algum animal para elas se distraírem por um determinado tempo.",
            "/Recursos/bestiario/Sea_Leech_icon.png"
        );
        
        Inimigo CaracolPipoca = new Inimigo (
            "Caracol Pipoca",
            "Anfíbio",
            "hostil",
            "Um caracol que recebe este nome por ter um estouro icônico que atordoa qualquer criatura em seu arredor. ",
            "Pode ser usado para atordoar inimigos, mas certifique-se de não ficar na área de explosão também!",
            "/Recursos/bestiario/Snail_icon.png"
        );
        
        Inimigo AranhaCuspidora = new Inimigo (
            "Aranha Cuspidora",
            "Artrópode",
            "Agressívo",
            "Uma aranha resistente, característica pelos seus espinhos vermelhos nas costas. Ela cospe dardos venenosos, incapacitando o Lesgato e distorcendo a tela do jogador. Mais resistente que as outras aranhas, serão necessários 4 golpes com lança para matá-la.",
            "Bombas de esporos e frutos de luz continuam sendo seu maior ponto fraco. Utilize cobertura para bloquear seus projéteis.",
            "/Recursos/bestiario/Spitter_Spider_icon.png"
        );
        
        Inimigo Clandestino = new Inimigo (
            "Clandestino",
            "Verme",
            "Agressivo",
            "Criatura com o mesmo hábito de um Besouro Armadilheiro e uma Planta Poste. Seu corpo imita perfeitamente a textura de canos e ferrugem pelo cenário, e seus tentáculos, postes. Ao encostar nestes postes, seus tentáculos o agarram, levando você lentamente até a sua boca.",
            "Criatura extremamente frágil, uma única lança é capaz de matá-lo na hora. Para se soltar de seus tentáculos, utilize bombas cereja e lanças em seus tentáculos.",
            "/Recursos/bestiario/Stowaway_icon.png"
        );
        
        Inimigo VermeDoVazio = new Inimigo (
            "Verme do Vazio",
            "Especial",
            "hostil",
            "Os Vermes do Vazio são criaturas longas e imensas que habitam as profundezas do Mar do Vazio, nas Profundezas. Apesar de seu tamanho colossal e da ausência de nadadeiras ou quaisquer outros apêndices que auxiliem na locomoção, eles são capazes de se mover com uma rapidez notável.",
            "sei lá",
            "/Recursos/bestiario/Void_Worm_icon.png"
        );
        
        Inimigo LagartaAbutre = new Inimigo (
            "Lagarta Abutre",
            "Artrópode",
            "Pacífico",
            "Uma lagarta inofensiva que, caso for colocada em céu aberto, emite um som e luz que atrai a atenção de abutres.",
            "Não a ponha em áreas abertas caso não queira ter mais problemas!",
            "/Recursos/bestiario/Vulture_Grub_icon.png"
        );
        
        Inimigo Supervisor = new Inimigo (
            "Supervisor",
            "Especial",
            "Pacífico",
            "Uma criatura dispositivo criada para servir de olhos para os Iteradores. Assim, eles podem ver o que acontece pela região sem sairem de suas instalações.",
            "Maioria dos Supervisores dão dicas e avisos visuais de onde ir, onde há abrigos, comida e perigos, fique atento!",
            "/Recursos/bestiario/Yellow_Overseer_icon.png"
        );

                // Adicionando todos os objetos na lista (57 criaturas no total)
        listaInimigos.addAll(List.of(
            LagartoVerde,
            LagartoRosa,
            LagartoAzul,
            LagartoBranco,
            LagartoPreto,
            LagartoAmarelo,
            LagartoCiano,
            LagartoCaramelo,
            LagartoMorango,
            LagartoVermelho,
            Trem,
            Salamandra,
            LagartoEnguia,
            Abutre,
            ReiAbutre,
            RatoLanterna,
            Morcemosca,
            Cervo,
            PlantaPoste,
            GramaVerme,
            AlgaMonstro,
            MoscaMacarrao,
            Centopeia,
            CentopeiaAqua,
            AranhaG,
            LulaCigarra,
            CentopeiaAlada,
            CatadorChefe,
            AranhaDeEnxame,
            Rot,
            BesouroArmadilheiro,
            Echo,
            Ovoseto,
            CatadorDeElite,
            InsetoFogo,
            MinhocaDoLixo,
            VermeArpão,
            Guardião,
            LulaEsfumacante,
            Inspetor,
            AguaViva,
            PeixeAJato,
            SanguessugaDaFloresta,
            Leviata,
            Miros,
            MirosV,
            AranhaMae,
            CentopeiaVermelha,
            SanguessugaVermelho,
            Catador,
            SanguessugaDoMar,
            CaracolPipoca,
            AranhaCuspidora,
            Clandestino,
            VermeDoVazio,
            LagartaAbutre,
            Supervisor
        ));

        
    }

    // Método para a Tela/Controlador pegar a lista completa de inimigos
    public List<Inimigo> getListaInimigos() {
        return listaInimigos;
    }

    // Método para filtrar por tipo (para usar nos filtros do Swing)
    public List<Inimigo> filtrarPorTipo(String tipoDesejado) {
        if (tipoDesejado.equalsIgnoreCase("Todos")) {
            return listaInimigos;
        }

        List<Inimigo> filtrados = new ArrayList<>();
        for (Inimigo i : listaInimigos) {
            if (i.getTipo().equalsIgnoreCase(tipoDesejado)) {
                filtrados.add(i);
            }
        }
        
        return filtrados;
    }
    
    public Inimigo buscarPorNome(String nome) {
        for (Inimigo i : listaInimigos) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                return i; // Retorna a criatura correspondente
            }
        }
        return null; // Caso não ache a criatura com o nome informado
    }
}