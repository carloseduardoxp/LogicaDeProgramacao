import java.util.Scanner;

public class URI1240 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n;i++) {
			String A = sc.next();
			String B = sc.next();
			if (A.length() < B.length()) {
				System.out.println("nao encaixa");
			} else {
				int posFinalA = A.length() - 1;
				int posFinalB = B.length() - 1;
				boolean encaixa = true;
				while (posFinalB >= 0 && encaixa == true) {
					if (A.charAt(posFinalA) != B.charAt(posFinalB)) {
						encaixa = false;
					}
					posFinalB--;
					posFinalA--;
				}
				if (encaixa == true) {
					System.out.println("encaixa");
				} else {
					System.out.println("nao encaixa");
				}
			}
			
			
		}

	}

}
