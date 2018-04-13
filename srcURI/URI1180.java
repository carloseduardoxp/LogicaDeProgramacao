import java.util.Scanner;

public class URI1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int menor = Integer.MAX_VALUE;
		int posicao = -1;
		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			if (valor < menor) {
				menor = valor;
				posicao = i;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+posicao);

	}

}
