package Banco;

public class ContaPoupanša extends Conta{

	public ContaPoupanša(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirEstrato() {
		System.out.println("Extrato conta poupanša: ");
		super.imprimirInformacoesComuns();
		System.out.println("----------------------- ");
		
		
	}
	
}
