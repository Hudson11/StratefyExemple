package Strategy;
public class Contexto {
	
	private AtendenteStrategy atendenteStrategy = null;
	
	public void configuraAtendente(){
		atendenteStrategy.saveParameter();
	}

	public AtendenteStrategy getAtendenteStrategy() {
		return atendenteStrategy;
	}

	public void setAtendenteStrategy(AtendenteStrategy atendenteStrategy) {
		this.atendenteStrategy = atendenteStrategy;
	}

}


