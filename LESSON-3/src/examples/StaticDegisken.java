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
		// sd1.x = 10; // x=10 ile ayn� etkiyi yapar.
		// sd2.x = 10; // x=10 ile ayn� etkiyi yapar.
		sd1.y = 2;
		sd2.y = 8;
		ekranaBas(sd1);
		ekranaBas(sd2);

	}

}

/*
 * Global alanlar� t�r olarak iki �e�ide ay�rabiliriz: statik olan global alanlar ve nesnelere ait global alanlar.
 * Statik alanlar, s�n�fa ait olan alanlard�r ve bu s�n�fa ait t�m nesneler i�in ortak bir bellek alan�nda bulunurlar,
 * ayr�ca statik alanlara sadece birkez ilk de�er atan�r.
 * */