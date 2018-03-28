import java.util.Scanner;

public class URI1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int posicao = 0;
		for (int i = 1; i <= 100; i++) {
			int lido = sc.nextInt();
			if (lido > maior) {
				maior = lido;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);

	}

}
