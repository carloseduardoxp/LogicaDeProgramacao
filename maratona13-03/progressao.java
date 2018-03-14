import java.util.Scanner;

public class progressao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a1 = sc.nextInt();
		int r = sc.nextInt();
		
		int pa = a1 + ((n-1) * r);
		
		System.out.println(pa);
		
		sc.close();

	}

}
