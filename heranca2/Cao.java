package heranca2;

public class Cao extends Mamifero {
	private boolean vigiando;

	public Cao(boolean vivo, String nome, int idade, float cotaDiariaLeite,
			String nomeDono) {
		super(vivo, nome, idade, cotaDiariaLeite, nomeDono);
		// TODO Auto-generated constructor stub
	}

	public boolean isVigiando() {
		if (isVivo()) {
			this.vigiando = true;
		}
		return vigiando;
	}

	public boolean relaxar() {
		if (isVivo()) {
			this.vigiando = false;
		}
		return vigiando;
	}

	public void latir() {
		if (isVivo()) {
			System.out.println("Au!");
		}
	}

}
