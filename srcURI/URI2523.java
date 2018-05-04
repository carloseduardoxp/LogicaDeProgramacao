import java.util.Scanner;

public class URI2523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean leu = false;
		while (sc.hasNext()) {
			if (leu) {
				sc.nextLine();
			}
			String a = sc.nextLine();
			//sc.nextLine();
			int  qtos = sc.nextInt();
			for (int i = 0; i < qtos;i++) {
				int pos = sc.nextInt();
				System.out.print(a.charAt(pos-1));
			}
			System.out.println("");
			leu = true;
		}

	}

}
