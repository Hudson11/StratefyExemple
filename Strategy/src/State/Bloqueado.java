package State;

public class Bloqueado implements IContaState{
	private Conta conta;
	public Bloqueado(Conta conta){
		this.conta = conta;
	}
	@Override
	public void saque(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Conta bloqueada, Saldo atual: "+this.conta.saldo);
		return;
	}
	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		this.conta.saldo += valor;
		
		if(this.conta.saldo < 0){
			if(this.conta.saldo < -100.00){
				this.conta.estado = new Bloqueado(this.conta);
				System.out.print("Conta Bloqueada, ");
			}else if(this.conta.saldo >= 0){
				this.conta.estado = new saldoPositivo(this.conta);
				System.out.print("Saldo Positivo, ");
			}else{
				this.conta.estado = new saldoNegativo(this.conta);
				System.out.print("Saldo Negativo, ");
			}
		}
		System.out.println("Saldo atual: "+this.conta.saldo);
	}
}
