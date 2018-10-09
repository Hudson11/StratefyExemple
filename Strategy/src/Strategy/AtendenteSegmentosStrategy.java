package Strategy;

public class AtendenteSegmentosStrategy extends AtendenteStrategy{

	public Object[] parans;
	
	public AtendenteSegmentosStrategy(){}
	
	@Override
	public Object saveParameter() {
		// TODO Auto-generated method stub
		parans = new Object[5];
		parans[0] = getCallCenters();
		parans[1] = getLogin();
		parans[2] = getInicioVigencia();
		parans[3] = getOrigemCadastro();
		parans[4] = getIlhas();
		parans[5] = getSegmentos();
		return parans;
	}

	public Object[] getParans() {
		return parans;
	}
	
}


