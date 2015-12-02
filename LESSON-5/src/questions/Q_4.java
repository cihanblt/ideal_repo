/*
 * X s�n�f�ndan t�retilmi� Y s�n�f�, Y s�n�f�ndan t�retilmi� Z s�n�f� olu�turunuz. Her s�n�f�n
 * kendisine ait yaln�zca bir tane temel int tipinde parametre alan yap�land�r�c�s� olmal�d�r
 * ve bunun i�erisinde ekrana "Selam ben Z s�n�f�..." �eklinde ifade yazd�r�lmal�d�r. Bu
 * gereksinimler do�rultusunda kal�t�m ve parametreli yap�land�r�c�lar ile ilk de�er alma s�ras�n�
 * g�steren bir uygulama geli�tiriniz. Uygulama ilk olarak Z s�n�f�na ait bir nesne olu�turularak
 * ba�lat�lmal�d�r.
 */

package questions;

class X {
	public X(int x) {
		System.out.println("Selam ben X, x = " + x);
	}
}

class Y extends X {
	public Y(int y) {
		super(1);
		System.out.println("Selam ben Y, y = " + y);
	}
}

class Z2 extends Y {
	public Z2(int z) {
		super(2);
		System.out.println("Selam ben Z2, z = " + z);
	}
}

public class Q_4 {
	public static void main(String[] args) {
		new Z2(3);
	}
}
