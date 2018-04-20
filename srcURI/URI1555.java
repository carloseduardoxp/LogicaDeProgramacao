import java.util.Scanner;

public class URI1555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			double fRafael = Math.pow(3 * x,2) + Math.pow(y,2);
			double fBeto = (2 * Math.pow(x,2)) + Math.pow(5 * y,2);
			double fCarlos = (-100 * x) + Math.pow(y,3);
			if (fRafael > fBeto && fRafael > fCarlos) {
				System.out.println("Rafael ganhou");
			} else if (fBeto > fRafael && fBeto > fCarlos) {
				System.out.println("Beto ganhou");
			} else {
				System.out.println("Carlos ganhou");
			}
		} 

	}

}
