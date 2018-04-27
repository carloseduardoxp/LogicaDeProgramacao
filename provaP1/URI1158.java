import java.util.Scanner;

public class URI1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			if (X % 2 == 0) {
				X++;
			}
			int total = 0;
			for (int j = 0; j < Y; j++) {
				total += X;
				X+=2;
			}
			System.out.println(total);
		}

	}

}
