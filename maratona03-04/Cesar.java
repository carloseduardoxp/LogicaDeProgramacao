import java.util.Scanner;

public class Cesar {
	
	public static void main(String args[]) {
		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
	  String cifrado = "DEFGHIJKLMNOPQRSTUVWXYZABCdefghijklmnopqrstuvwxyzabc ";
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		while (N > 0) {
			N--;
			String value = scanner.nextLine();
			String output = "";
			for (int i = 0; i < value.length();i++) {
				char c = value.charAt(i);
				int pos = input.indexOf(c);
				char cCript = cifrado.charAt(pos);
				output = output + cCript;
			}
			System.out.println(output);
		}
		scanner.close();
	}

}
