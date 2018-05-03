package elevador;

public class Elevador {
	private int andarAtual;
	private int totalAndares;
	private int capacidadeTotal;
	private int quantidadePessoas;

	public Elevador(int totalAndares, int capacidadeTotal) {
		super();
		this.totalAndares = totalAndares;
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public boolean entra() {
		if (quantidadePessoas < capacidadeTotal) {
			quantidadePessoas++;
			return true;
		}
		return false;
	}

	public boolean sai() {
		if (quantidadePessoas > 0) {
			quantidadePessoas--;
			return true;
		}
		return false;
	}

	public boolean sobe() {
		if (andarAtual < totalAndares) {
			andarAtual++;
			return true;
		}
		return false;
	}

	public boolean desce() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nElevador: \n\tandarAtual = " + andarAtual + "\n\ttotalAndares = "
				+ totalAndares + "\n\tcapacidadeTotal = " + capacidadeTotal
				+ "\n\tquantidadePessoas = " + quantidadePessoas;
	}

}
