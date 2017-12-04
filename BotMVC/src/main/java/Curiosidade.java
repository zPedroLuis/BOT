
public class Curiosidade {

	private String textoCuriosidade;
	private String mais;
	
	public Curiosidade(String textoCuriosidade, String mais) {
		this.textoCuriosidade = textoCuriosidade;
		this.mais = mais;
		
	}
	
	public String getCuriosidade() {
		return textoCuriosidade;
	}
	public void setCuriosidade(String textoCuriosidade) {
		this.textoCuriosidade = textoCuriosidade;
	}
	
	public String getMais() {
		return mais;
	}
	public void setMais(String mais) {
		this.mais = mais;
	}
}
