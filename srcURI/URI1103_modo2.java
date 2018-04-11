import java.util.Scanner;

public class URI1103_modo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		while (h1 != 0 || m1 != 0 || h2 != 0 || m2 != 0) {
			int minTotal1 = (h1 * 60) + m1;
			int minTotal2 = (h2 * 60) + m2;
			if (minTotal1 <= minTotal2) {
				System.out.println(minTotal2-minTotal1);
			} else {
				//1440 = 24 (horas) * 60 (minutos)
				int meiaNoite = 1440 - minTotal1 + minTotal2;
				System.out.println(meiaNoite);
			}
			h1 = sc.nextInt();
			m1 = sc.nextInt();
			h2 = sc.nextInt();
			m2 = sc.nextInt();
		}
	}
}
