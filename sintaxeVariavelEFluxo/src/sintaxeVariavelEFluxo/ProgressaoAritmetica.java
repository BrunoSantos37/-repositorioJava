package sintaxeVariavelEFluxo;

public class ProgressaoAritmetica {
	
	public static void main(String[] args) {
		
		int i = 20;
		int somaTotal = 0;
		int ultimoValor = 30;
		
		while(i <= ultimoValor) {
			//System.out.println(i);
			somaTotal += i;
			System.out.println(somaTotal);
			i++;
		}
		System.out.println(i);
		System.out.println("A soma de valores de 0 até " + ultimoValor + " é " + somaTotal);
		
		
	}
	
}
