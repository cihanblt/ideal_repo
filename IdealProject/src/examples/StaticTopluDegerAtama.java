package examples;

class Kopek {
	public Kopek() {
		System.out.println("Hav Hav");
	}
}

public class StaticTopluDegerAtama {

	static int x;
	static double y;
	static Kopek kp;

	static {
		x = 5;
		y = 6.89;
		kp = new Kopek();
	}

	public static void main(String[] args) {
		new StaticTopluDegerAtama();
		System.out.println("x -> " + x);
		System.out.println("y -> " + y);
		System.out.println("kp -> " + kp);
	}

}

/*
 * Static alanlara toplu deðer atama
 * 
 * Static alanlara toplu deðer vermek için kullanýlan bu öbek, yalnýzca,
 * StaticTopluDeperAtama sýnýfýndan nesne oluþturulduðu zaman veya bu sýnýfa ait
 * herhangi bir static alana eriþilmeye çalýþýldýðý zaman (static alanlara
 * eriþmek için ilgili sýnýfa ait bir nesne oluþturmak zorunda deðilsiniz), bir
 * kez çaðýrýlýr.
 *
 */