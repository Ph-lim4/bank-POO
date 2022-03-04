package Banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente ph = new Cliente();
		ph.setNome("PH"); 
		
		Conta cc = new ContaCorrente(ph);
		Conta poupanša = new ContaPoupanša(ph);
		cc.depositar(100);
		
		cc.transferir(50, poupanša);
		
		cc.imprimirEstrato();
		poupanša.imprimirEstrato();
	}

}
