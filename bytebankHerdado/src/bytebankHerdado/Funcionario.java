package bytebankHerdado;

public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	
	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
