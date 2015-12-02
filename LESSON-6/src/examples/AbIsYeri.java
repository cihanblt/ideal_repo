package examples;

abstract class Calisan4 {
	public String pozisyon = "Cal��an";

	public abstract void calis(); // abstract(Soyut) yordam

	public void zamIste() {
		System.out.println(pozisyon + " Zam iste");
	}

	/*
	 * Bir class �n abstract olmas� i�in i�inde tan�mlanan en az bir methodun
	 * abstarct olmas� yeterlidir.
	 * 
	 * abstract methodlar�n g�vdesi bulunmaz
	 */
}

class Mudur4 extends Calisan4 {
	public Mudur4() {
		pozisyon = "M�d�r";
	}

	@Override
	public void calis() {
		System.out.println(pozisyon + " �al���yor");
	}

	/*
	 * Calisan4 abstarct s�n�f�ndan extend edilen Mudur4 s�n�f�nda abstract olan
	 * calis methodu override edilmez ise derleme an�nda hata aln�r.
	 */
}

class Programci4 extends Calisan4 {
	public Programci4() {
		pozisyon = "Programc�";
	}

	@Override
	public void calis() {
		System.out.println(pozisyon + " �al���yor");
	}

	@Override
	public void zamIste() {
		System.out.println(pozisyon + " Zam istiyor");
	}
}

class Pazarlamaci4 extends Calisan4 {
	public Pazarlamaci4() {
		pozisyon = "Pazarlamac�";
	}

	@Override
	public void calis() {
		System.out.println(pozisyon + " �al���yor");
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
		// c[0]=new Calisan4();//abstact classlar�n new ile instance'�
		// olu�turulamaz !!HATA!!
		c[0] = new Programci4();
		c[1] = new Pazarlamaci4();
		c[2] = new Mudur4();

		mesaiBasla(c);

		System.out.println();
		c[0].zamIste(); // Dikkat method override
	}

}
