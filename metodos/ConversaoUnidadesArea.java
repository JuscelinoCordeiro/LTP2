package metodos;

public class ConversaoUnidadesArea {
	public static void area(double largura, double comprimento) {
		System.out.println("Área em m2 = " + largura * comprimento);
		System.out.println("Área em pés2 = " + largura * comprimento * 10.76);
		System.out.println("Área em acre = " + String.format("%.2f",(largura * comprimento * 10.76)/ 43560));
		System.out.println("Área em milha2 = "
				+ String.format("%.4f",((largura * comprimento * 10.76) / 43560) / 640));
	}
}
