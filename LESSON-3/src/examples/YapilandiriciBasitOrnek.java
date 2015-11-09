package examples;

class KahveFincani {
	public KahveFincani() {
		System.out.println("KahveFincani");
	}
}

public class YapilandiriciBasitOrnek {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			new KahveFincani();
		}

	}

}

/*
 *Yapýlandýrýcýlar(Constructor) verilen isismler Class isimleri ile birebir ayný olmalýdýr.
 *Yapýlandýrýcý yordamlar, diðer yordamlar gibi deðer döndürmezler.
 *Bu deðer döndürmez ibaresi yordamlardaki void ibaresine karþýlýk gelmemektedir.
 *
 * */