package sintaxeVariavelEFluxo;

public class For2Urrul {

	public static void main(String[] args) {

		for (int linha = 1; linha <= 10; linha++) {

			for (int coluna = 1; coluna <= linha; coluna++) {
				
				System.out.print("  *  ");
			}
			
			System.out.println("");
		}

	}
}
