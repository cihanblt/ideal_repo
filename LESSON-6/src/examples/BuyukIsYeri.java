package examples;

class Calisan3 {
	public String pozisyon = "Calisan";

	public void calis() {

	}
}

class Mudur3 extends Calisan3 {
	public Mudur3() {
		pozisyon = "Müdür";
	}

	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

class GenelMudur extends Mudur3 {
	public GenelMudur() {
		pozisyon = "Genel Müdür";
	}

	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}

	public void toplantiYonet() {
		System.out.println(pozisyon + " toplantý yönetiyor");
	}
}

class Programci3 extends Calisan3 {
	public Programci3() {
		pozisyon = "Programcý";
	}

	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

class AnalizProgramci extends Programci3 {
	public AnalizProgramci() {
		pozisyon = "AnalizProgramcý";
	}

	public void analizYap() {
		System.out.println("Analiz yapýlýyor");
	}
}

class SistemProgramci extends Programci3 {
	public SistemProgramci() {
		pozisyon = "SistemProgramcý";
	}

	public void sistemIncele() {
		System.out.println("Sistem iceleniyor");
	}
}

class Pazarlamaci3 extends Calisan3 {
	public Pazarlamaci3() {
		pozisyon = "Pazarlamacý";
	}

	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

class Sekreter extends Calisan3 {
	public Sekreter() {
		pozisyon = "Sekreter";
	}

	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

public class BuyukIsYeri {

	public static void mesaiBasla(Calisan3[] c) {
		for (int i = 0; i < c.length; i++) {
			c[i].calis();
		}
	}

	public static void main(String[] args) {
		Calisan3[] c = new Calisan3[8];
		c[0] = new Calisan3();
		c[1] = new Programci3(); // Upcasting
		c[2] = new Pazarlamaci3(); // Upcasting
		c[3] = new Mudur3(); // Upcasting
		c[4] = new GenelMudur(); // Upcasting
		c[5] = new AnalizProgramci(); // Upcasting
		c[6] = new SistemProgramci(); // Upcasting
		c[7] = new Sekreter(); // Upcasting

		mesaiBasla(c);

		System.out.println("\n");
		AnalizProgramci a = (AnalizProgramci) c[5]; // downcasting
		a.analizYap();
		SistemProgramci s = (SistemProgramci) c[6]; // downcasting
		s.sistemIncele();
	}

}
