package calculaImc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		Paciente p1 = new Paciente(86, 1.81);
//		System.out.println(p1);
		
		Scanner input = new Scanner(System.in);
		Paciente p = new Paciente();
		
		char continuar = 's';
		do {
			System.out.println("Informe o peso do paciente: ");
			p.setPeso(input.nextDouble());
			System.out.println("Informe a altura do paciente: ");
			p.setAltura(input.nextDouble());
			System.out.println(p);
			
			System.out.println("Deseja concultar outro paciente");
			continuar = input.next().charAt(0);
		} while (continuar  == 'S' || continuar == 's' );
		System.out.println("Programa encerrado.");
				
	}

}
