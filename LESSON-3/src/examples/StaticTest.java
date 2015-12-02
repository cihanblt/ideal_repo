package examples;

public class StaticTest {

	public static void hesapla(int a, int b) {
		/*
		 * static yordam do�rudan nesneye ait bir yordam� �a��ramaz
		 */
		// islemYap(a,b); // Hata!
		System.out.println(a+b);
	}

	public void islemYap(int a, int b) {
		/*
		 * do�ru nesneye ait bir yordam static yordam� �a��rabiliri *
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
*Static olmayan yordamlardan (nesneye ait yordamlar) static yordamlar� rahatl�kla �a�r�labilmesine kar��n,
*static tordamlardan nesne tordamlar� do�rudan �a��r�lamaz.
*
*/