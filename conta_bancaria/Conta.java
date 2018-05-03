package conta_bancaria;

public class Conta {

	private int numero;
	private String dono;
	private double saldo;
	private double limite;

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Conta(int numero, String dono, double saldo, double limite) {
		super();
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean sacar(double qtd) {
		if (qtd <= (this.saldo + this.limite)) {
			// double saldoAtual = saldo;
			saldo -= qtd;
			return true;
		} else {
			return false;
		}
	}

	public void depositar(double qtd) {
		saldo += qtd;
	}

	@Override
	public String toString() {
		return "=== Estado da conta ===\nNúmero: "
				+ String.format("%06d", numero) + "\nTitular da conta: " + dono
				+ "\nSaldo: " + String.format("%.2f", saldo) + "\nLimite: "
				+ String.format("%.2f", limite);
	}

}
