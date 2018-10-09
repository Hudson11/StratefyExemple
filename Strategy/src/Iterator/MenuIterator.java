package Iterator;

public class MenuIterator implements Iterator{
	
	
	private MenuItem[] itens;
	private int posicao = 0;
	
	public MenuIterator(MenuItem[] itens){
		this.itens = itens;
	}
	
	@Override
	public Object next() {
		MenuItem item = itens[posicao];
		posicao++;
		return item;
	}

	@Override
	public boolean hasNext() {
		if(posicao >= itens.length || itens[posicao] == null){
			System.out.println("Não Item para Iteragir");
			return false;
		}
		System.out.println("Há item para iteragir");
		return true;
	}
	
	@Override
	public String toString(){
		return "item: "+itens.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuItem[] itens = new MenuItem[]{
			new MenuItem("Hudson"),
			new MenuItem("Andrade"),
			new MenuItem("Ayrton"),
			new MenuItem("Antonio"),
			new MenuItem("Alan"),
			new MenuItem("Taniro"),
			new MenuItem("França"),
			new MenuItem("Iron"),
		};
		
		MenuIterator menu = new MenuIterator(itens);
		
		//for(int i = 0; i < menu.itens.length; i++){
		while(menu.hasNext()){
			System.out.println(menu.next().toString());
			//menu.hasNext();
		}
	}
	
}
