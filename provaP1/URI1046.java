import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		int horas = 24;
		if (hi < hf) {
			horas = hf - hi;
		} else if (hi > hf) {
			horas = 24 - hi + hf;
		}
		System.out.println("O JOGO DUROU "+horas+" HORA(S)");

	}

}
