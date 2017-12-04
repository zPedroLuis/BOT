

public class Main {

	private static Model model;
	
	public static void main(String[] args) {

		model = Model.getInstance();
		initializeModel(model);
		View view = new View(model);
		model.registerObserver(view); //connection Model -> View
		view.receiveUsersMessages();

	}
	//O que vai aparecer no bot com a resposta do user
	public static void initializeModel(Model model)
	{
		
		// PLANETA 
		model.addPlaneta(new Planeta("Mercurio", "Mercúrio é o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres"
				+ " Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante"
				+ " o crepúsculo matutino ou vespertino. Mercúrio tem uma aparência similar à da Lua com crateras de impacto e planícies lisas, não possuindo"
				+ " satélites naturais nem uma atmosfera substancial. "));			
				
		model.addPlaneta(new Planeta("Venus", "Vênus é o segundo planeta do Sistema Solar em ordem de distância a partir do Sol, orbitando-o a cada 224,7 dias."
				+ " Depois da Lua, é o objeto mais brilhante do céu noturno. Acredita-se que no passado Vénus possuía oceanos como os da Terra,"
				+ " que se evaporaram quando a temperatura se elevou, restando uma paisagem desértica, seca e poeirenta, com muitas pedras em "
				+ "forma de placas."));						
				
		model.addPlaneta(new Planeta("Terra", "A Terra é o terceiro planeta mais próximo do Sol, o mais denso e o quinto maior"
				+ " dos oito planetas do Sistema Solar. É por vezes designada como Mundo ou Planeta Azul. A Terra é o único corpo celeste"
				+ " onde é conhecida a existência de vida. Cerca de 71% da superfície da Terra está coberta por oceanos de água salgada."
				+ " A Lua é o único satélite natural conhecido da Terra, tendo começado a orbitá-la há 4,53 bilhões de anos. "));				
				
		model.addPlaneta(new Planeta("Marte", "Marte é nomeado em homenagem ao deus romano da guerra. Em diferentes culturas, Marte representa a masculinidade e a juventude. Seu símbolo, um círculo com uma seta apontando para o lado superior direito, também é usado como símbolo do sexo masculino."));
		
		model.addPlaneta(new Planeta("Jupiter", "Júpiter é o maior planeta do Sistema Solar, e é o quinto mais próximo do Sol. É um planeta gasoso, junto com Saturno,"
				+ " Urano e Netuno. Júpiter é composto principalmente de hidrogênio. Júpiter possui um tênue sistema de anéis e uma poderosa "
				+ "magnetosfera. Possui pelo menos 67 satélites. A última sonda a visitar o planeta foi Juno. Um futuro alvo de exploração é "
				+ "Europa, satélite que provavelmente possui um oceano líquido coberto de gelo"));
			
				
		model.addPlaneta(new Planeta("Saturno", "Saturno é o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atrás de Júpiter. Uma das origens de seu campo magnético é a rápida rotação do planeta (menos de onze horas.  "
				+ "Uma das características mais notáveis de Saturno é seu complexo e proeminente sistema de anéis, formados por gelo de água. "
				+ "Além dos anéis, mais de sessenta satélites naturais ao seu redor, dos quais destaca-se Titã, envolto em uma espessa atmosfera de metano."));
			
		model.addPlaneta(new Planeta("Urano", "É o sétimo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar."
				+ " A atmosfera de Urano contém mais 'gelos' tais como água, amônia e metano. Urano tem uma composição similar à de Netuno, "
				+ "e ambos possuem uma composição química diferente da dos maiores gigantes gasosos, Júpiter e Saturno. "));			
				
		model.addPlaneta(new Planeta("Netuno", "É o oitavo planeta do Sistema Solar, o último a partir do Sol desde a reclassificação de Plutão para"
				+ " a categoria de planeta anão, em 2006. O planeta é formado por um pequeno núcleo rochoso ao redor do qual encontra-se uma camada"
				+ " formada possivelmente por água, amônia e metano sobre a qual situa-se sua turbulenta atmosfera, constituída predominantemente de"
				+ " hidrogênio e hélio."));	
				
		
		//CURIOSIDADE
		model.addCuriosidade(new Curiosidade("Mercurio","\"A origem do nome provém do deus Mercúrio, mensageiro dos deuses da mitologia romana, devido ao movimento rápido do \"\n" + 
				"				+ \"planeta no céu em relação a outros planetas. Na astrologia, o planeta está associado com a capacidade de aprender, \"\n" + 
				"				+ \"se adaptar, trocar e desenvolver sociabilidade e de se expressar e é o regente dos signos de Gêmeos e Virgem, \"\n" + 
				"				+ \"comandando a terceira e a sexta casas do zodíaco."));	
		
		model.addCuriosidade(new Curiosidade("Venus","\"Recebeu seu nome em homenagem à deusa romana do amor e da beleza Vênus, equivalente a Afrodite. Vênus não possui satélites\"\n" + 
				"				+ \" naturais, embora o asteroide 2002 VE atualmente mantenha uma relação de quasi-satélite com ele."));

		model.addCuriosidade(new Curiosidade("Terra","O nome Terra não tem origem no nome de um Deus grego ou romano, como é o caso dos restantes planetas. \"\n" + 
				"				+ \"A palavra deriva do latim terra, que significa solo, região, país. O símbolo astronômico da Terra é uma cruz envolvida \"\n" + 
				"				+ \"por um círculo. Ao contrário dos restantes planetas do Sistema Solar, a humanidade começou a ver a Terra como um objeto móvel em órbita à volta do Sol apenas no século XVI. \"));"));
		
		model.addCuriosidade(new Curiosidade("Marte","Os romanos nomearam o planeta de Júpiter, um deus de sua mitologia.  A característica mais marcante de Júpiter é "
				+ "a Grande Mancha Vermelha, uma tempestade anticiclônica persistente, localizada 22° ao sul do equador, que, com dimensões de "
				+ "24-40 mil km x 12-14 mil km, pode abrigar dois ou três planetas com o diâmetro da Terra."));				
		
		model.addCuriosidade(new Curiosidade("Jupiter","Os romanos nomearam o planeta de Júpiter, um deus de sua mitologia.  A característica mais marcante de Júpiter é a Grande Mancha Vermelha, uma tempestade anticiclônica persistente."));
		
		model.addCuriosidade(new Curiosidade("Saturno","\"Saturno é uma estrela errante, ou seja, facilmente visível a olho nu. Saturno recebeu esta denominação a partir de Saturnus, \"\n" + 
				"				+ \"o deus romano do tempo. Embora se movessem de forma diferente no céu, não se supunha que a natureza destes objetos celestes \"\n" + 
				"				+ \"seria diferente das estrelas, pelo menos antes do advento da observação por meio de telescópios."));
		
		model.addCuriosidade(new Curiosidade("Urano","\"Urano é o único planeta cujo nome é derivado de uma figura da mitologia grega ao invés da mitologia romana. \"\n" + 
				"				+ \"Foi nomeado em homenagem ao deus grego do céu, Urano, o pai de Cronos (Saturno) e o avô de Zeus (Júpiter). \"\n" + 
				"				+ \"Urano completa uma volta ao redor do Sol a cada aproximadamente 84 anos terrestres. Sua distância média ao Sol é de aproximadamente 3 bilhões de quilômetros (20 UA)."));		
		
		model.addCuriosidade(new Curiosidade("Netuno","Ao redor de Netuno orbitam quatorze satélites naturais conhecidos, dos quais destaca-se Tritão, de longe o maior. O planeta foi encontrado em 23 de setembro de 1846, o nome escolhido posteriormente homenageia o deus romano dos mares. Até o presente momento, a única sonda espacial que visitou o planeta foi a Voyager 2, em 1989."));
		
		
		//ESTRELA
		model.addEstrela(new Estrela("Sol", "Ele ilumina diretamente a Terra durante o dia e é responsável pelo brilho da Lua durante a noite. Sem o Sol, a vida como a conhecemos não existiria aqui na Terra."));
		model.addEstrela(new Estrela("Alpha Centauri", "Alpha Centauri é na verdade um sistema composto por três estrelas. As estrelas principais no sistema de Alpha Centauri, chamadas de Alpha Centauri A e Alpha Centauri B ficam a cerca de 4,37 anos-luz  da Terra. A terceira estrela, chamada Alpha Centauri C está gravitacionalmente associada à primeiro, mas na verdade está um pouco mais perto da Terra. a 4,24 anos-luz de distância."));
		model.addEstrela(new Estrela("Estrela de Barnard", "Esta é uma anã vermelha ténue que fica a cerca de 5,96 anos-luz da Terra. No passado os cientistas acreditavam que a estrela de Barnard podia conter planetas ao seu redor, mas as tentativas de detectar tais objetos não resultaram em nenhuma observação. A estrela de Barnard fica situada se na constelação Ophiuchus."));
		model.addEstrela(new Estrela("Estrela Wolf 359", "Wolf 359 está muito próxima, localizada a apenas 7,78 anos-luz da Terra, mas é tão fraca que não é visível a olho nu a partir do nosso planeta. É também uma anã vermelha fraca, e está localizada na constelação de Leão. Um fato interessante associado a esta estrela é que ela foi o local de uma batalha épica na série de televisão Star Trek: The Next Generation."));
		model.addEstrela(new Estrela("Lalande 21185", "Lalande 21185 fica na constelação da Ursa Maior, e também é uma anã vermelha ténue que, como muitas das estrelas nesta lista, é muito fraca para ser vista a olho nu da Terra. Apesar disso, esta estrela tem suscitado particular interesse nos astrónomos, pois acredita-se que a mesma tem planetas a orbitá-la."));
		model.addEstrela(new Estrela("Sirius", "O sistema binário de estrelas Sírius, composto por Sirius A e Sirius B está localizado a cerca de 8,58 anos-luz da Terra, nomeadamente na constelação de Canis Major. Mais comummente conhecida como a Estrela do Cão, a produção combinada de ambas as estrelas fazem de Sirius a estrela mais brilhante no céu."));
		
		//SATELITE
		model.addSatelite(new Satelite("Ganimedes","O maior satélite de todos os planetas do Sistema Solar, sendo também o maior satélite de Júputer. Foi descoberta em 1610, por Galileu Galilei."));
		model.addSatelite(new Satelite("Titã","O segundo maior satélite do Sistema Solar, é o maior de Saturno e é o único do Sistema Solar que possui uma atmosfera densa. Foi descobberto em 1655 por Christiaan Huygens."));
		model.addSatelite(new Satelite("Calisto","Este satélite de Júpiter é o terceiro maior do Sistema Solar, foi descoberto em 1610 por Galileu Galilei."));
		model.addSatelite(new Satelite("Io","Este satélite de Júpiter é o terceiro maior, foi descoberto em 1610 por Galileu Galilei."));
		model.addSatelite(new Satelite("Lua","O quinto maior satélite do Sistema Solar, pertencente a Terra. É o maior satélite se comparado com a proporção de seu planeta."));
		model.addSatelite(new Satelite("Europa","Sexto maior satélite, também pertencente a Júpiter, possui uma crosta de gelo, possibilitando a existência de um oceano de água salgada sob essa crosta. Foi descoberto em 1610 por Galileu Galileu."));
		model.addSatelite(new Satelite("Tritão","Está em sétimo lugar como maior satélite. Por ser muito distante do Sol, é um dos objetos mias frios do Sistema Solar, chegando a atingir -235°C. Foi descoberto em 1846 por William Lassell."));
		model.addSatelite(new Satelite("Titânia","É o oitavo maior satélite, pertencente ao planeta Úrano. Foi descoberto em 1787 por William Herschel."));
		model.addSatelite(new Satelite("Reia","Nona maior lua do Sistema Solar, segunda maior do planeta Saturno. Foi descoberta por Giovanni Cassini em 1672."));
		model.addSatelite(new Satelite("Oberon","Décimo maior satélite do Sistema Solar, pertencente a Úrano. Foi descoberto em 1787 por William Herschel."));
		
		
		//COMETA
		model.addCometa(new Cometa("Halley","Passa pela parte interna do Sistema Solar a cada 76 anos. A próxima visita deve acontecer no ano 2061.É composto por materiais não voláteis, poeirentos e que apenas uma pequena porção de sua composição é de gelo."));
		model.addCometa(new Cometa("Kohoutek","Foi observado pela primeira vez em 1973, sendo um cometa de periodo longo, completando uma orbita. Foi o primeiro cometa observado a partir de uma nave espacial tripulada."));
		model.addCometa(new Cometa("Hale-Bopp","Um dos maiores cometas observados no século XX e um dos mais brilhantes da segunda metade do século XX. Aparece a cada 18 meses e foi descoberto em 23 deJulho de 1995."));
		model.addCometa(new Cometa("Swift-Tutle ","Este cometa causa chuvas de meteoros quando a Terra cruza com sua órbita, o que acontece sempre entre 9 e 13 de agosto"));
		model.addCometa(new Cometa("Shoemaker Levy 9 ","colidiu com Júpiter em 1994 e provocou explosões tão grandes que causariam a extinção da humanidade se acontecessem no nosso planeta."));
		
	}

}