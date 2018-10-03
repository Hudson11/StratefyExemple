package State;

public class saldoNegativo implements IContaState{
	private Conta conta;
	public saldoNegativo(Conta conta){
		this.conta = conta;
	}

	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		this.conta.saldo -= valor;
		
		if(this.conta.saldo < -100.00){
			System.out.println("Conta Bloqueada, saldo: "+this.conta.saldo);
			this.conta.estado = new Bloqueado(this.conta);
		}
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		this.conta.saldo += valor;
		
		if(this.conta.saldo >= -100.00){
			if(this.conta.saldo < 0){
				System.out.println("Saldo Negativo, Saldo atual: "+this.conta.saldo);
				this.conta.estado = new saldoNegativo(this.conta);
			}else{
				System.out.println("Saldo Positivo, Saldo atual: "+this.conta.saldo);
				this.conta.estado = new saldoPositivo(this.conta);
			}
		}
	}
}
