package heranca;

public class Administrativo extends Colaborador {
	private String nomeSupervisor;

	public Administrativo(String nome, int matricula, String departamento,
			String nomeSupervisor) {
		super(nome, matricula, departamento);
		this.nomeSupervisor = nomeSupervisor;
	}

	public String getNomeSupervisor() {
		return nomeSupervisor;
	}

	public void setNomeSupervisor(String nomeSupervisor) {
		this.nomeSupervisor = nomeSupervisor;
	}

}
