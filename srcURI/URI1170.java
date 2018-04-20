import java.util.Locale;
import java.util.Scanner;

public class URI1170 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double valor = sc.nextDouble();
			int dias = 0;
			while (valor > 1) {
				dias++;
				valor /= 2;
			}
			System.out.println(dias+" dias");
		}
				

	}

}
