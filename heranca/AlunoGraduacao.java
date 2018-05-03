package heranca;

public class AlunoGraduacao extends Aluno{
	private String curso;

	public AlunoGraduacao(String nome, int matricula, String curso) {
		super(nome, matricula);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
