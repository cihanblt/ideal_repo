package examples;

class Kedi {
	public void yakalaAv() {
		System.out.println("Kedi sýnýfý av yakaladý");
	}
}

class Kaplan extends Kedi {
	public void yakalaAv() {
		System.out.println("Kaplan sýnýfý av yakaladý");
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
