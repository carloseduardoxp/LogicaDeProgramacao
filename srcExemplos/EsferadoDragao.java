import java.util.Scanner;

public class EsferadoDragao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantasEsferas = sc.nextInt();
		switch(quantasEsferas) {
		    case 0:
		    	System.out.println("que pena, voce nem sabe o que eh isso");
		    	break;
			case 1: 
				System.out.println("Faltam 6 goku");
				break;
			case 2: 
				System.out.println("Faltam 5 bulma");
				break;
			case 3: 
				System.out.println("ta chegando.. faltam 4");
				break;
			case 4:
				System.out.println("patrulha vermelha, faltam 3");
				break;
			case 5:
				System.out.println("faltam so as 2 do tao pai pai");
				break;
			case 6:
				System.out.println("sheng lonh vem ai falta 1");
				break;
			case 7: 
				System.out.println("pedi vida eterna");
				break;
			default:
				System.out.println("entrada errada meu amigo");
				break;
		}
		System.out.println("terminou o programa");	

	}

}
