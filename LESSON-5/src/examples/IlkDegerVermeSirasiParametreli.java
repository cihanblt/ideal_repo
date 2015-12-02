package examples;

class Insan {
	public Insan(int par) {
		System.out.println("Insan yapýlandýrýcýsý		->	" + par);
	}

	protected void finalize() {
		System.out.println("Insan nesnesi silindi");
	}
}

class ZekiInsan extends Insan {
	public ZekiInsan(int par) {
		super(par + 1);
		System.out.println("ZekiInsan yapýlandýrýcýsý	->	" + par);
	}

	protected void finalize() {
		System.out.println("ZekiInsan nesnesi silindi");
	}
}

class Hacker extends ZekiInsan {
	public Hacker(int par) {
		super(par + 1);
		System.out.println("Hacker Yapýlandýrýcýsý		->	" + par);
	}
	
	protected void finalize() {
		System.out.println("Hacker nesnesi silindi");
	}
	
}

public class IlkDegerVermeSirasiParametreli {

	public static void main(String[] args) {
		new Hacker(5);
		System.gc();
	}

}
