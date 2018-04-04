import java.util.Scanner;

public class Teorema {

    public static void main(String args[]) {        
        Scanner scanner = new Scanner(System.in);
        int p1 = scanner.nextInt();
        int q1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int q2 = scanner.nextInt();
        int p3 = scanner.nextInt();
        int q3 = scanner.nextInt();
        int menor = 0;
        while (menor % p1 != q1 || 
        	   menor % p2 != q2 || 
        	   menor % p3 != q3) {
            menor++;                              
        }
        System.out.println(menor);        
        scanner.close();
    }

}








