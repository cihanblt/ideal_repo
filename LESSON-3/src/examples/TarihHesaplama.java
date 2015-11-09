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
 * this anahtar sözcüðü içinde bulunulan nesneye ait bir referans döndürür; bunun sayesinde nesnenelere ait global alanlara eriþme fýrsatý bulunur.
 * Nesnelere ait global alanlar, içinde bulunduklarý nesnelere ait alanlardýr ve 
 * nesne içerisindeki her statik olmayan yordam tarafýndan doðrudan eriþilebilirler
 * 
 * */