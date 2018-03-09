
import java.util.Scanner;
import java.util.Locale;

public class URI1002 {
   public static void main(String args[]) {
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
	  double raio = sc.nextDouble();
	  double pi = 3.14159;
	  double area = raio  * raio * pi;
	  //double area = Math.pow(raio,2) * pi;
	  System.out.printf("A=%.4f\n",area);
	  sc.close();
   }
}


