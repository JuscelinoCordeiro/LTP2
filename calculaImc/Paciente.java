package calculaImc;

public class Paciente {

	private double peso;
	private double altura;

	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public Paciente() {
		// TODO Auto-generated constructor stub
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculaIMC() {
		return (this.peso / Math.pow(this.altura, 2));
	}

	public String diagnostico() {
		double imc = calculaIMC();
		String diagnostico = new String();
		if (imc < 16) {
			diagnostico = "Baixo peso muito grave";
		} else if (imc < 17) {
			diagnostico = "Baixo peso grave";
		} else if (imc < 18.50) {
			diagnostico = "Baixo peso";
		} else if (imc < 25) {
			diagnostico = "Peso normal";
		} else if (imc < 30) {
			diagnostico = "Sobrepeso";
		} else if (imc < 35) {
			diagnostico = "Obesidade grau I";
		} else if (imc < 40) {
			diagnostico = "Obesidade grau II";
		} else { // imc igual ou maior que 40
			diagnostico = "Obesidade grau III (obesidade mórbida)";
		}
		return diagnostico;
	}

	@Override
	public String toString() {
		return "Paciente [ \npeso = " + peso + ", \naltura = " + altura
				+ ", \ncalculaIMC = " + String.format("%.2f",calculaIMC()) + ", \ndiagnostico = "
				+ diagnostico() + "\n]";
	}
	
	
}
