package conta_bancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setDono("Fulano de Tal");
		c.setNumero(001);
		c.setSaldo(50);
		c.setLimite(100);

//		System.out.println(c);

		Scanner entrada = new Scanner(System.in);
		int opcao;
		double valor;

		char continuar = 's';
		do {
			menu();
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: // ver estado da conta
				System.out.println(c);
				break;
			case 2: // ver o saldo da conta
				System.out.println("\nSaldo da conta: " + c.getSaldo());
				System.out.println("Limite da conta: " + c.getLimite());
				System.out
						.println("Total disponível para saque: "
								+ (String.format("%.2f",
										(c.getSaldo() + c.getLimite()))));
				break;
			case 3: // depositar
				System.out.print("Informe o valor a ser depositado na conta: ");
				valor = entrada.nextDouble();
				c.depositar(valor);
				break;
			case 4: // sacar
				System.out.print("Informe o valor para o saque: ");
				valor = entrada.nextDouble();
				if (c.sacar(valor)) {
				System.out.println("Retire o dinheiro no local determinado");	
				}else {
					System.out.println("Operação não realizada. Saldo insuficiente.");
				}
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

			System.out.println("Deseja realizar outra operação? (S/N)");
			continuar = entrada.next().charAt(0);
		} while (continuar == 'S' || continuar == 's');
		System.out.println("Programa encerrado.");

	}

	public static void menu() {
		// limparTela();
		System.out.println("\n=============== Menu de Opções ===============");
		System.out
				.println("===============================================================================");
		System.out.println("1  - Ver o estado da conta");
		System.out.println("2  - Ver o saldo da conta");
		System.out.println("3  - Depositar");
		System.out.println("4  - Sacar");
		System.out.print("Informe uma operação: ");
	}
}
