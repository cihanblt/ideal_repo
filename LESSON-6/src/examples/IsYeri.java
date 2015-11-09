package examples;

class Calisan2 {
	public String pozisyon = "Cal��an";

	public void calis() {

	}
}

class Mudur2 extends Calisan2 {
	public Mudur2() {
		pozisyon = "M�d�r";
	}

	public void calis() {	//Method Override
		System.out.println(pozisyon + " �al���yor");
	}
}

class Programci2 extends Calisan2 {
	public Programci2() {
		pozisyon = "Programc�";
	}

	public void calis() {	//Method Override
		System.out.println(pozisyon + " �al���yor");
	}
}

class Pazarlamaci2 extends Calisan2 {
	public Pazarlamaci2() {
		pozisyon = "Pazarlamac�";
	}

	public void calis() {	//Method Override
		System.out.println(pozisyon + " �al���yor");
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
		c[1] = new Programci2();//Yukar� �evrim upcasting...
		c[2] = new Pazarlamaci2();//Yukar� �evrim upcasting...
		c[3] = new Mudur2();//Yukar� �evrim upcasting...

		mesaiBasla(c);
	}

}
