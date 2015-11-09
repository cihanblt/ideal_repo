package examples;

public class ToplamaIslem {

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Ltf iki adet sayý giriniz");
			System.exit(-1); // uygulama sonlanacaktýr
		}

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);

		double sonuc = Toplama.topla(a, b); // Dikkat
		System.out.println("Sonuc = " + sonuc);

	}

}
