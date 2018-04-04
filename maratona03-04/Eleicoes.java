import java.util.Scanner;

public class Eleicoes {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int voto = sc.nextInt();
		int vegeta = 0;
		int kakaroto = 0;
		int branco = 0;
		int nulo = 0;
		int total = 0;
		do {
			if (voto == 100) {
				vegeta++;
			} else if (voto == 200) {
				kakaroto++;
			} else if (voto == -1) {
				branco++;
			} else if (voto == 300) {
				nulo++;
			}
			total++;
			voto = sc.nextInt();
		} while (voto != 0);
		System.out.println(vegeta+" votos para o candidato Vegeta");
		System.out.println(kakaroto+" votos para o candidato Kakaroto");
		System.out.println(branco+" votos em branco");
		System.out.println(nulo+" votos nulo");
		System.out.println("Total: "+total+" votos");
		if (vegeta > kakaroto) {
			System.out.println("Candidato Eleito: Vegeta");
		} else {
			System.out.println("Candidato Eleito: Kakaroto");
		}
	}

}
