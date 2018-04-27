import java.util.Scanner;

public class URI2253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String senha = sc.nextLine();
			if (senha.length() < 6 || senha.length() > 32) {
				System.out.println("Senha invalida.");
			} else {
				boolean numero = false;
				boolean maiusculo = false;
				boolean minusculo = false;
				boolean invalido = false;
				for (int i = 0; i < senha.length();i++) {
					char c = senha.charAt(i);
					if (c >= 'a' && c <= 'z') {
						minusculo = true;
					} else if (c >= 'A' && c <= 'Z') {
						maiusculo = true;
					} else if (c >= '0' && c <= '9') {
						numero = true;
					} else {
						invalido = true;
					}
				}
				if (numero && maiusculo && minusculo && !invalido) {
					System.out.println("Senha valida.");
				} else {
					System.out.println("Senha invalida.");
				}
			}
		}

	}

}
