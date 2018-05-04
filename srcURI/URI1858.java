import java.util.Scanner;

public class URI1858 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pos = -1;
		int valor = Integer.MAX_VALUE;
		for (int i = 1;i <= n; i++) {
			int t = sc.nextInt();
			if (valor > t ) {
				pos = i;
				valor = t;
			}
		}
		System.out.println(pos);
	}

}
