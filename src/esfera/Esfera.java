package esfera;

public class Esfera {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double volumeDaEsfera() {
		return ((4 * Math.PI * Math.pow(raio, 3) / 3));
	}

	public Esfera() {
		// TODO Auto-generated constructor stub
	}

}
