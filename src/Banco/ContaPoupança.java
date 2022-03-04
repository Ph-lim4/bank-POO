package Banco;

public class ContaPoupança extends Conta{

	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirEstrato() {
		System.out.println("Extrato conta poupança: ");
		super.imprimirInformacoesComuns();
		System.out.println("----------------------- ");
		
		
	}
	
}
