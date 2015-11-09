package examples;

import java.awt.HeadlessException;

public class StaticDegisken {

	public static int x;
	public int y;

	public static void ekranaBas(StaticDegisken sd) {
		System.out.println("StaticDegisken.x = " + sd.x + " StaticDegisken.y = " + sd.y);
	}

	public static void main(String[] args) {
		StaticDegisken sd1 = new StaticDegisken();
		StaticDegisken sd2 = new StaticDegisken();
		x = 10;
		// sd1.x = 10; // x=10 ile ayný etkiyi yapar.
		// sd2.x = 10; // x=10 ile ayný etkiyi yapar.
		sd1.y = 2;
		sd2.y = 8;
		ekranaBas(sd1);
		ekranaBas(sd2);

	}

}

/*
 * Global alanlarý tür olarak iki çeþide ayýrabiliriz: statik olan global alanlar ve nesnelere ait global alanlar.
 * Statik alanlar, sýnýfa ait olan alanlardýr ve bu sýnýfa ait tüm nesneler için ortak bir bellek alanýnda bulunurlar,
 * ayrýca statik alanlara sadece birkez ilk deðer atanýr.
 * */