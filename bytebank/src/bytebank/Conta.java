package bytebank;

public class Conta {

	// um atributo privado não pode ser nem modificado
	// e nem lido por outras classes que não seja
	// a mesma onde está ou pelos métodos da mesma classe
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			System.out.println("DEPOSITA ALGO NEGATIVO JÃO???");
			return false;
		}
	}

	public void saca(double valor) {

		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("sem saldo suficiente para depositar amigão ");
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo ;
	}

}
