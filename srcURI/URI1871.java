import java.util.Scanner;

public class URI1871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		while (m != 0 || n != 0) {
			int resp = m + n;
			String respS = resp+"";
			for (int i = 0; i < respS.length();i++) {
				if (respS.charAt(i) != '0') {
					System.out.print(respS.charAt(i));
				}
			}
			System.out.println("");
			m = sc.nextInt();
			n = sc.nextInt();
		}
		

	}

}
