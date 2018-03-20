import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int dentroIntervalo = 0;
		int foraIntervalo = 0;
		while (N > 0) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				dentroIntervalo = dentroIntervalo + 1;
			} else {
				foraIntervalo = foraIntervalo + 1;
			}
			N = N - 1;
		}
		System.out.println(dentroIntervalo+" in");
		System.out.println(foraIntervalo+" out");
		sc.close();
	}

}
