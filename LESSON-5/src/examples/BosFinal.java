package examples;

class Kalem {

}

public class BosFinal {

	final int a = 0;
	final int b;// Boþ Final
	final Kalem k;// Boþ final nesne alaný

	public BosFinal() {
		k = new Kalem();
		b = 1;
	}

	public BosFinal(int x) {
		b = x;
		k = new Kalem();
	}

	public static void main(String[] args) {
		BosFinal bf = new BosFinal();
		System.out.println("b = " + bf.b);
		System.out.println("k = " + bf.k);
	}

}

/*
 * Boþ final alanlara ilk deðerleri yapýlandýrýcýlar içerisinde
 * verilmelidir.static final olan global alanlar boþ final olma özelliðinden
 * yararlanamazlar.
 */