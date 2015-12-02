package examples;

class Kitap2 {
	public int sayfaSayisiOgren() {
		System.out.println("Kitap - sayfaSayisiOgren()");
		return 440;
	}

	public double fiyatOgren() {
		System.out.println("Kitap - fiyatOgren");
		return 2500000;
	}

	public String yazarIsmiOgren() {
		System.out.println("Kitap - yazarIsmiOgren");
		return "xy";
	}
}

class Roman2 extends Kitap2 {
	
	@Override
	public int sayfaSayisiOgren() {
		System.out.println("Roman - sayfaSayisiOgren()");
		return 569;
	}
	
	@Override
	public double fiyatOgren() {
		System.out.println("Roman - fiyatOgren");
		return 8500000;
	}

	public static void main(String[] args) {
		Roman2 r = new Roman2();
		int sayfasayisi = r.sayfaSayisiOgren();
		double fiyat = r.fiyatOgren();
		String yazar = r.yazarIsmiOgren();
	}

}
