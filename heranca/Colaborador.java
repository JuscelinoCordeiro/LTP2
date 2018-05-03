package heranca;

public class Colaborador {
	private String nome;
	private int matricula;
	private String departamento;

	public Colaborador(String nome, int matricula, String departamento) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
