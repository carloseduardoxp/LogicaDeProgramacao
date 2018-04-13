import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int inicio = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(inicio+" "+(inicio+1)+" "+(inicio+2)+" PUM");
			inicio += 4;
		}

	}

}
