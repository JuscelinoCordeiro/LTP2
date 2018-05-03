package src.aula1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// System.out.println("Exercicio 1 - Media ponderada");
		// mediaPonderada();
		// System.out.println("Exercicio 2 - Maior de 3");
		// maiorDeTres();
		// System.out.println("Exercicio 3 - Multiplos de 3 e 4 entre 10 e 200");
		// multplosDeTresEquatro();
		// System.out.println("Exercicio 4 - MDC");
		// calcularMdc();
		// System.out.println("Exercicio 5 - Maior e menor no vetor de 8 posições");
		// maiorEmenor();
		// System.out.println("Exercicio 6 - String com nome");
		// stringNome();
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
			menu();
			System.out.print("Digite uma opção: ");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				limparTela();
				System.out
						.println("\nExercício 1 - Média ponderada de 3 numeros");
				mediaPonderada();
				break;
			case 2:
				limparTela();
				System.out.println("\nExercício 2 - Maior de 3 numeros");
				maiorDeTres();
				break;
			case 3:
				limparTela();
				System.out
						.println("\nExercício 3 - Múltiplos de 3 e 4 entre 10 e 200");
				multplosDeTresEquatro();
				break;
			case 4:
				limparTela();
				System.out.println("\nExercício 4 - MDC de 2 números");
				calcularMdc();
				break;
			case 5:
				limparTela();
				System.out
						.println("\nExercício 5 - Maior e menor no vetor de 8 posições");
				maiorEmenor();
				break;
			case 6:
				limparTela();
				System.out.println("\nExercício 6 - String com o nome");
				stringNome();
				break;
			case 0:
				System.out.println("\nprograma encerrado");
				break;
			default:
				System.out.println("\nOpção inválida.");
				break;
			}

		} while (opcao != 0);
	}

	public static void menu() {
//		limparTela();
		System.out.println("\n=============== Menu de Opções ===============\n");
		System.out.println("1 - Média ponderada de 3 numeros");
		System.out.println("2 - Maior de 3 numeros");
		System.out.println("3 - Múltiplos de 3 e 4 entre 10 e 200");
		System.out.println("4 - MDC de 2 números");
		System.out.println("5 - Maior e menor no vetor de 8 posições");
		System.out.println("6 - String com o nome");
		System.out.println("0 - Sair");
	}

	public static void limparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}

	public static void stringNome() {
		Scanner entrada = new Scanner(System.in);
		String nome = new String();
		System.out.print("Digite o seu nome: ");
		nome = entrada.nextLine();
		System.out.println("o tamanho da string é: " + nome.length());
		System.out
				.println("A primeira ocorrência do caractere \"a\" ocorre na posição: "
						+ nome.indexOf("a"));
	}

	public static void maiorEmenor() {
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[8];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite numero para a posicao " + i + " : ");
			vetor[i] = entrada.nextInt();
		}
		int j = 1;
		int maior = vetor[0];
		int menor = vetor[0];
		while (j < vetor.length) {
			if (vetor[j] > maior) {
				maior = vetor[j];
			}
			if (vetor[j] < menor) {
				menor = vetor[j];
			}
			j++;
		}
		System.out.println("O maior número no vetor é: " + maior);
		System.out.println("O menor número no vetor é: " + menor);
	}

	public static void mediaPonderada() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = entrada.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int n3 = entrada.nextInt();

		int mp = ((n1 * 2 + n2 * 4 + n3 * 2) / 6);
		System.out.println("A média ponderada é : " + mp);
	}

	public static void maiorDeTres() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = entrada.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int n3 = entrada.nextInt();
		int maior = n1;
		if (maior < n2) {
			maior = n2;
		} else if (maior < n3) {
			maior = n3;
		}
		System.out.println("O número maior é: " + maior);
	}

	public static void multplosDeTresEquatro() {
		System.out.println("Os multiplos de 3 e 4 entre 10 e 200 sao:");
		for (int i = 10; i < 200; i++) {
			if ((i % 3 == 0) && (i % 4) == 0) {
				System.out.printf("%3d, ", i);
			}
		}
		System.out.println("");
	}

	public static int mdc(int dividendo, int divisor) {
		if (dividendo % divisor == 0)
			return divisor;
		else {
			int resto = (dividendo % divisor);
			dividendo = divisor;
			divisor = resto;
			return mdc(dividendo, divisor);
		}
	}

	public static void calcularMdc() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = entrada.nextInt();
		int maior = n1;
		if (maior < n2) {
			maior = n2;
			n2 = n1;
		}
		System.out.println("O mdc entre " + n1 + " e " + n2 + " é: "
				+ mdc(maior, n2));
	}

}
