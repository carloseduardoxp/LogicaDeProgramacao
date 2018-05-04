import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double notaValida1 = -1;
		double notaValida2 = -1;
		while (notaValida1 < 0 || notaValida2 < 0) {
			double nota = sc.nextDouble();
			if (nota >= 0 && nota <= 10) {
				if (notaValida1 < 0) {
					notaValida1 = nota;
				} else {
					notaValida2 = nota;
				}
			} else {
				System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f\n",(notaValida1+notaValida2)/2);

	}

}
