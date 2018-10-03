package State;

public class saldoPositivo implements IContaState{
	
	private Conta conta;
	
	public saldoPositivo(Conta conta){
		this.conta = conta;
	}
	
	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		this.conta.saldo -= valor;
		
		if(this.conta.saldo < 0){
			if(this.conta.saldo < -100.00){
				System.out.println("Conta Bloqueada, Saldo atual: "+this.conta.saldo);
				this.conta.estado = new Bloqueado(this.conta);
			}else{
				System.out.println("Saldo Negativo, Saldo atual: "+this.conta.saldo);
				this.conta.estado = new saldoNegativo(this.conta); 
			}
		}
	System.out.println("Saldo positivo, Saldo atual: "+this.conta.saldo);
	}
	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		this.conta.saldo += valor;
		
		if(this.conta.saldo < 0){
			if(this.conta.saldo < -100.00){
				System.out.println("Conta Bloqueada, Saldo atual: "+this.conta.saldo);
				this.conta.estado = new Bloqueado(this.conta);
			}else{
				System.out.println("Saldo Negativo, Saldo Atual: "+this.conta.saldo);
				this.conta.estado = new saldoNegativo(this.conta); 
			}
		}
		System.out.println("Saldo positivo, Saldo atual: "+this.conta.saldo);
	}

}
