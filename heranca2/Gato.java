package heranca2;

public class Gato extends Mamifero{
	private boolean noMuro;
	

	public Gato(boolean vivo, String nome, int idade, float cotaDiariaLeite,
			String nomeDono, boolean noMuro) {
		super(vivo, nome, idade, cotaDiariaLeite, nomeDono);
		this.noMuro = noMuro;
	}

	public boolean isNoMuro() {
		return noMuro;
	}

	public void setNoMuro(boolean noMuro) {
		this.noMuro = noMuro;
	}
	
	public void miar() {
		if (isVivo()) {
			System.out.println("Miau!");
		}
	}
	public void subirMuro() {
		if (isVivo()) {
			this.noMuro = true;
		}
	}
	public void descerMuro() {
		if (isVivo()) {
			this.noMuro = false;
		}
	}
	
}
