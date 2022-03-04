package Banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente ph = new Cliente();
		ph.setNome("PH"); 
		
		Conta cc = new ContaCorrente(ph);
		Conta poupança = new ContaPoupança(ph);
		cc.depositar(100);
		
		cc.transferir(50, poupança);
		
		cc.imprimirEstrato();
		poupança.imprimirEstrato();
	}

}
