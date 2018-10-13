
public class Conta {
	private float saldo;
	private int agencia;
	Cliente titular = new Cliente();
	private static int totalDeContas = 0;
	private static int numeroDaConta = 3456;

	
	public  Conta(int agencia, int numeroDaConta){
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		Conta.totalDeContas++;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public float getSaldo(float saldo) {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero () {
		return this.numeroDaConta;
	}
	
	public void deposita(float depositar) {
		this.saldo += depositar;
	}

	public boolean saca(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(float valor ,Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
			
		
		
	}
	

}
