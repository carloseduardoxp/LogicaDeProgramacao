import java.util.Scanner;

public class URI1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N = 3
		int N = sc.nextInt();
		sc.nextLine();
		while (N > 0) {
			N--;
			String V = sc.nextLine();
			//V = 115380
			int quantos = 0;
			for (int i = 0; i < V.length(); i++) {
				char c = V.charAt(i);
				if (c == '1') {
					quantos += 2;
				} else if (c == '2' || c == '3' || c == '5') {
					quantos += 5;
				} else if (c == '4') {
					quantos += 4;
				} else if (c == '6' || c == '9' || c == '0') {
					quantos += 6;
				} else if (c == '7') {
					quantos += 3;
				} else if (c == '8') {
					quantos += 7;
				}
			}
			System.out.println(quantos+" leds");
		}
	}

}
