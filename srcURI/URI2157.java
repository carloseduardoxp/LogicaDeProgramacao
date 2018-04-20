import java.util.Locale;
import java.util.Scanner;

public class URI2157 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int B = sc.nextInt();
			int E = sc.nextInt();
			//B = 1 E = 5   12345
			String texto = "";
			for (int j = B;j<=E;j++) {
				texto += j;
			}
			System.out.print(texto);
			for (int j = texto.length()-1;j>=0;j--) {
				System.out.print(texto.charAt(j));
			}
			System.out.println("");
		}
	}

}




