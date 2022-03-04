package Banco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirEstrato() {
		System.out.println("Extrato conta Corrente: ");
		super.imprimirInformacoesComuns();	
		System.out.println("----------------------- ");
	}


}
	
	

