import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 0) {
			System.out.println("Não existe fatorial de número negativo");
		} else {
			long total = 1;
			while (N > 1) {
				total *= N;
				//total = total * N;
				N--;
				//N = N - 1;
			}
			System.out.println("o fatorial vale "+total);
		}
		sc.close();
	}

}
