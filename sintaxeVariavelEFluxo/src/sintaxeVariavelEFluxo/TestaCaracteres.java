package sintaxeVariavelEFluxo;

public class TestaCaracteres {

	public static void main(String[] args) {

		char letter = 66;
		letter = (char) (letter + 5);
		System.out.println(letter);

		String frase = "JAVA é o trem!!!!";

		frase = frase + " Mas é necessário!";
		System.out.println(frase);

		if (5 > 4) {
			System.out.println(5 + " É maior do que " + 4);
		}

	}
}
