package strings;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String s1 = new String();
		System.out.println("Digite o texto: ");
		s1 = entrada.nextLine();
		System.out.println("Número de carcteres da string = "+s1.length());
		System.out.println("Toda a string em letras maiúsculas = "+s1.toUpperCase());
		System.out.println("Toda a string em letras minúsculas = "+s1.toLowerCase());
		if (s1.contains("rio")) {
			System.out.println("A string contém \"rio\"");
		}else{
			System.out.println("A string não contém \"rio\"");
		}

	}

}
