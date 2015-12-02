package examples;

import java.io.*;

public class PaketKullanim {

	public static void main(String[] args) throws IOException {
		BufferedReader sf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bilgi giriniz : ");
		String bilgi = sf.readLine();
		System.out.println("bilgi --> " + bilgi);
	}

}
