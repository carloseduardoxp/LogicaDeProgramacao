import java.util.Locale;
import java.util.Scanner;

public class contaRaiz {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		//int i = 1;
		//while (i <= N) {
		while (N > 0) {
			int homens = scanner.nextInt();
			int mulheres = scanner.nextInt();
			int cerveja = scanner.nextInt();
			int refri = scanner.nextInt();
			int porcoes = scanner.nextInt();

			double total = (homens * 10) + (mulheres * 8) + (cerveja * 6) + 
					       (refri * 3) + (porcoes * 40);

			if (total < 100) {
				total += 3 * (homens + mulheres);
			}
			System.out.printf("%.2f\n", total);
			//incrementa o valor de i 
			//i++;
			N--;
		}	
		scanner.close();
	}

}
