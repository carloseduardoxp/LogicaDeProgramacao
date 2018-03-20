import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int menor = Y;
		int maior = X;
		if (menor > X) {
			menor = X;
			maior = Y;
		}
		int soma = 0;
		menor = menor+1;
		while (menor < maior) {
			if (menor % 2 != 0) {
				soma = soma + menor;	
			}
			menor = menor + 1;
		}
		System.out.println(soma);
		sc.close();
	}

}
