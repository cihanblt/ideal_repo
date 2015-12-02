package examples;

class Kedi2 {
	public final void yakalaAv() {	//Dikkat
		System.out.println("Kedi2 sýnýfý av yakaladý");
	}
}

class Kaplan2 extends Kedi2 {
	/*
	public void yakalaAv() {
		System.out.println("Kaplan2 sýnýfý av yakaladý");
	}
	*/
	public static void goster(Kedi2 k) {
		k.yakalaAv();
	}
}

public class KediKaplan2 {



	public static void main(String[] args) {
		Kedi2 k = new Kedi2();
		Kaplan2 kp = new Kaplan2();
		Kaplan2.goster(k);
		Kaplan2.goster(kp);	//Upcasting...

	}

}
