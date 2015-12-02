package examples;

import tr.edu.kou.util.*;

public class UstaBasi {

	public static void main(String[] args) {

		Makine m = new Makine();
		//int devir_sayisi = m.devir_sayisi;	//Hata,eriþemez
		m.degerAta(6);
		int devir_sayisi=m.degerAl();
		String model=m.model;
		System.out.println(model+" devir sayýsý "+devir_sayisi);
		//m.calis();	//Hata,eriþemez
	}

}
