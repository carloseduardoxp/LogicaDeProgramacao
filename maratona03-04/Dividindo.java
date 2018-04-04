import java.util.*;

public class Dividindo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int quantos = scanner.nextInt();
        for (int i = 0; i < quantos; i++) {
            long numero1 = scanner.nextInt();
            long numero2 = scanner.nextInt();            
            System.out.println(numero1 / numero2);
        }
        scanner.close();
    }

}








