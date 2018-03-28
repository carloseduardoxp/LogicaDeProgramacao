import java.util.Scanner;

public class URI1332 {

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
				char pos0 = numero.charAt(0);
				if (pos0 == 't') {
					quantos2++;
				} else if (pos0 == 'o') {
					quantos1++;
				}
				char pos1 = numero.charAt(1);
				if (pos1 == 'w') {
					quantos2++;
				} else if (pos1 == 'n') {
					quantos1++;
				}
				char pos2 = numero.charAt(2);
				if (pos2 == 'o') {
					quantos2++;
				} else if (pos2 == 'e') {
					quantos1++;
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
