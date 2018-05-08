package heranca2;

public class Mamifero extends Animal {
	private float cotaDiariaLeite;
	private String nomeDono;

	public Mamifero(boolean vivo, String nome, int idade,
			float cotaDiariaLeite, String nomeDono) {
		super(vivo, nome, idade);
		this.cotaDiariaLeite = cotaDiariaLeite;
		this.nomeDono = nomeDono;
	}

//	public float getCotaDiariaLeite() {
//		return cotaDiariaLeite;
//	}
//
//	public void setCotaDiariaLeite(float cotaDiariaLeite) {
//		this.cotaDiariaLeite = cotaDiariaLeite;
//	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public void mamar(float cotaDeLeite) {
		if (isVivo()) {
			this.cotaDiariaLeite += cotaDeLeite;
		}
	}

	@Override
	public String toString() {
//		super.toString() ;
		return super.toString() + "\nMamifero [ cotaDiariaLeite = " + cotaDiariaLeite + ", nomeDono = "
				+ nomeDono + " ]";
	}
	
	
}
