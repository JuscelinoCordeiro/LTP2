package heranca;

import java.util.Date;

public class SeguroVida extends Apolice {
	private int idade;
	private String beneficiario;

	public SeguroVida(String nomeSegurado, float valorPremio,
			Date inicioVigencia, Date fimVigencia, int idade,
			String beneficiario) {
		super(nomeSegurado, valorPremio, inicioVigencia, fimVigencia);
		this.idade = idade;
		this.beneficiario = beneficiario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	@Override
	public String toString() {
		return "SeguroVida [idade=" + idade + ", beneficiario=" + beneficiario
				+ "]";
	}

	
	
}
