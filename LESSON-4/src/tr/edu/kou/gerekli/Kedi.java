package tr.edu.kou.gerekli;

import tr.edu.kou.util.*;

public class Kedi extends Hayvan {

	public Kedi() {
		System.out.println("Kedi oluþturuluyor");
		System.out.println(a); // Protected
		// System.out.println(b); //Hata eriþemez.Friendly/Default
		// System.out.println(c); //Hata eriþemez.Private
		System.out.println(d); // Public
	}

	public static void main(String[] args) {

		Kedi k = new Kedi();

	}

}
