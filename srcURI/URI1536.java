import java.util.Scanner;

public class URI1536 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int M1 = sc.nextInt();
			sc.next();
			int V1 = sc.nextInt();
			int M2 = sc.nextInt();
			sc.next();
			int V2 = sc.nextInt();
			int time1 = M1+V2;
			int time2 = M2+V1;
			if (time1 > time2 || 
				(time1 == time2 && V2 > V1)) {
				System.out.println("Time 1");
			} else if (time2 > time1 || 
					(time1 == time2 && V1 > V2)) {
				System.out.println("Time 2");
			} else {
				System.out.println("Penaltis");
			}
		}

	}

}
