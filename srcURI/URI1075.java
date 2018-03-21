import java.util.Scanner;

public class URI1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= 10000; i++) {
			if (i % N == 2) {
				System.out.println(i);
			}
		}
		
//		
//		int i = 1;
//		while (i < 10000) {
//			if (i % N == 2) {
//				System.out.println(i);
//			}
//			i = i + 1;
//		}
		sc.close();
	}

}
