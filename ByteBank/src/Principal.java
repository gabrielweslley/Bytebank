
public class Principal {
	public static void main(String[] args) {
		
		
		Conta c1 = new Conta(163168, 1234);
		//usando os sets..
		c1.titular.setNome("gabriel");
		c1.titular.setCpf("123456");
		c1.titular.setProfissao("programador");
		
		//usando os metodos Depositar Sacar
		c1.deposita(500);
		c1.saca(300);
		//mostrando na tela se o saque foi autorizado ou nao
		boolean autorizaSaque = c1.saca(600);
		System.out.println(autorizaSaque);		

		//gets..
		System.out.println("nome " + c1.titular.getNome());
		System.out.println("cpf " + c1.titular.getCpf());
		System.out.println("profissao " + c1.titular.getProfissao());
		

		System.out.println("sua agencia e " + c1.getAgencia());
		System.out.println("seu saldo e " + c1.getSaldo(0));
		System.out.println("o numero da sua conta e " + c1.getNumero());

		
		Conta c2 = new Conta(163168, 1234);
		c2.titular.setNome("paulo");;
		c2.titular.setCpf("123455");
		c2.titular.setProfissao("analista");
		
		//usando os metodos Depositar Sacar
		c2.deposita(600);
		c2.saca(300);
		//mostrando na tela se o saque foi autorizado ou nao
		autorizaSaque = c2.saca(600);
		System.out.println(autorizaSaque);		

		//gets..
		System.out.println("nome " + c2.titular.getNome());
		System.out.println("cpf " + c2.titular.getCpf());
		System.out.println("profissao " + c2.titular.getProfissao());
		

		System.out.println("sua agencia e " + c2.getAgencia());
		System.out.println("seu saldo e " + c2.getSaldo(0));
		System.out.println("o numero da sua conta e " + c2.getNumero());

		
		//metodo que tranfere da conta c2 para c1
		c2.deposita(400);
		boolean sucesso = c2.transfere(50, c1);
		if (sucesso == true) {
			System.out.println("tranferencia realizada com sucesso");
		}else {
			System.out.println("dinheiro insuficiente");
		}
		//para mostrar na tela o numero de contas abertas
		System.out.println(Conta.getTotalDeContas());
	} 
	

}
