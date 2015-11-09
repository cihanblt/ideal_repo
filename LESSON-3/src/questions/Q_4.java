/*
 * Toplam 10 elemanlý ve elemanlarýnýn tipi String olan bir dizi oluþturup bu dizi elemanlarýna String deðerkeri atayýnýz.
 * Daha sonra for döngüsüyle dizi içerisindeki elemanlarý ekranan yazan bir uygulama yazýnýz.
 */
package questions;

class PasaKonusur {
	static String[] kelime = new String[10];

	public PasaKonusur() {
		kelime[0] = new String("Paþa");
		kelime[1] = new String("Babacýk");
		kelime[2] = new String("Cici Kuþ");
		kelime[3] = new String("Aþkým");
		kelime[4] = new String("Annem");
		kelime[5] = new String("Hasan");
		kelime[6] = new String("Beþiktaþ");
		kelime[7] = new String("Pezevenk");
		kelime[8] = new String("Koþ Koþ");
		kelime[9] = new String("Kuuuuuþ");
	}

	public void ekranaBas() {
		for (int i = 0; i < kelime.length; i++) {
			System.out.println("Paþa Konuþuyor = " + kelime[i]);
		}

	}
}

public class Q_4 {

	public static void main(String[] args) {
		new PasaKonusur().ekranaBas();
	}

}
