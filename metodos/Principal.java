package metodos;
public class Principal {

	public static void main(String[] args) {
		System.out.println(Maior.maior(23, 12));
		System.out.println(Maior.maior(23, 12, 45));
		System.out.println(Maior.maior(23, 12, 04, 78));
		System.out.println(Maior.maior(23, 12, 67, 13, 56));
		
		ConversaoUnidadesArea.area(65, 110);
		
		ConversaoUnidadesVolume.volume(0.15, 0.30, 0.50);
	}

}
