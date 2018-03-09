import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		double comissao = vendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f\n",(salarioFixo + comissao));
		
		sc.close();
		
		
	}

}
