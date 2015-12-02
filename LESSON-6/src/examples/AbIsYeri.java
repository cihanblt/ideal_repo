package examples;

abstract class Calisan4 {
	public String pozisyon = "Calýþan";

	public abstract void calis(); // abstract(Soyut) yordam

	public void zamIste() {
		System.out.println(pozisyon + " Zam iste");
	}

	/*
	 * Bir class ýn abstract olmasý için içinde tanýmlanan en az bir methodun
	 * abstarct olmasý yeterlidir.
	 * 
	 * abstract methodlarýn gövdesi bulunmaz
	 */
}

class Mudur4 extends Calisan4 {
	public Mudur4() {
		pozisyon = "Müdür";
	}

	@Override
	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}

	/*
	 * Calisan4 abstarct sýnýfýndan extend edilen Mudur4 sýnýfýnda abstract olan
	 * calis methodu override edilmez ise derleme anýnda hata alnýr.
	 */
}

class Programci4 extends Calisan4 {
	public Programci4() {
		pozisyon = "Programcý";
	}

	@Override
	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}

	@Override
	public void zamIste() {
		System.out.println(pozisyon + " Zam istiyor");
	}
}

class Pazarlamaci4 extends Calisan4 {
	public Pazarlamaci4() {
		pozisyon = "Pazarlamacý";
	}

	@Override
	public void calis() {
		System.out.println(pozisyon + " Çalýþýyor");
	}
}

public class AbIsYeri {

	public static void mesaiBasla(Calisan4[] c) {
		for (int i = 0; i < c.length; i++) {
			c[i].calis();
		}
	}

	public static void main(String[] args) {
		Calisan4[] c = new Calisan4[3];
		// c[0]=new Calisan4();//abstact classlarýn new ile instance'ý
		// oluþturulamaz !!HATA!!
		c[0] = new Programci4();
		c[1] = new Pazarlamaci4();
		c[2] = new Mudur4();

		mesaiBasla(c);

		System.out.println();
		c[0].zamIste(); // Dikkat method override
	}

}
