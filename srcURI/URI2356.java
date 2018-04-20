import java.util.Scanner;

public class URI2356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String D = sc.nextLine();
			String S = sc.nextLine();
			if (D.contains(S)) {
				System.out.println("Resistente");
			} else {
				System.out.println("Nao resistente");
			}
		}
		sc.close();
	}

}
