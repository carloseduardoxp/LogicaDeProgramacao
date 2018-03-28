import java.util.Locale;
import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int $ = sc.nextInt();
		
		int $100 = $/100;
		int $50 =($%100)/50;
		int $20 =($-($100*100)-($50*50))/20;
		int $10 =($-($100*100)-($50*50)-($20*20))/10;
		int $5 = ($-($100*100)-($50*50)-($20*20)-($10*10))/5;
		int $2 = ($-($100*100)-($50*50)-($20*20)-($10*10)-($5*5))/2;
		int $1 = ($-($100*100)-($50*50)-($20*20)-($10*10)-($5*5)-($2*2));
		
		System.out.println($);
		System.out.println($100+" nota(s) de R$ 100,00");
		System.out.println($50+" nota(s) de R$ 50,00");
		System.out.println($20+" nota(s) de R$ 20,00");
		System.out.println($10+" nota(s) de R$ 10,00");
		System.out.println($5+" nota(s) de R$ 5,00");
		System.out.println($2+" nota(s) de R$ 2,00");
		System.out.println($1+" nota(s) de R$ 1,00");
		sc.close();
	}

}
