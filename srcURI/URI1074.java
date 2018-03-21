import java.util.Scanner;

public class URI1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N > 0) {
			int X = sc.nextInt();
			if (X == 0) {
				System.out.println("NULL");
			//POSITIVE
			} else if (X > 0) {
				if (X % 2 == 0) {
					System.out.println("EVEN POSITIVE");
				} else {
					System.out.println("ODD POSITIVE");
				}
			//NEGATIVE
			} else {
				if (X % 2 == 0) {
					System.out.println("EVEN NEGATIVE");
				} else {
					System.out.println("ODD NEGATIVE");
				}
			}
			N = N -1;
//			
//			
//			else if (X < 0 && X % 2 == 0) {
//				System.out.println("EVEN NEGATIVE");
//			} else if (X > 0 && X % 2 == 0) {
//				System.out.println("EVEN POSITIVE");
//			} else if (X > 0 && X % 2 == 1) {
//				System.out.println("ODD POSITIVE");
//			} else if (X < 0 && X % 2 == -1){
//				System.out.println("ODD NEGATIVE");
//			}
		}

	}

}
