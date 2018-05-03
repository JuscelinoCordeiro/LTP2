package heranca;

public class Professor extends Colaborador {
	private String area;
	private int horasSemanais;

	public Professor(String nome, int matricula, String departamento,
			String area, int horasSemanais) {
		super(nome, matricula, departamento);
		this.area = area;
		this.horasSemanais = horasSemanais;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

}
