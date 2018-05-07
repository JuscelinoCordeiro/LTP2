package heranca2;

public class Animal {
	private boolean vivo;
	private String nome;
	private int idade;

	protected Animal(boolean vivo, String nome, int idade) {
		super();
		this.vivo = vivo;
		this.nome = nome;
		this.idade = idade;
	}

	protected Animal() {

	}

	protected boolean isVivo() {
		return vivo;
	}

	protected void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	protected boolean nascer() {
		this.vivo = true;
		return this.vivo;
	}

	protected boolean morrer() {
		this.vivo = false;
		return this.vivo;
	}

	protected int fazerAniversario(){
		this.idade++;
		return this.idade;
	}
	
	
}
