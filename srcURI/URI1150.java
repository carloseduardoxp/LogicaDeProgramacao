import java.util.Scanner;

public class URI1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int z = Integer.MIN_VALUE;
		while (z <= x) {
			z = sc.nextInt();
		}
		int total = 0;
		int quantos = 0;
		while (total <= z) {
			total += x;
			x++;
			quantos++;
		}
		System.out.println(quantos);

	}

}
