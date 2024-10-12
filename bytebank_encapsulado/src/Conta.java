// quando um método retorna algo ele para sua execução

public class Conta {

	// um atributo privado não pode ser nem modificado
	// e nem lido por outras classes que não seja
	// a mesma onde está ou pelos métodos da mesma classe
	private double saldo;
	private int agencia = 0000;
	private int numero = 0000;
	private Cliente titular;
	private static int totalContas; // static = um atributo da classe que não vai para o objeto

	// construtor
	public Conta(int agencia, int numero) {
		
		// Conta. substitui o this,já que totalContas não é de um objeto mais e sim de
		// uma classe
		Conta.totalContas++;

		if (agencia > 0 && numero > 0) {
			this.agencia = agencia;
			this.numero = numero;
			return;
		}
		System.out.println("POXA!Voce não informou uma agencia ou um numero" + "valido :(");
	}

	// total de contas
	//método da classe e não de um objeto
	public static int getTotalContas() {
		return Conta.totalContas;
	}

	// saldo
	// métodos

	// saldo
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

		if (valor < this.saldo) {
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
		return this.saldo;
	}

	// numero
	// numero
	public int getNumero() {
		return this.numero;
	}

	// agencia
	public int getAgencia() {
		return this.agencia;
	}

	// titular
// titular
	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}

	public Cliente getTitular() {
		return this.titular;
	}

}
