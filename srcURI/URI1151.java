import java.util.Scanner;

public class URI1151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fib_nmenos1 = 1; //fib2
		int fib_nmenos2 = 0; //fib1
		if (n == 1) {
			System.out.println("0");
		} else {
			System.out.print("0 1");
			for (int i = 3; i <= n; i++) {
				int fib_atual = fib_nmenos1 + fib_nmenos2;
				System.out.print(" "+fib_atual);
				fib_nmenos2 = fib_nmenos1;
				fib_nmenos1 = fib_atual;
			}
			System.out.println("");
		}

		
		sc.close();
	}

}
