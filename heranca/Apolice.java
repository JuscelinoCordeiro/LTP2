package heranca;

import java.util.Date;

public class Apolice {
	private String nomeSegurado;
	private float valorPremio;
	private Date inicioVigencia;
	private Date fimVigencia;

	public Apolice(String nomeSegurado, float valorPremio, Date inicioVigencia,
			Date fimVigencia) {
		super();
		this.nomeSegurado = nomeSegurado;
		this.valorPremio = valorPremio;
		this.inicioVigencia = inicioVigencia;
		this.fimVigencia = fimVigencia;
	}

	public String getNomeSegurado() {
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) {
		this.nomeSegurado = nomeSegurado;
	}

	public float getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(float valorPremio) {
		this.valorPremio = valorPremio;
	}

	public Date getInicioVigencia() {
		return inicioVigencia;
	}

	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}

	public Date getFimVigencia() {
		return fimVigencia;
	}

	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}

	@Override
	public String toString() {
		return "Apolice [nomeSegurado=" + nomeSegurado + ", valorPremio="
				+ valorPremio + ", inicioVigencia=" + inicioVigencia
				+ ", fimVigencia=" + fimVigencia + "]";
	}

}
