package elevador;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Elevador e = new Elevador(6, 8);
		int opcao;
		char continuar = 's';
		System.out.println(e);
		do {
			menu();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: // subir
				if (e.sobe()) {
					System.out.println("\nSubindo...");
				} else {
					System.out.println("\nElevador já esta no último andar...");
				}
				System.out.println(e);
				break;
			case 2: // descer
				if (e.desce()) {
					System.out.println("\nDescendo...");
				} else {
					System.out.println("\nElevador já esta no térreo...");
				}
				System.out.println(e);
				break;
			case 3: // entrar
				if (e.entra()) {
					System.out.println("\nEntrando...");
				} else {
					System.out.println("\nElevador já esta lotado...");
				}
				System.out.println(e);
				break;
			case 4: // sair
				if (e.sai()) {
					System.out.println("\nSaindo...");
				} else {
					System.out.println("\nElevador já esta vazio...");
				}
				System.out.println(e);
				break;
			default:
				System.out.println("\nOpção inválida");
				break;
			}

			System.out.println("\nDeseja realizar outra operação? (S/N)");
			continuar = entrada.next().charAt(0);
		} while (continuar == 'S' || continuar == 's');
		System.out.println("\nPrograma encerrado.");
	}

	public static void menu() {
		// limparTela();
		System.out.println("\n=============== Menu de Opções ===============");
		System.out
				.println("===============================================================================");
		System.out.println("1  - Subir");
		System.out.println("2  - Descer");
		System.out.println("3  - Entrar");
		System.out.println("4  - Sair");
		System.out.print("Informe uma opção: ");
	}

}
