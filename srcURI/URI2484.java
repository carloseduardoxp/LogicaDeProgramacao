import java.util.Scanner;

public class URI2484 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//EOF
		while (sc.hasNext()) {
			String entrada = sc.nextLine();
			int espacosBranco = 0;
			for (int i = entrada.length() -1 ; i >=0; i--) {
				
				int posBranco = 0;
				while (posBranco < espacosBranco) {
					System.out.print(" ");
					posBranco++;
				}
				
				int pos = 0;
				while (pos <= i) {
					if (pos > 0) {
						System.out.print(" ");
					}
					System.out.print(entrada.charAt(pos));
					pos++;
				}
				System.out.println("");
 				espacosBranco++;
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
