import java.util.Scanner;

public class Eleicoes {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		int vegeta = 0;
		int kakaroto = 0;
		int branco = 0;
		int nulo = 0;
		int voto;
		do {
			voto = sc.nextInt();
			switch(voto) {
				case 100: vegeta++; break;
				case 200: kakaroto++; break;
				case -1: branco++; break;
				case 300: nulo++; break;				
			}									
		} while (voto != 0);
		System.out.println(vegeta+" votos para o candidato Vegeta");
		System.out.println(kakaroto+" votos para o candidato Kakaroto");
		System.out.println(branco+" votos em branco");
		System.out.println(nulo+" votos nulo");
		System.out.println("Total: "+(vegeta+kakaroto+branco+nulo)+" votos");
		if (vegeta > kakaroto) {
			System.out.println("Candidato Eleito: Vegeta");
		} else {
			System.out.println("Candidato Eleito: Kakaroto");
		}
		sc.close();
	}

}
