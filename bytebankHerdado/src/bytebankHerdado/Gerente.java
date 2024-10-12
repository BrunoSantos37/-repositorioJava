package bytebankHerdado;
//classe Gerente herda tudo do Funcionario
// " gerente também é um funcionário "
public class Gerente extends Funcionario {
	
	private int senha;
	
	public double getBonificacao() {
		// this quando há um atributo na mesma classe
		// super quando o atributo desejado está na classe mãe 
		return super.salario;
	}
	
	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		} return false;
	}
	
	public int getSenha() {
		return this.senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
