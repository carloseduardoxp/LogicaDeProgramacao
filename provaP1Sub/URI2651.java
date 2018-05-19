import java.util.Scanner;

public class URI2651 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		String padrao1 = "zelda";
		String padrao2 = "ZELDA";
		int pos = 0;
		int posPadrao = 0;
		
		while (pos < nome.length() && posPadrao < padrao1.length()) {
			char c = nome.charAt(pos);
			if (c == padrao1.charAt(posPadrao) || 
				c == padrao2.charAt(posPadrao)) {
				posPadrao++;
			} else {
				posPadrao = 0;
			}
			pos++;
		}
		
		if (posPadrao == padrao1.length()) {
			System.out.println("Link Bolado");
		} else {
			System.out.println("Link Tranquilo");
		}
		

	}

}
