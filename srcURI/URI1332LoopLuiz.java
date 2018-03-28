import java.util.Scanner;

public class URI1332LoopLuiz {

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
				String one = "one";
				String two = "two";
				int quantos1 = 0;
				int quantos2 = 0;
				for (int i = 0; i < numero.length(); i++) {
					if (one.charAt(i) == numero.charAt(i)) {
						quantos1++;
					} else if (two.charAt(i) == numero.charAt(i)) {
						quantos2++;
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
