/*
 * Toplam 10 elemanl� ve elemanlar�n�n tipi String olan bir dizi olu�turup bu dizi elemanlar�na String de�erkeri atay�n�z.
 * Daha sonra for d�ng�s�yle dizi i�erisindeki elemanlar� ekranan yazan bir uygulama yaz�n�z.
 */
package questions;

class PasaKonusur {
	static String[] kelime = new String[10];

	public PasaKonusur() {
		kelime[0] = new String("Pa�a");
		kelime[1] = new String("Babac�k");
		kelime[2] = new String("Cici Ku�");
		kelime[3] = new String("A�k�m");
		kelime[4] = new String("Annem");
		kelime[5] = new String("Hasan");
		kelime[6] = new String("Be�ikta�");
		kelime[7] = new String("Pezevenk");
		kelime[8] = new String("Ko� Ko�");
		kelime[9] = new String("Kuuuuu�");
	}

	public void ekranaBas() {
		for (int i = 0; i < kelime.length; i++) {
			System.out.println("Pa�a Konu�uyor = " + kelime[i]);
		}

	}
}

public class Q_4 {

	public static void main(String[] args) {
		new PasaKonusur().ekranaBas();
	}

}
