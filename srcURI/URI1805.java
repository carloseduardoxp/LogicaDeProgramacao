import java.util.Scanner;

public class URI1805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long total = 0;
		while (A <= B) {
			total += A;
			A++;
		}
		System.out.println(total);

	}

}
