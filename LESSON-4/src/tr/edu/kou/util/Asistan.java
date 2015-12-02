package tr.edu.kou.util;

import tr.edu.kou.gerekli.*;

public class Asistan {
	public void arastir() {
		System.out.println("Asistan Araþtýrýyor.");
	}

	public static void main(String[] args) {
		// new Profesor().kullan(); //A.M public olsaydý çalýþýrdý fakat
		// default(friendly olduðu için bu sýnýf baþka bir pakette olduðu için
		// çalýþmayacaktýr.)
		
		//new Profesor().kullan();	// Çalýþmasý için tr.edu.kou.gerekli.Profesor clasýnýn eriþim belirleyicisi public olmalýdýr.
	}
}
