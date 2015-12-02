package examples;

public class TarihHesaplama {

	int gun, ay, yil;

	public void gunEkle(int gun) {
		this.gun += gun;
	}

	public void gunuEkranaBas() {
		System.out.println("Gun = " + gun);
	}

	public static void main(String[] args) {
		TarihHesaplama th = new TarihHesaplama();
		th.gunEkle(2);
		th.gunEkle(3);
		th.gunuEkranaBas();

	}

}

/*
 * this anahtar s�zc��� i�inde bulunulan nesneye ait bir referans d�nd�r�r; bunun sayesinde nesnenelere ait global alanlara eri�me f�rsat� bulunur.
 * Nesnelere ait global alanlar, i�inde bulunduklar� nesnelere ait alanlard�r ve 
 * nesne i�erisindeki her statik olmayan yordam taraf�ndan do�rudan eri�ilebilirler
 * 
 * */