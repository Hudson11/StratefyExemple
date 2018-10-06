package State;

public class Conta {
	
	public double saldo;
	public IContaState estado;
	
	public Conta(){
		this.saldo = 0;
	}
	
	public Conta(double valor){
		this.estado = new saldoPositivo(this);
		this.deposito(valor);
	}
	
	public void saque(double valor){
		this.estado.saque(valor);
	}
	
	public void deposito(double valor){
		this.estado.deposito(valor);
	}
}
