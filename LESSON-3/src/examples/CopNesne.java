package examples;

public class CopNesne {

	public static void main(String[] args) {
		Elma e = new Elma(1);
		new Elma(2);
		System.gc();// Çöp toplayýcýsýný çaðýrdýk.
	}

}
/*
 * System.gc() referansý olmayan nesneyi bellekten temizledi.
 */