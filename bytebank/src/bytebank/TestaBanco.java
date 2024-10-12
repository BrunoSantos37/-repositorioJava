package bytebank;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente bruno = new Cliente();
		
		bruno.nome = "Bruno Candido";
		bruno.cpf = "123.456.789-00";
		bruno.profissao = "Software Engineer";
		
		//objeto do tipo conta
		Conta contaDoBruno = new Conta();
		contaDoBruno.deposita(19);
		
		Conta contaDaMarcela = new Conta();
		//Titular da conta se referencia para o objeto cliente criado
		contaDoBruno.titular = bruno;
		
		contaDoBruno.getSaldo();
		contaDoBruno.transfere(51, contaDaMarcela);
		System.out.println("Saldo do "+ bruno.nome + " = " + contaDoBruno.getSaldo());
		System.out.println();
		
		Cliente marcela = new Cliente();
		marcela.nome = "marcela";
		System.out.println("Saldo da "+marcela.nome + " = " + contaDaMarcela.getSaldo());
		
		contaDaMarcela.getSaldo();
	}
	 
	
}
