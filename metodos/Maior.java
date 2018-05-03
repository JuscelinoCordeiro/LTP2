package metodos;

import java.lang.Math;

public class Maior {
	public static int maior(int n1, int n2) {
		return Math.max(n1, n2);
	}

	public static int maior(int n1, int n2, int n3) {
		return Math.max(maior(n1, n2), n3);
	}

	public static int maior(int n1, int n2, int n3, int n4) {
		return Math.max(maior(n1, n2), maior(n3, n4));
	}

	public static int maior(int n1, int n2, int n3, int n4, int n5) {
		return Math.max(maior(n1, n2, n3, n4), n5);
	}

}
