

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
		model.addPlaneta(new Planeta("Mercurio", "Merc�rio � o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres"
				+ " Uma vez que Merc�rio normalmente se perde no intenso brilho solar, exceto em eclipses solares, s� pode ser observado a olho nu durante"
				+ " o crep�sculo matutino ou vespertino. Merc�rio tem uma apar�ncia similar � da Lua com crateras de impacto e plan�cies lisas, n�o possuindo"
				+ " sat�lites naturais nem uma atmosfera substancial. "));			
				
		model.addPlaneta(new Planeta("Venus", "V�nus � o segundo planeta do Sistema Solar em ordem de dist�ncia a partir do Sol, orbitando-o a cada 224,7 dias."
				+ " Depois da Lua, � o objeto mais brilhante do c�u noturno. Acredita-se que no passado V�nus possu�a oceanos como os da Terra,"
				+ " que se evaporaram quando a temperatura se elevou, restando uma paisagem des�rtica, seca e poeirenta, com muitas pedras em "
				+ "forma de placas."));						
				
		model.addPlaneta(new Planeta("Terra", "A Terra � o terceiro planeta mais pr�ximo do Sol, o mais denso e o quinto maior"
				+ " dos oito planetas do Sistema Solar. � por vezes designada como Mundo ou Planeta Azul. A Terra � o �nico corpo celeste"
				+ " onde � conhecida a exist�ncia de vida. Cerca de 71% da superf�cie da Terra est� coberta por oceanos de �gua salgada."
				+ " A Lua � o �nico sat�lite natural conhecido da Terra, tendo come�ado a orbit�-la h� 4,53 bilh�es de anos. "));				
				
		model.addPlaneta(new Planeta("Marte", "Marte � nomeado em homenagem ao deus romano da guerra. Em diferentes culturas, Marte representa a masculinidade e a juventude. Seu s�mbolo, um c�rculo com uma seta apontando para o lado superior direito, tamb�m � usado como s�mbolo do sexo masculino."));
		
		model.addPlaneta(new Planeta("Jupiter", "J�piter � o maior planeta do Sistema Solar, e � o quinto mais pr�ximo do Sol. � um planeta gasoso, junto com Saturno,"
				+ " Urano e Netuno. J�piter � composto principalmente de hidrog�nio. J�piter possui um t�nue sistema de an�is e uma poderosa "
				+ "magnetosfera. Possui pelo menos 67 sat�lites. A �ltima sonda a visitar o planeta foi Juno. Um futuro alvo de explora��o � "
				+ "Europa, sat�lite que provavelmente possui um oceano l�quido coberto de gelo"));
			
				
		model.addPlaneta(new Planeta("Saturno", "Saturno � o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atr�s de J�piter. Uma das origens de seu campo magn�tico � a r�pida rota��o do planeta (menos de onze horas.  "
				+ "Uma das caracter�sticas mais not�veis de Saturno � seu complexo e proeminente sistema de an�is, formados por gelo de �gua. "
				+ "Al�m dos an�is, mais de sessenta sat�lites naturais ao seu redor, dos quais destaca-se Tit�, envolto em uma espessa atmosfera de metano."));
			
		model.addPlaneta(new Planeta("Urano", "� o s�timo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar."
				+ " A atmosfera de Urano cont�m mais 'gelos' tais como �gua, am�nia e metano. Urano tem uma composi��o similar � de Netuno, "
				+ "e ambos possuem uma composi��o qu�mica diferente da dos maiores gigantes gasosos, J�piter e Saturno. "));			
				
		model.addPlaneta(new Planeta("Netuno", "� o oitavo planeta do Sistema Solar, o �ltimo a partir do Sol desde a reclassifica��o de Plut�o para"
				+ " a categoria de planeta an�o, em 2006. O planeta � formado por um pequeno n�cleo rochoso ao redor do qual encontra-se uma camada"
				+ " formada possivelmente por �gua, am�nia e metano sobre a qual situa-se sua turbulenta atmosfera, constitu�da predominantemente de"
				+ " hidrog�nio e h�lio."));	
				
		
		//CURIOSIDADE
		model.addCuriosidade(new Curiosidade("Mercurio","\"A origem do nome prov�m do deus Merc�rio, mensageiro dos deuses da mitologia romana, devido ao movimento r�pido do \"\n" + 
				"				+ \"planeta no c�u em rela��o a outros planetas. Na astrologia, o planeta est� associado com a capacidade de aprender, \"\n" + 
				"				+ \"se adaptar, trocar e desenvolver sociabilidade e de se expressar e � o regente dos signos de G�meos e Virgem, \"\n" + 
				"				+ \"comandando a terceira e a sexta casas do zod�aco."));	
		
		model.addCuriosidade(new Curiosidade("Venus","Recebeu seu nome em homenagem � deusa romana do amor e da beleza V�nus, equivalente a Afrodite. V�nus n�o possui sat�lites\"\n" + 
				"				  naturais, embora o asteroide 2002 VE atualmente mantenha uma rela��o de quasi-sat�lite com ele."));

		model.addCuriosidade(new Curiosidade("Terra","O nome Terra n�o tem origem no nome de um Deus grego ou romano, como � o caso dos restantes planetas. \"\n" + 
				"				+ \"A palavra deriva do latim terra, que significa solo, regi�o, pa�s. O s�mbolo astron�mico da Terra � uma cruz envolvida \"\n" + 
				"				+ \"por um c�rculo. Ao contr�rio dos restantes planetas do Sistema Solar, a humanidade come�ou a ver a Terra como um objeto m�vel em �rbita � volta do Sol apenas no s�culo XVI. \"));"));
		
		model.addCuriosidade(new Curiosidade("Marte","Os romanos nomearam o planeta de J�piter, um deus de sua mitologia.  A caracter�stica mais marcante de J�piter � "
				+ "a Grande Mancha Vermelha, uma tempestade anticicl�nica persistente, localizada 22� ao sul do equador, que, com dimens�es de "
				+ "24-40 mil km x 12-14 mil km, pode abrigar dois ou tr�s planetas com o di�metro da Terra."));				
		
		model.addCuriosidade(new Curiosidade("Jupiter","Os romanos nomearam o planeta de J�piter, um deus de sua mitologia.  A caracter�stica mais marcante de J�piter � a Grande Mancha Vermelha, uma tempestade anticicl�nica persistente."));
		
		model.addCuriosidade(new Curiosidade("Saturno","\"Saturno � uma estrela errante, ou seja, facilmente vis�vel a olho nu. Saturno recebeu esta denomina��o a partir de Saturnus, \"\n" + 
				"				+ \"o deus romano do tempo. Embora se movessem de forma diferente no c�u, n�o se supunha que a natureza destes objetos celestes \"\n" + 
				"				+ \"seria diferente das estrelas, pelo menos antes do advento da observa��o por meio de telesc�pios."));
		
		model.addCuriosidade(new Curiosidade("Urano","\"Urano � o �nico planeta cujo nome � derivado de uma figura da mitologia grega ao inv�s da mitologia romana. \"\n" + 
				"				+ \"Foi nomeado em homenagem ao deus grego do c�u, Urano, o pai de Cronos (Saturno) e o av� de Zeus (J�piter). \"\n" + 
				"				+ \"Urano completa uma volta ao redor do Sol a cada aproximadamente 84 anos terrestres. Sua dist�ncia m�dia ao Sol � de aproximadamente 3 bilh�es de quil�metros (20 UA)."));		
		
		model.addCuriosidade(new Curiosidade("Netuno","Ao redor de Netuno orbitam quatorze sat�lites naturais conhecidos, dos quais destaca-se Trit�o, de longe o maior. O planeta foi encontrado em 23 de setembro de 1846, o nome escolhido posteriormente homenageia o deus romano dos mares. At� o presente momento, a �nica sonda espacial que visitou o planeta foi a Voyager 2, em 1989."));
		
		
		//ESTRELA
		model.addEstrela(new Estrela("Sol", "Ele ilumina diretamente a Terra durante o dia e � respons�vel pelo brilho da Lua durante a noite. Sem o Sol, a vida como a conhecemos n�o existiria aqui na Terra."));
		model.addEstrela(new Estrela("Alpha Centauri", "Alpha Centauri � na verdade um sistema composto por tr�s estrelas. As estrelas principais no sistema de Alpha Centauri, chamadas de Alpha Centauri A e Alpha Centauri B ficam a cerca de 4,37 anos-luz  da Terra. A terceira estrela, chamada Alpha Centauri C est� gravitacionalmente associada � primeiro, mas na verdade est� um pouco mais perto da Terra. a 4,24 anos-luz de dist�ncia."));
		model.addEstrela(new Estrela("Estrela de Barnard", "Esta � uma an� vermelha t�nue que fica a cerca de 5,96 anos-luz da Terra. No passado os cientistas acreditavam que a estrela de Barnard podia conter planetas ao seu redor, mas as tentativas de detectar tais objetos n�o resultaram em nenhuma observa��o. A estrela de Barnard fica situada se na constela��o Ophiuchus."));
		model.addEstrela(new Estrela("Estrela Wolf 359", "Wolf 359 est� muito pr�xima, localizada a apenas 7,78 anos-luz da Terra, mas � t�o fraca que n�o � vis�vel a olho nu a partir do nosso planeta. � tamb�m uma an� vermelha fraca, e est� localizada na constela��o de Le�o. Um fato interessante associado a esta estrela � que ela foi o local de uma batalha �pica na s�rie de televis�o Star Trek: The Next Generation."));
		model.addEstrela(new Estrela("Lalande 21185", "Lalande 21185 fica na constela��o da Ursa Maior, e tamb�m � uma an� vermelha t�nue que, como muitas das estrelas nesta lista, � muito fraca para ser vista a olho nu da Terra. Apesar disso, esta estrela tem suscitado particular interesse nos astr�nomos, pois acredita-se que a mesma tem planetas a orbit�-la."));
		model.addEstrela(new Estrela("Sirius", "O sistema bin�rio de estrelas S�rius, composto por Sirius A e Sirius B est� localizado a cerca de 8,58 anos-luz da Terra, nomeadamente na constela��o de Canis Major. Mais comummente conhecida como a Estrela do C�o, a produ��o combinada de ambas as estrelas fazem de Sirius a estrela mais brilhante no c�u."));
		
		//SATELITE
		model.addSatelite(new Satelite("Ganimedes","O maior sat�lite de todos os planetas do Sistema Solar, sendo tamb�m o maior sat�lite de J�puter. Foi descoberta em 1610, por Galileu Galilei."));
		model.addSatelite(new Satelite("Tit�","O segundo maior sat�lite do Sistema Solar, � o maior de Saturno e � o �nico do Sistema Solar que possui uma atmosfera densa. Foi descobberto em 1655 por Christiaan Huygens."));
		model.addSatelite(new Satelite("Calisto","Este sat�lite de J�piter � o terceiro maior do Sistema Solar, foi descoberto em 1610 por Galileu Galilei."));
		model.addSatelite(new Satelite("Io","Este sat�lite de J�piter � o terceiro maior, foi descoberto em 1610 por Galileu Galilei."));
		model.addSatelite(new Satelite("Lua","O quinto maior sat�lite do Sistema Solar, pertencente a Terra. � o maior sat�lite se comparado com a propor��o de seu planeta."));
		model.addSatelite(new Satelite("Europa","Sexto maior sat�lite, tamb�m pertencente a J�piter, possui uma crosta de gelo, possibilitando a exist�ncia de um oceano de �gua salgada sob essa crosta. Foi descoberto em 1610 por Galileu Galileu."));
		model.addSatelite(new Satelite("Trit�o","Est� em s�timo lugar como maior sat�lite. Por ser muito distante do Sol, � um dos objetos mias frios do Sistema Solar, chegando a atingir -235�C. Foi descoberto em 1846 por William Lassell."));
		model.addSatelite(new Satelite("Tit�nia","� o oitavo maior sat�lite, pertencente ao planeta �rano. Foi descoberto em 1787 por William Herschel."));
		model.addSatelite(new Satelite("Reia","Nona maior lua do Sistema Solar, segunda maior do planeta Saturno. Foi descoberta por Giovanni Cassini em 1672."));
		model.addSatelite(new Satelite("Oberon","D�cimo maior sat�lite do Sistema Solar, pertencente a �rano. Foi descoberto em 1787 por William Herschel."));
		
		
		//COMETA
				model.addCometa(new Cometa("Halley","Passa pela parte interna do Sistema Solar a cada 76 anos. A pr�xima visita deve acontecer no ano 2061.� composto por materiais n�o vol�teis, poeirentos e que apenas uma pequena por��o de sua composi��o � de gelo."));
				model.addCometa(new Cometa("Kohoutek","Foi observado pela primeira vez em 1973, sendo um cometa de periodo longo, completando uma orbita. Foi o primeiro cometa observado a partir de uma nave espacial tripulada."));
				model.addCometa(new Cometa("Hale-Bopp","Um dos maiores cometas observados no s�culo XX e um dos mais brilhantes da segunda metade do s�culo XX. Aparece a cada 18 meses e foi descoberto em 23 deJulho de 1995."));
				model.addCometa(new Cometa("Swift-Tutle ","Este cometa causa chuvas de meteoros quando a Terra cruza com sua �rbita, o que acontece sempre entre 9 e 13 de agosto"));
				model.addCometa(new Cometa("Shoemaker Levy 9 ","colidiu com J�piter em 1994 e provocou explos�es t�o grandes que causariam a extin��o da humanidade se acontecessem no nosso planeta."));
		
	}

}