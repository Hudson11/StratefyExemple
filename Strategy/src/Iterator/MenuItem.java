package Iterator;

public class MenuItem {
	
	String nome;
	
	public MenuItem(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return ""+getNome();
	}
	
}
