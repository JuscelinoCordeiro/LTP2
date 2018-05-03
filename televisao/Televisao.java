package televisao;

public class Televisao {
	private int canal;
	private int volume;

	public Televisao(int canal, int volume) {
		if (canal >= 20 && canal <= 800) {
			this.canal = canal;
		}
		if (volume >= 0 && volume <= 50) {
			this.volume = volume;
		}
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (canal >= 20 && canal <= 800) {
			this.canal = canal;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= 0 && volume <= 50) {
			this.volume = volume;
		}
	}

	public void aumentarVolume() {
		if (volume < 50) {
			this.volume++;
		}
	}

	public void diminurVolume() {
		if (volume > 0) {
			this.volume--;
		}
	}

	public void aumentarCanal() {
		if (canal < 800) {
			this.canal++;
		}
	}

	public void diminuirCanal() {
		if (canal > 10) {
			this.canal--;
		}
	}


	public String toString() {
		return "Televisao [canal = " + canal + ", volume = " + volume + "]";
	}
	
	
}
