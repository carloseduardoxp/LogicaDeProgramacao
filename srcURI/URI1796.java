import java.util.Scanner;

public class URI1796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int satisfatorio = 0;
		int naoSatisfatorio = 0;
		for (int i = 0; i < n; i++) {
			int q = sc.nextInt();
			if (q == 0) {
				satisfatorio++;
			} else {
				naoSatisfatorio++;
			}
		}
		if (satisfatorio > naoSatisfatorio) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}

	}

}
