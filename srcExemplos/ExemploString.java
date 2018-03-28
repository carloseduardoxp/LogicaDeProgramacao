
public class ExemploString {

	public static void main(String[] args) {
		String nome = "Iudi";
		int quantosCaracteres = nome.length();
		int posicaoCaractereE = nome.indexOf("E");
		boolean temPlaystation = nome.contains("io");
		
		for (int i = 0; i <= quantosCaracteres; i++) {
			char c = nome.charAt(i);
			System.out.println("li o caractere "+c);
		}
	
		/*
		int quantasVogais = 0;
		for (int i = 0; i < quantosCaracteres; i++) {
			char c = nome.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				quantasVogais++;
			}
		}
		System.out.println(quantasVogais);
		*/

	}

}
