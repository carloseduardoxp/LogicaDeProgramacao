import java.util.Scanner;

public class URI1329 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int mary = 0;
			int john = 0;
			for (int i = 0; i < n; i++) {
				int valor = sc.nextInt();
				if (valor == 0) {
					mary++;
				} else {
					john++;
				}
			}
			System.out.println("Mary won "+mary+" times and John won "+john+" times");
			n = sc.nextInt();
		}

	}

}
