package examples;

public class StaticTest {

	public static void hesapla(int a, int b) {
		/*
		 * static yordam doðrudan nesneye ait bir yordamý çaðýramaz
		 */
		// islemYap(a,b); // Hata!
		System.out.println(a+b);
	}

	public void islemYap(int a, int b) {
		/*
		 * doðru nesneye ait bir yordam static yordamý çaðýrabiliri *
		 */
		hesapla(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticTest sd=new StaticTest();
		StaticTest.hesapla(11, 12);
		hesapla(5, 1);
		sd.islemYap(10, 15);

	}

}
/*
*Static olmayan yordamlardan (nesneye ait yordamlar) static yordamlarý rahatlýkla çaðrýlabilmesine karþýn,
*static tordamlardan nesne tordamlarý doðrudan çaðýrýlamaz.
*
*/