package heranca2;

public class Teste {

	public static void main(String[] args) {
		Animal a = new Animal(true,"Jumento",1);
		System.out.println(a);
		System.out.println("\n");
		
		//matando
		a.morrer();
		System.out.println(a);
		System.out.println("\n");
		
		Mamifero m = new Mamifero(true, "Mertiz", 1, 1, "Seu Zé");
		m.mamar(2);
		m.getNomeDono();
		System.out.println(m);
		System.out.println("\n");
		
		//matando
		m.morrer();
		m.mamar(2);
		m.getNomeDono();
		System.out.println(m);
		System.out.println("\n");
		
		Cao c = new Cao(true, "totó", 2, 2, "Juquinha");
		c.latir();
		c.vigiar();
		System.out.println(c.isVigiando());
		c.relaxar();
		System.out.println(c.isVigiando());
		System.out.println(c);
		System.out.println("\n");

		//matando
		c.morrer();
		c.latir();
		c.vigiar();
		System.out.println(c.isVigiando());
		c.relaxar();
		System.out.println(c.isVigiando());
		System.out.println(c);
		System.out.println("\n");
		
		Gato g = new Gato(true, "bichabo", 3, 1, "Talita", true);
		g.miar();
		g.descerMuro();
		System.out.println(g.isNoMuro());
		g.subirMuro();
		System.out.println(g.isNoMuro());
		System.out.println(g);
		System.out.println("\n");

		//matando
		g.morrer();
		g.miar();
		g.descerMuro();
		System.out.println(g.isNoMuro());
		g.subirMuro();
		System.out.println(g.isNoMuro());
		System.out.println(g);
	}

}
