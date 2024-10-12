
public class TestaGetESet {

	public static void main(String[] args) {
		Conta contaDoBruno = new Conta(2,59);
		//System.out.println(contaDoBruno.getNumero());

		Cliente bruno = new Cliente("bruno","12345678900");
		
		//Se referencia o objeto cliente para o titular da conta 
		//com o método abaixo
		contaDoBruno.setTitular(bruno);
		
		bruno.setProfissao("Software-Engineer");
		
		
		System.out.println(contaDoBruno.getTitular().getNome() + 
				" é " + bruno.getProfissao());
		
		
		//contaDoBruno.setNumero(5);
		System.out.println(contaDoBruno.getAgencia());
		System.out.println(contaDoBruno.getNumero());

		//contaDoBruno.setAgencia(123);
		
	}
}
