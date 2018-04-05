package strings;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "camisa 10";
		for (int i = 0; i < s1.length(); i++) {
			Character c = s1.charAt(i);
			if (s1.charAt(i) == "0") {
				System.out.print("zero");
			}
			if (s1.charAt(i) == "1") {
				System.out.print("um");
			}
			if (s1.charAt(i) == "2") {
				System.out.print("dois");
			}
			if (s1.charAt(i) == 3) {
				System.out.print("três");
			}
			if (s1.charAt(i) == 4) {
				System.out.print("quatro");
			}
			if (s1.charAt(i) == 5) {
				System.out.print("cinco");
			}
			if (s1.charAt(i) == 6) {
				System.out.print("seis");
			}
			if (s1.charAt(i) == 7) {
				System.out.print("sete");
			}
			if (s1.charAt(i) == 8) {
				System.out.print("oito");
			}
			if (s1.charAt(i) == 9) {
				System.out.print("nove");
			}
			if (i < s1.length()) {
				System.out.print(", ");
			}
		}
	}

}
