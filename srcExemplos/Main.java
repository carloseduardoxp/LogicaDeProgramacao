
import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int A = sc.nextInt();
	   int B = sc.nextInt();
	   int X = A + B;
	   System.out.println("X = "+X);
	   //System.out.println(X+" eh o valor gerado pela soma de "+A+" com "+B);
	   
	   sc.close();
   }	   
}