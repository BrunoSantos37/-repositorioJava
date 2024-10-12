package sintaxeVariavelEFluxo;

public class TestaValores {
	public static void main(String[] args) {

		double salario = 4930.0;

		if (salario >= 1900) {

			if (salario <= 2800) {
				System.out.println("IR é de 7.5% e pode deduzir na" + " declaração o valor de R$ 142");
			} else if (salario <= 3751.0) {
				System.out.println("o IR é de 15% e pode deduzir R$ 350");
			} else if (salario <= 4664) {
				System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
			} else {
				System.out.println("O seu salário é maior do que 4664 e eu não sei o imposto dele");
			}
		} else {
			System.out.println("O seu salario é tão baixo que o governo tem dó de lhe tomar! :)");
		}

	}
}
