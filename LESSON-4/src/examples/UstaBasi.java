package examples;

import tr.edu.kou.util.*;

public class UstaBasi {

	public static void main(String[] args) {

		Makine m = new Makine();
		//int devir_sayisi = m.devir_sayisi;	//Hata,eri�emez
		m.degerAta(6);
		int devir_sayisi=m.degerAl();
		String model=m.model;
		System.out.println(model+" devir say�s� "+devir_sayisi);
		//m.calis();	//Hata,eri�emez
	}

}
