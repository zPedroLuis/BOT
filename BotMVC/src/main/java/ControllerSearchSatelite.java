import com.pengrad.telegrambot.model.Update;
public class ControllerSearchSatelite implements ControllerSearch{
	
	private Model model;
	private View view;
	public ControllerSearchSatelite(Model model, View view)
	{
		this.model = model;
		this.view = view;
	}
	
	public void search(Update update)
	{
		view.sendTypingMessage(update);
		model.searchSatelite(update);
	}
}
