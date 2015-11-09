package examples;

class MuzikDosyasi {
	String m_tur = "M�zik Dosyas�";
}

class ResimDosyasi {
	String r_tur = "Resim Dosyas�";
}

class TextDosyasi {
	String t_tur = "Text Dosyas�";
}

public class YordamOverloadingDemo1 {

	public void dosyaAc(MuzikDosyasi md) {
		System.out.println("T�r = " + md.m_tur);
	}

	public void dosyaAc(ResimDosyasi rd) {
		System.out.println("T�r = " + rd.r_tur);
	}

	public void dosyaAc(TextDosyasi td) {
		System.out.println("T�r = " + td.t_tur);
	}

	public static void main(String[] args) {

		YordamOverloadingDemo1 mod1 = new YordamOverloadingDemo1();
		MuzikDosyasi md = new MuzikDosyasi();
		ResimDosyasi rd = new ResimDosyasi();
		TextDosyasi td = new TextDosyasi();
		
		mod1.dosyaAc(md);
		mod1.dosyaAc(rd);
		mod1.dosyaAc(td);

	}

}

/*
 * 
 * Bir yordam isminin birden �ok yordam i�in kullan�lmas� method overloading dir.
*/