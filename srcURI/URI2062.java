import java.util.Scanner;

public class URI2062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		while (N > 0) {
			N--;
			String texto = sc.next();
			String textoImprimir = "";
			if (texto.length() == 3 && texto.charAt(0) == 'O' &&
					texto.charAt(1) == 'B') {
				textoImprimir = "OBI";
			} else if (texto.length() == 3 && texto.charAt(0) == 'U' &&
					texto.charAt(1) == 'R') {
				textoImprimir = "URI";
			} else {
				textoImprimir = texto;
		    }
			if (N == 0) {
				System.out.println(textoImprimir);
			} else {
				System.out.print(textoImprimir+" ");
			}
		}

	}

}
