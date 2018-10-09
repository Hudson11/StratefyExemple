package Strategy;
import java.util.Calendar;
import java.util.HashMap;

public abstract class AtendenteStrategy{
	
	private String login;
	private String callCenters;
	private String ilhas;
	private String segmentos;
	private String inicioVigencia;
	private String origemCadastro;
	
	
	public String getLogin() {
		return "Login usuario";
	}

	public String getCallCenters() {
		return "Call center";
	}

	public String getIlhas() {
		return "Ilhas";
	}

	public String getSegmentos() {
		return "Segmentos";
	}

	public String getInicioVigencia() {
		return "Incicio da Vigencia";
	}

	public String getOrigemCadastro() {
		return "Origem do cadastro";
	}



	public abstract Object saveParameter();
	
}
