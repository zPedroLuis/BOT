import java.util.LinkedList;
import java.util.List;

import com.pengrad.telegrambot.model.Update;

public class Model implements Subject{
	
	private List<Observer> observers = new LinkedList<Observer>();
	
	private List<Planeta> planetas = new LinkedList<Planeta>();
	private List<Estrela> estrelas = new LinkedList<Estrela>();
	private List<Curiosidade> curiosidades = new LinkedList<Curiosidade>();
	private List<Satelite> satelites = new LinkedList<Satelite>();
	private List<Cometa> cometas = new LinkedList<Cometa>();
	
	private static Model uniqueInstance;
	
	private Model(){}
	
	public static Model getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Model();
		}
		return uniqueInstance;
	}
	
	public void registerObserver(Observer observer){
		observers.add(observer);
	}
	
	public void notifyObservers(long chatId, String planetasData){
		for(Observer observer:observers){
			observer.update(chatId, planetasData);
		}
	}
	
	public void addPlaneta(Planeta planeta){
		this.planetas.add(planeta);
	}
	
	public void addEstrela(Estrela Estrela){
		this.estrelas.add(Estrela);
	}
	public void addCuriosidade(Curiosidade Curiosidade) {
		this.curiosidades.add(Curiosidade);
	}
	public void addSatelite(Satelite Satelite) {
		this.satelites.add(Satelite);
		
	}
	public void addCometa(Cometa Cometa) {
		this.cometas.add(Cometa);
		
	}
	//PLANETA
	public void searchPlaneta(Update update)
	{
		String planetasData = null;
		for(Planeta planeta: planetas)
		{
			if(planeta.getName().equals(update.message().text()))
			{
				planetasData = planeta.getInformacoes();
			}
		}
		
		if(planetasData != null){
			this.notifyObservers(update.message().chat().id(), planetasData);
			View.teste = true;
		} 
		else 
		{
			this.notifyObservers(update.message().chat().id(), "Planeta não encontrado");
			View.teste = false;
			
		}
		
	}
	//ESTRELA
	public void searchEstrela(Update update)
	{
		String estrelasData = null;
		for(Estrela Estrela:estrelas)
		{
			if(Estrela.getName().equals(update.message().text()))
			{
				estrelasData = Estrela.getField();
			}
		}
		
		if(estrelasData != null)
		{
			this.notifyObservers(update.message().chat().id(), estrelasData);
		} 
		else 
		{
			this.notifyObservers(update.message().chat().id(), "Estrela não encontrada");
		}
		
	}
	//CURIOSIDADE
	public void searchCuriosidade(Update update) 
	{
		String curiosidadeData = null;
		for (Curiosidade Curiosidade:curiosidades)
		{
			if (Curiosidade.getCuriosidade().equals(update.message().text()))
				{
					curiosidadeData = Curiosidade.getMais();
				}
		}
		if(curiosidadeData != null)
		{
			this.notifyObservers(update.message().chat().id(), curiosidadeData);
		}
		else
		{
			this.notifyObservers(update.message().chat().id(), "Não sei curiosidades sobre isso.");
		}
			
		
	}
	
	//Satelite
	public void searchSatelite(Update update) 
	{
		String sateliteData = null;
		for (Satelite Satelite:satelites)
		{
			if (Satelite.getName().equals(update.message().text()))
				{
					sateliteData = Satelite.getField();
				}
		}
		if(sateliteData != null)
		{
			this.notifyObservers(update.message().chat().id(), sateliteData);
		}
		else
		{
			this.notifyObservers(update.message().chat().id(), "Satélite não encontrado.");
		}
			
		
	}
	
	//Cometa
	public void searchCometa(Update update) 
	{
		String cometaData = null;
		for (Cometa Cometa:cometas)
		{
			if (Cometa.getName().equals(update.message().text()))
				{
					cometaData = Cometa.getField();
				}
		}
		if(cometaData != null)
		{
			this.notifyObservers(update.message().chat().id(), cometaData);
		}
		else
		{
			this.notifyObservers(update.message().chat().id(), "Cometa não encontrado.");
		}
			
		
	}




}
