package heranca;

public class AlunoPosGraduacao extends Aluno {
	private String orientador;
	private float valorBolsa;

	public AlunoPosGraduacao(String nome, int matricula, String orientador,
			float valorBolsa) {
		super(nome, matricula);
		this.orientador = orientador;
		this.valorBolsa = valorBolsa;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public float getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(float valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

}
