package Banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente ph = new Cliente();
		ph.setNome("PH"); 
		
		Conta cc = new ContaCorrente(ph);
		Conta poupan�a = new ContaPoupan�a(ph);
		cc.depositar(100);
		
		cc.transferir(50, poupan�a);
		
		cc.imprimirEstrato();
		poupan�a.imprimirEstrato();
	}

}
