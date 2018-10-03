package Strategy;

public class AtendenteIlhasStrategy extends AtendenteStrategy{
	
	private Object[] parans;
	
	@Override
	public Object saveParameter() {
		// TODO Auto-generated method stub
		parans = new Object[5];
		parans[0] = getCallCenters();
		parans[1] = getLogin();
		parans[2] = getInicioVigencia();
		parans[3] = getOrigemCadastro();
		parans[4] = getIlhas();
		return parans;
	}
}
