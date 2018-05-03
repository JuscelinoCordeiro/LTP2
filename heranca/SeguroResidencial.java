package heranca;

import java.util.Date;

public class SeguroResidencial extends Apolice {
	private String endereco;
	private float franquia;

	public SeguroResidencial(String nomeSegurado, float valorPremio,
			Date inicioVigencia, Date fimVigencia, String endereco,
			float franquia) {
		super(nomeSegurado, valorPremio, inicioVigencia, fimVigencia);
		this.endereco = endereco;
		this.franquia = franquia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getFranquia() {
		return franquia;
	}

	public void setFranquia(float franquia) {
		this.franquia = franquia;
	}

	@Override
	public String toString() {
		return "SeguroResidencial [endereco=" + endereco + ", franquia="
				+ franquia + "]";
	}

	
}
