package Banco;

public class ContaPoupan�a extends Conta{

	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirEstrato() {
		System.out.println("Extrato conta poupan�a: ");
		super.imprimirInformacoesComuns();
		System.out.println("----------------------- ");
		
		
	}
	
}
