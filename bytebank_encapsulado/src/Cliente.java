
public class Cliente {

	private String nome; //atributo imútavel
	private String cpf; //atributo imútavel
	private String profissao;

	public Cliente(String nome, String cpf) {
		if (nome == "") {
			System.out.println("NOME INVÁLIDO");
		} else {
			this.nome = nome;
		}
		
		if (cpf.length() != 11) {
			System.out.println("CPF INVÁLIDO");
			return;
		}	this.cpf = cpf;
	}

	// nome
	public String getNome() {
		return this.nome;
	}

	// cpf
	public String getCpf() {
		return this.cpf;
	}

	// profissao
	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
