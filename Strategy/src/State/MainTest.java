package State;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta;
		conta = new Conta(2000);
		
		conta.deposito(1000);
		conta.saque(4000);
		conta.deposito(899);
		conta.deposito(1);
		conta.deposito(99);
		conta.deposito(1);
		conta.deposito(1000);
		conta.saque(200);
		conta.saque(200);
		conta.saque(200);
	}

}
