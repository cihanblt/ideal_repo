package tr.edu.kou.gerekli;

import tr.edu.kou.util.*;

public class Kedi extends Hayvan {

	public Kedi() {
		System.out.println("Kedi olu�turuluyor");
		System.out.println(a); // Protected
		// System.out.println(b); //Hata eri�emez.Friendly/Default
		// System.out.println(c); //Hata eri�emez.Private
		System.out.println(d); // Public
	}

	public static void main(String[] args) {

		Kedi k = new Kedi();

	}

}
