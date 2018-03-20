import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int numero = 1;
		while (numero <= X) {
			System.out.println(numero);
			numero = numero + 2;
		}
		sc.close();
	}

}
