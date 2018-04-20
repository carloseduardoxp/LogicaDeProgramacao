import java.util.Scanner;

public class URI1585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int resp = (int) ((x / 2.0) * y);
			System.out.println(resp+" cm2");
		}

	}

}
