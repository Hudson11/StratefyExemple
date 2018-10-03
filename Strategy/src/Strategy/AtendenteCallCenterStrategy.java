package Strategy;

public class AtendenteCallCenterStrategy extends AtendenteStrategy{

	private Object[] parans;
	
	@Override
	public Object saveParameter() {
		// TODO Auto-generated method stub
		parans = new Object[4];
		parans[0] = getCallCenters();
		parans[1] = getLogin();
		parans[2] = getInicioVigencia();
		parans[3] = getOrigemCadastro();
		return parans;
	}
}
