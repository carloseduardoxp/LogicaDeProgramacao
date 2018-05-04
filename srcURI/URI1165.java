import java.util.Scanner;

public class URI1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int j = 2;
			int div = 0;
			while (div == 0 && j <= (x / 2)) {
				if (x % j == 0) {
					div++;
				}
				j++;
			}
			if (div == 0) {
				System.out.println(x+" eh primo");
			} else {
				System.out.println(x+" nao eh primo");
			}
		}


	}

}
