package heranca2;

public class Cao extends Mamifero {
	private boolean vigiando;

	public Cao(boolean vivo, String nome, int idade, float cotaDiariaLeite,
			String nomeDono) {
		super(vivo, nome, idade, cotaDiariaLeite, nomeDono);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isVigiando() {
		return vigiando;
	}

	public boolean vigiar() {
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

	@Override
	public String toString() {
		return super.toString() + "\nCao [ vigiando = " + vigiando + " ]";
	}

	
}
