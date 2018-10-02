import java.util.Calendar;
import java.util.HashMap;

public abstract class AtendenteStrategy{
	
	private String login;
	private HashMap callCenters;
	private HashMap ilhas;
	private HashMap segmentos;
	private Calendar inicioVigencia;
	private String origemCadastro;
	
	public String getLogin() {
		return login;
	}
	
	public HashMap getCallCenters() {
		return callCenters;
	}
	
	public HashMap getIlhas() {
		return ilhas;
	}
	
	public HashMap getSegmentos() {
		return segmentos;
	}
	
	public Calendar getInicioVigencia() {
		return inicioVigencia;
	}
	
	public String getOrigemCadastro() {
		return origemCadastro;
	}
	
	public abstract Object saveParameter();
	
}
