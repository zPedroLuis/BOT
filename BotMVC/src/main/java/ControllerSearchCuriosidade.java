import com.pengrad.telegrambot.model.Update;

public class ControllerSearchCuriosidade implements ControllerSearch{
	
	private Model model;
	private View view;
	
	public ControllerSearchCuriosidade(Model model, View view){
		this.model = model; //connection Controller -> Model
		this.view = view; //connection Controller -> View
	}
	
	public void search(Update update){
		view.sendTypingMessage(update);
		model.searchCuriosidade(update);
	} 

}
