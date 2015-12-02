package examples;

import java.util.Arrays;

public class DiziSiralama {

	public static void ekranaBas(double[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
	}

	public static void main(String[] args) {
		double[] d = new double[9];
		d[0] = 2.45;
		d[1] = 3.45;
		d[2] = 4.78;
		d[3] = 1.45;
		d[4] = 15.12;
		d[5] = 1;
		d[6] = 9;
		d[7] = 15.32;
		d[8] = 78.17;
		System.out.println("Kar���k s�rada");
		ekranaBas(d);
		Arrays.sort(d);
		System.out.println("S�ralanm�� s�rada");
		ekranaBas(d);
	}

}
/*
 * Dizi elemanlar�n� b�y�kten k����e s�ralamak i�in java.util paketinin
 * alt�ndaki Arrays s�n�f� kullan�labilir.Bu s�n�f�n static sort yordam�
 * sayesinde dizilerin i�erisindeki elemanlar s�ralanabilir.
 *
 */