package sintaxeVariavelEFluxo;

public class TestaFor {

	public static void main(String[] args) {
		
		int ultimoNumero = 10;
		int somaTotal = 0;
		
		for(int i = 0; i <= ultimoNumero; i++) {
			System.out.println("Este é o valor de i neste EXATO momento: " + i);
			somaTotal += i;
			
			System.out.println("Este é a soma neste EXATO momento: " + somaTotal);
			System.out.println("------------------------------------------------");
			System.out.println("");
		}
		
	}
	
}
