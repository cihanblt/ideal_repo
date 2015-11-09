package examples;

public class OperatorTest {

	public static void main(String[] args) {

		char kr='a';
		int b=+kr;		//Otomatik olarak int temel türüne çevrildi. Bir nevi bu operator ile karakterlerin ASCI kodu oðrenilebilir.
		int c=-b;		//Deðeri eksi yapýldý

		System.out.println("kr = "+kr);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}

}
