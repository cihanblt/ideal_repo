package examples;

class Calisan2 {
	public String pozisyon = "Calýþan";

	public void calis() {

	}
}

class Mudur2 extends Calisan2 {
	public Mudur2() {
		pozisyon = "Müdür";
	}

	public void calis() {	//Method Override
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

class Programci2 extends Calisan2 {
	public Programci2() {
		pozisyon = "Programcý";
	}

	public void calis() {	//Method Override
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

class Pazarlamaci2 extends Calisan2 {
	public Pazarlamaci2() {
		pozisyon = "Pazarlamacý";
	}

	public void calis() {	//Method Override
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

public class IsYeri {

	public static void mesaiBasla(Calisan2[] c) {
		for (int i = 0; i < c.length; i++) {
			c[i].calis();
		}
	}

	public static void main(String[] args) {
		Calisan2[] c = new Calisan2[4];
		c[0] = new Calisan2();
		c[1] = new Programci2();//Yukarý çevrim upcasting...
		c[2] = new Pazarlamaci2();//Yukarý çevrim upcasting...
		c[3] = new Mudur2();//Yukarý çevrim upcasting...

		mesaiBasla(c);
	}

}
