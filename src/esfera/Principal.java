package esfera;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Esfera e = new Esfera();
		double raio;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o raio da esfera: ");
		raio = entrada.nextDouble();
		while (raio != 0) {
			e.setRaio(raio);
			System.out.println("O raio da esfera é: "
					+ String.format("%.2f", e.getRaio()) + " cm");
			System.out.println("O volume da esfera é: "
					+ String.format("%.2f", e.volumeDaEsfera()) + " cm3\n");
			System.out.print("Digite o raio da esfera: ");
			raio = entrada.nextDouble();
		}
		System.out.println("\nPrograma encerrado");
		// do {
		// System.out.print("Digite o raio da esfera: ");
		// raio = entrada.nextDouble();
		// e.setRaio(raio);
		// System.out.println("O raio da esfera é: "
		// + String.format("%.2f", e.getRaio()) + " cm");
		// System.out.println("O volume da esfera é: "
		// + String.format("%.2f", e.volumeDaEsfera()) + " cm3\n");
		// } while (raio != 0);
	}

}
