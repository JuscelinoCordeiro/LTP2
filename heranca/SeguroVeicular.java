package heranca;

import java.util.Date;

public class SeguroVeicular extends Apolice {
	private String placa;
	private float franquia;

	public SeguroVeicular(String nomeSegurado, float valorPremio,
			Date inicioVigencia, Date fimVigencia, String placa, float franquia) {
		super(nomeSegurado, valorPremio, inicioVigencia, fimVigencia);
		this.placa = placa;
		this.franquia = franquia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getFranquia() {
		return franquia;
	}

	public void setFranquia(float franquia) {
		this.franquia = franquia;
	}

	@Override
	public String toString() {
		return "SeguroVeicular [placa=" + placa + ", franquia=" + franquia
				+ "]";
	}

	
}
