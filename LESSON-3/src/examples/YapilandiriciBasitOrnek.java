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
 *Yap�land�r�c�lar(Constructor) verilen isismler Class isimleri ile birebir ayn� olmal�d�r.
 *Yap�land�r�c� yordamlar, di�er yordamlar gibi de�er d�nd�rmezler.
 *Bu de�er d�nd�rmez ibaresi yordamlardaki void ibaresine kar��l�k gelmemektedir.
 *
 * */