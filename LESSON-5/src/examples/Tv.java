package examples;

final class Televizyon {
	public void kanalBul() {
		System.out.println("Kanal bulunuyor");
	}
}

/*
 * HATALI!! final class extends edilemez. class SuperTelevizyon extends
 * Televizyon{
 * 
 * }
 */
class Ev {
	int oda_sayisi = 5;
	Televizyon tv = new Televizyon();

	public static void main(String[] args) {
		Ev e = new Ev();
		e.tv.kanalBul();
	}
}
