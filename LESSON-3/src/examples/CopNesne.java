package examples;

public class CopNesne {

	public static void main(String[] args) {
		Elma e = new Elma(1);
		new Elma(2);
		System.gc();// ��p toplay�c�s�n� �a��rd�k.
	}

}
/*
 * System.gc() referans� olmayan nesneyi bellekten temizledi.
 */