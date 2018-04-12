package metodos;

public class ConversaoUnidadesVolume {
	public static void volume(double largura, double comprimento, double altura) {
		System.out.println("Volume em m3 = " + largura * comprimento * altura);
		System.out.println("Volume em galao = "
				+ String.format("%.2f",
						(largura * comprimento * altura / 3.785)));
	}
}
