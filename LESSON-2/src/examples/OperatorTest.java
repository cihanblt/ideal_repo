package examples;

public class OperatorTest {

	public static void main(String[] args) {

		char kr='a';
		int b=+kr;		//Otomatik olarak int temel t�r�ne �evrildi. Bir nevi bu operator ile karakterlerin ASCI kodu o�renilebilir.
		int c=-b;		//De�eri eksi yap�ld�

		System.out.println("kr = "+kr);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}

}
