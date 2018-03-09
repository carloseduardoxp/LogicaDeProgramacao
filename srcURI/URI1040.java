import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		//DecimalFormat df = new DecimalFormat("0.0");
		
		float media = ( (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1) ) / 10;
		
		System.out.printf("Media: %.1f\n",media);
		
		if (media >= 7.0) {			
			System.out.println("Aluno aprovado.");
		} else if (media <= 4.9) {			
			System.out.println("Aluno reprovado.");
		//entre 5.0 e 6.9	
		} else {
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",notaExame);
			float mediaFinal = (notaExame + media) / 2;
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n",mediaFinal);
		}
		sc.close();
	}

}
