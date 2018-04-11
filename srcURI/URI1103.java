import java.util.Scanner;

public class URI1103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int m1 = sc.nextInt();
		int h2 = sc.nextInt();
		int m2 = sc.nextInt();
		while (h1 != 0 || m1 != 0 || h2 != 0 || m2 != 0) {
			//while (!(h1 != 0 && m1 != 0 && h2 != 0 && m2 != 0)) {
			if (h1 < h2) {
				//1 5 3 5	
				//1 50 3 30 1 hora e 40 100 minutos
				int minutos1 = (h1 * 60) + m1;
				int minutos2 = (h2 * 60) + m2;
				System.out.println(minutos2 - minutos1);
			} else if (h1 == h2) {
				//21 33 21 10
				if (m1 <= m2) {
					System.out.println(m2 - m1);
				} else {					
					int minutos = (24 * 60) - (m1-m2);
					System.out.println(minutos);
				}
			//h1 > h2 
			} else {
				//23 59 0 34
				//18 59 10 50
				int meiaNoite = ((23 - h1) * 60) + (60 - m1);
				int minutos = meiaNoite + (h2 * 60) + m2;
				System.out.println(minutos);
			}
			
			h1 = sc.nextInt();
			m1 = sc.nextInt();
			h2 = sc.nextInt();
			m2 = sc.nextInt();
		}

	}

}
