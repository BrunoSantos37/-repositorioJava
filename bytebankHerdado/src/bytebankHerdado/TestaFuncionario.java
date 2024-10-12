package bytebankHerdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Bruno","12345678900");
		
		
		  funcionario1.setSalario(1239.90);
		  System.out.println("O funcionário "+funcionario1.getNome()+" recebe "+funcionario1.getBonificacao()+" Reais");
		  funcionario1.setSalario(1890);
		  System.out.println(funcionario1.getSalario());;
		 
		Funcionario funcionario2 = new Funcionario("Edimar","5000");
		System.out.print(funcionario2.getNome()+": "+ funcionario2.getCpf() 
		+funcionario2.getSalario());
	}
	
}
