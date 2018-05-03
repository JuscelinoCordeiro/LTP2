package televisao;

import java.util.Scanner;

import elevador.Elevador;

public class TestarTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisao t = new Televisao(20, 10);
		Scanner entrada = new Scanner(System.in);
		int opcao, valor;
		char continuar = 's';
		System.out.println(t);
		do {
			menu();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: // setar canal
				System.out.print("Digite o canal desejado(20-800): ");
				valor = entrada.nextInt();
				if (valor >= 20 && valor <= 800) {
					t.setCanal(valor);
				} else {
					System.out.println("\nCanal Inválido");
				}
				System.out.println(t);
				break;
			case 2: // canal +
				t.aumentarCanal();
				System.out.println(t);
				break;
			case 3: // canal -
				t.diminuirCanal();
				System.out.println(t);
				break;
			case 4: // volume +
				t.aumentarVolume();
				System.out.println(t);
				break;
			case 5: // volume -
				t.diminurVolume();
				System.out.println(t);
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
		System.out.println("1  - Setar canal");
		System.out.println("2  - Canal +");
		System.out.println("3  - Canal +");
		System.out.println("4  - Volume +");
		System.out.println("5  - Volume +");
		System.out.println("0  - Sair");
		System.out.print("Informe uma opção: ");
	}
}
