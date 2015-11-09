package examples;

class Hayvan2 {
	public Hayvan2() {
		System.out.println("Hayvan2 yapýlandýrýcýsý");
	}

	protected void finalize() {
		System.out.println("Hayvan2 nesnesi silindi");
	}
}

class Yarasa2 extends Hayvan2 {
	public Yarasa2() {
		System.out.println("Yarasa2 yapýlandýrýcýsý");
	}

	protected void finalize() {
		System.out.println("Yarasa2 nesnesi silindi");
	}
}

class UcanYarasa2 extends Yarasa2 {
	public UcanYarasa2() {
		System.out.println("UcanYarasa2 yapýlandýrýcýsý");
	}

	protected void finalize() {
		System.out.println("UcanYarasa2 nesnesi silindi");
	}
}

public class IlkDegerVermeSirasi2 {

	public static void main(String[] args) {

		new UcanYarasa2();
		System.gc();
	}

}
