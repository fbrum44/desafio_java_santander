package desafio_java_santander;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(250);
		Conta cp = new ContaPoupanca();
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
