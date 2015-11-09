package examples;

class Hayvan {
	public Hayvan() {
		System.out.println("Hayvan yapýlandýrýcýsý");
	}
}

class Yarasa extends Hayvan {
	public Yarasa() {
		System.out.println("Yarasa yapýlandýrýcýsý");
	}
}

class UcanYarasa extends Yarasa {
	public UcanYarasa() {
		System.out.println("UcanYarasa yapýlandýrýcýsý");
	}
}

public class IlkDegerVermeSirasi {

	public static void main(String[] args) {

		UcanYarasa uy = new UcanYarasa();

	}

}
