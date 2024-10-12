package sintaxeVariavelEFluxo;

public class TestaLacoEncadeado {

	public static void main(String[] args) {
		
		for(int multiplicador1 = 1; multiplicador1 <= 10; multiplicador1++) {
			
			for(int multiplicador2 = 1; multiplicador2 <= 10; multiplicador2++ ) {
				
				int produto  = multiplicador1 * multiplicador2;
				
				System.out.print(" - " + produto);
				
			}
			
			System.out.println("");
			
		}
	} 
	
}
