package examples;

class Calisan {
	public String pozisyon = "Calýþan";

	public void calis() {
	}
}

class Mudur {
	public String pozisyon = "Müdür";

	public Mudur() {
		pozisyon = "Müdür";
	}

	public void calis() {
		System.out.println("Müdür Çalýþýyor");
	}
}

class Programci {
	public String pozisyon = "Programcý";

	public Programci() {
		pozisyon = "Programcý";
	}

	public void calis() {
		System.out.println("Programcý Çalýþýyor");
	}
}

class Pazarlamaci {
	public String pozisyon = "Pazarlamacý";

	public Pazarlamaci() {
		pozisyon = "Pazarlamacý";
	}

	public void calis() {
		System.out.println("Pazarlamacý çalýþýyor");
	}
}

public class IsYeriNon {

	public static void mesaiBasla(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			if (o[i] instanceof Calisan) {
				Calisan c = (Calisan) o[i]; // Aþaðýya çevrim dowmcasting...
				c.calis();
			} else if (o[i] instanceof Mudur) {
				Mudur m = (Mudur) o[i];// Aþaðýya çevrim dowmcasting...
				m.calis();
			} else if (o[i] instanceof Programci) {
				Programci p = (Programci) o[i];// Aþaðýya çevrim dowmcasting...
				p.calis();
			} else if (o[i] instanceof Pazarlamaci) {
				Pazarlamaci paz = (Pazarlamaci) o[i];// Aþaðýya çevrim dowmcasting...
				paz.calis();
			}
		}
	}

	public static void main(String[] args) {
		Object[] o = new Object[4];
		o[0] = new Calisan(); // Yukarý Çevrim Upcasting...
		o[1] = new Programci(); // Yukarý Çevrim Upcasting...
		o[2] = new Pazarlamaci(); // Yukarý Çevrim Upcasting...
		o[3] = new Mudur(); // Yukarý Çevrim Upcasting...

		mesaiBasla(o);
	}

}
