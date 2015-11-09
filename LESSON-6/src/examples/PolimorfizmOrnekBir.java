package examples;

class Asker {
	public void selamVer() {
		System.out.println("Asker selam verdi");
	}
}

class Er extends Asker {
	public void selamVer() {
		System.out.println("Er selam verdi");
	}
}

class Yuzbasi extends Asker {
	public void selamVer() {
		System.out.println("Yüzbaþý selam verdi");
	}
}

public class PolimorfizmOrnekBir {

	public static void hazirOl(Asker a) {
		a.selamVer(); // Dikkat
	}

	public static void main(String[] args) {
		Asker a = new Asker();
		Er e = new Er();
		Yuzbasi y = new Yuzbasi();
		hazirOl(a); // Yukarý Çevrim yok
		hazirOl(e); // Yukarý Çevrim
		hazirOl(y); // Yukarý Çevrim
	}

}
