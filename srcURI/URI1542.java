import java.util.Scanner;

public class URI1542 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		while (Q != 0) {
			int D = sc.nextInt();
			int P = sc.nextInt();

			int paginas = (Q * D * P) / (P - Q);
			if (paginas > 1) {
				System.out.println(paginas + " paginas");
			} else {
				System.out.println(paginas + " pagina");
			}
			Q = sc.nextInt();
		}

	}

}
