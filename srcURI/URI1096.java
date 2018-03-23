
public class URI1096 {

	public static void main(String[] args) {
		int I = 1;
		while (I <= 9) {
			int J = 7;
			while (J >= 5) {
				System.out.println("I="+I+" J="+J);
				J = J - 1;
			}			
			I = I + 2;
		}
		
		
		/*
		for (int I = 1; i <= 9; I+=2) {
			for (int J = 7; J >= 5; J--) {
				System.out.println("I="+I+" J="+J);
			}
		}
*/
	}

}
