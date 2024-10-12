package bancoH;

public class Conta {

	double saldo;
	int agencia;
	int numero;
	String titular ;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		
		if (valor < this.saldo) {
			this.saldo -= valor;
		} 
	}

	public boolean transfere(double valor, Conta destino) {
		System.out.println();
		destino.deposita(valor);
		return true;	
	}
	
	
}
