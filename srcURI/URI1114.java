import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		do {
			senha = sc.nextInt();
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Senha Invalida");
			}
			
		} while (senha != 2002);
		sc.close();
	}

}
