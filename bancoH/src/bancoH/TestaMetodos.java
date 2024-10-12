package bancoH;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaBruno = new Conta();

		contaBruno.deposita(1000);
		contaBruno.saca(900);
		
		Conta contaEdimar = new Conta();
		contaEdimar.deposita(10000);
		//                    valor   conta Destino
		contaEdimar.transfere(50, contaBruno);
		
		System.out.println("");
		System.out.println("O saldo do Edimar é : " + contaEdimar.saldo + "$");
		System.out.println("O saldo do Bruno é : " + contaBruno.saldo + "$");
	}
}
