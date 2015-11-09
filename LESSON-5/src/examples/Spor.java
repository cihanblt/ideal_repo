package examples;

class KontrolMerkezi{
	public static void checkUp(Sporcu s) {
		s.calis();
	}
}

class Sporcu{
	public void calis() {
		System.out.println("Sporcu.calis()");
	}
}

class Futbolcu extends Sporcu {

	public void calis() {	//iptal edildi overriding
		System.out.println("Futbolcu.calis()");
	}
	
	public static void main(String[] args) {
		Sporcu s=new Sporcu();
		Futbolcu f=new Futbolcu();
		KontrolMerkezi.checkUp(s);
		KontrolMerkezi.checkUp(f);	//Dikkat!
	}

}

/*
Sporcu.calis()
Futbolcu.calis()
*/