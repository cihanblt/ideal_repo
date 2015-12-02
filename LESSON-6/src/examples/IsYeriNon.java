package examples;

class Calisan {
	public String pozisyon = "Cal��an";

	public void calis() {
	}
}

class Mudur {
	public String pozisyon = "M�d�r";

	public Mudur() {
		pozisyon = "M�d�r";
	}

	public void calis() {
		System.out.println("M�d�r �al���yor");
	}
}

class Programci {
	public String pozisyon = "Programc�";

	public Programci() {
		pozisyon = "Programc�";
	}

	public void calis() {
		System.out.println("Programc� �al���yor");
	}
}

class Pazarlamaci {
	public String pozisyon = "Pazarlamac�";

	public Pazarlamaci() {
		pozisyon = "Pazarlamac�";
	}

	public void calis() {
		System.out.println("Pazarlamac� �al���yor");
	}
}

public class IsYeriNon {

	public static void mesaiBasla(Object[] o) {
		for (int i = 0; i < o.length; i++) {
			if (o[i] instanceof Calisan) {
				Calisan c = (Calisan) o[i]; // A�a��ya �evrim dowmcasting...
				c.calis();
			} else if (o[i] instanceof Mudur) {
				Mudur m = (Mudur) o[i];// A�a��ya �evrim dowmcasting...
				m.calis();
			} else if (o[i] instanceof Programci) {
				Programci p = (Programci) o[i];// A�a��ya �evrim dowmcasting...
				p.calis();
			} else if (o[i] instanceof Pazarlamaci) {
				Pazarlamaci paz = (Pazarlamaci) o[i];// A�a��ya �evrim dowmcasting...
				paz.calis();
			}
		}
	}

	public static void main(String[] args) {
		Object[] o = new Object[4];
		o[0] = new Calisan(); // Yukar� �evrim Upcasting...
		o[1] = new Programci(); // Yukar� �evrim Upcasting...
		o[2] = new Pazarlamaci(); // Yukar� �evrim Upcasting...
		o[3] = new Mudur(); // Yukar� �evrim Upcasting...

		mesaiBasla(o);
	}

}
