/*
 * aaa.bbb paketinin i�erisinde, d��ar�dan ald��� 2 parametreyi ekrana yazd�ran bir uygulama yaz�n�z.
 */
package aaa.bbb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader sf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bilgi giriniz : ");
		String bilgi = sf.readLine();
		System.out.println("bilgi --> " + bilgi);

	}

}
