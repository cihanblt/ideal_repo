/*
 * A s�n�f�ndan t�retilmi� B s�n�f�, B s�n�f�ndan t�retilmi� C s�n�f� olu�turunuz. Her
 * s�n�f�n kendisine ait varsay�lan yap�land�r�c�s� olmal�d�r ve her s�n�f�n yap�land�r�c�s�
 * i�erisinde ekrana "Selam ben A s�n�f�..." �eklinde yazd�r�lmal�d�r. Bu gereksinimler 
 * do�rultusunda kal�t�m ve ilk de�er alma s�ras�n� g�steren bir uygulama geli�tiriniz.
 */

package questions;

class A {
	public A() {
		System.out.println("Selam ben A");
	}
}

class B extends A {
	public B() {
		System.out.println("Selam ben B");
	}
}

class C extends B {
	public C() {
		System.out.println("Selam ben C");
	}
}

public class Q_3 {
	public static void main(String[] args) {
		new C();
	}
}
