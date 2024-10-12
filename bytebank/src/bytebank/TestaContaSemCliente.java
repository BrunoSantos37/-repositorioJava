package bytebank;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		
	Conta contaDaMarcela = new Conta();
	
	contaDaMarcela.titular = new Cliente();
	contaDaMarcela.titular.nome = "oi";
	System.out.println(contaDaMarcela.titular.nome);
	
	contaDaMarcela.deposita(100);
	System.out.println(contaDaMarcela.getSaldo());
	  
	}
}
