package examples;

class Hayvan {
	public Hayvan() {
		System.out.println("Hayvan yap�land�r�c�s�");
	}
}

class Yarasa extends Hayvan {
	public Yarasa() {
		System.out.println("Yarasa yap�land�r�c�s�");
	}
}

class UcanYarasa extends Yarasa {
	public UcanYarasa() {
		System.out.println("UcanYarasa yap�land�r�c�s�");
	}
}

public class IlkDegerVermeSirasi {

	public static void main(String[] args) {

		UcanYarasa uy = new UcanYarasa();

	}

}
