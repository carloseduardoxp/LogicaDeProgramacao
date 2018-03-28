import java.util.Scanner;

public class URI1332Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		while (N > 0) {
			N--;
			String numero = sc.nextLine();
			if (numero.length() == 5) {
				System.out.println("3");
			} else {
				int quantos1 = 0;
				int quantos2 = 0;
				for (int i = 0; i < numero.length(); i++) {
					if ((numero.charAt(i) == 't' && i == 0) || (numero.charAt(i) == 'w' && i == 1)
							|| (numero.charAt(i) == 'o' && i == 2)) {
						quantos2++;
					}
					if ((numero.charAt(i) == 'o' && i == 0) || (numero.charAt(i) == 'n' && i == 1)
							|| (numero.charAt(i) == 'e' && i == 2)) {
						quantos1++;
					}
				}
				if (quantos2 > quantos1) {
					System.out.println("2");
				} else {
					System.out.println("1");
				}

			}

		}

	}

}
