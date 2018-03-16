import java.util.Scanner;

public class fazendaRaiz {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long C = scanner.nextLong();
		while (C != 0) {
			long P = scanner.nextLong();
			
			long y = (P - (2*C) ) / 2;
			long x = C - y;
			System.out.println(x + " " + y);
			C = scanner.nextLong();			
		}
		scanner.close();
		
	}

}
