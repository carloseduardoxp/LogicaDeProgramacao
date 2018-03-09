import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f\n",(horas * valor));
		sc.close();
	}

}
