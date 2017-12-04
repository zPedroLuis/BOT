import java.util.List;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.BaseResponse;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import com.pengrad.telegrambot.response.SendResponse;

public class View implements Observer{

	
	TelegramBot bot = TelegramBotAdapter.build("304561072:AAGvbU3AOi9hIJzDBF1BuTnyN168hhxBSGY");
	//Objeto que recebe as mensagens
	GetUpdatesResponse updatesResponse;
	//Objeto que envia as mensagens
	SendResponse sendResponse;
	//Objeto que gerencia ações de bate-papo como "Digitando..."
	BaseResponse baseResponse;
	
	SendResponse resposta;
	
			
	
	int queuesIndex=0;
	
	ControllerSearch controllerSearch; //Strategy Pattern -- connection View -> Controller
	
	boolean searchBehaviour = false;
	static boolean teste = false;
	
	
	private Model model;
	
	public View(Model model){
		this.model = model; 
	}
	
	public void setControllerSearch(ControllerSearch controllerSearch){ //Strategy Pattern
		this.controllerSearch = controllerSearch;
	}
	
	public void receiveUsersMessages() {

		
		
		//Loop infinito
		while (true){
		
			//taking the Queue of Messages
			updatesResponse =  bot.execute(new GetUpdates().limit(100).offset(queuesIndex));
			
			//Queue of messages
			List<Update> updates = updatesResponse.updates();

			//taking each message in the Queue
			for (Update update : updates) {
				
				//updating queue's index
				queuesIndex = update.updateId()+1;
				
				if(this.searchBehaviour==true){
					this.callController(update);
					
					
				}
				else if(update.message().text().equals("Planeta")){
					setControllerSearch(new ControllerSearchPlaneta(model, this));
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(),"Digite o nome do planeta que queira pesquisar:\n"
							+ "Mercurio\n"
							+ "Venus\n"
							+ "Terra\n"
							+ "Marte\n"
							+ "Jupiter\n"
							+ "Saturno\n"
							+ "Urano\n"
							+ "Netuno\n"));
										
					this.searchBehaviour = true;
					resposta = sendResponse;
					
				} 
				else if(update.message().text().equals("Estrela")){
					setControllerSearch(new ControllerSearchEstrela(model, this));
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(),"Digite o nome da estrela que queira pesquisar:\n"
					+"Sol\n"
					+"Alpha Centauri\n"
					+"Estrela de Barnard\n"
					+"Estrela Wolf 359\n"
					+"Lalande 21185\n"
					+"Sirius"));
					
					
					this.searchBehaviour = true;
					
				}
				else if(update.message().text().equals("Satélite") || update.message().text().equals("Satelite")){
					setControllerSearch(new ControllerSearchSatelite(model, this));
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(),"Digite o nome do Satélite que queira pesquisar:\n"
					+"Ganimedes\n"
					+"Titã\n"
					+"Calisto\n"
					+"Io\n"
					+"Lua\n"
					+"Europa\n"
					+"Tritão\n"
					+"Titânia\n"
					+"Reia\n"
					+"Oberon"));
					
					
					this.searchBehaviour = true;
					
				}
				else if(update.message().text().equals("Cometa")){
					setControllerSearch(new ControllerSearchCometa(model, this));
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(),"Digite o nome do Cometa que você quer pesquisar:\n"
					+"Halley\n"
					+"Kohoutek\n"
					+"Hale-Bopp\n"
					+"Swift-Tutle\n"
					+"Shoemaker Levy 9\n"));
					
					
					this.searchBehaviour = true;
					
				}
				else if (update.message().text().equals("Curiosidade") && teste == true)
				{
					bot.execute(new SendMessage(update.message().chat().id(),"Sobre qual planeta deseja saber uma curiosidade?"));
					setControllerSearch(new ControllerSearchCuriosidade(model, this));					
					sendResponse = resposta;
							//bot.execute(new SendMessage(update.message().chat().id(),"Escreva Planeta ou Estrela"));
					this.searchBehaviour = true;
				}
				else {
					sendResponse = bot.execute(new SendMessage(update.message().chat().id(),"Informe sobre o que gostaria de pesquisar: \n Planeta \n Estrela \n Satélite \n Cometa \n e digite Curiosidade caso queira saber uma curiosidade de algum planeta. "));
				}			
				
			}

		}
		
		
	}
	
	
	public void callController(Update update){
		this.controllerSearch.search(update);
	}
	
	public void update(long chatId, String planetasData){
		
		sendResponse = bot.execute(new SendMessage(chatId, planetasData));
		this.searchBehaviour = false;
	}
	
	public void sendTypingMessage(Update update){
		baseResponse = bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
	}
	

}