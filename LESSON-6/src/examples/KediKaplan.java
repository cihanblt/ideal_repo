package examples;

class Kedi {
	public void yakalaAv() {
		System.out.println("Kedi s�n�f� av yakalad�");
	}
}

class Kaplan extends Kedi {
	public void yakalaAv() {
		System.out.println("Kaplan s�n�f� av yakalad�");
	}
	public static void goster(Kedi k) {
		k.yakalaAv();
	}
}

public class KediKaplan {



	public static void main(String[] args) {
		Kedi k = new Kedi();
		Kaplan kp = new Kaplan();
		Kaplan.goster(k);
		Kaplan.goster(kp);	//Upcasting...

	}

}
