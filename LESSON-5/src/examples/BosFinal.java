package examples;

class Kalem {

}

public class BosFinal {

	final int a = 0;
	final int b;// Bo� Final
	final Kalem k;// Bo� final nesne alan�

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
 * Bo� final alanlara ilk de�erleri yap�land�r�c�lar i�erisinde
 * verilmelidir.static final olan global alanlar bo� final olma �zelli�inden
 * yararlanamazlar.
 */