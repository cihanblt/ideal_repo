package examples;

class A {
	public final void ekranaYaz() {
		System.out.println("A.ekranaYaz()");
	}
}

class B extends A {
	/*
	 * public void ekranaYaz(){
	 * 	System.out.println("B.ekranaYaz"); 
	 * }
	 */
}

public class FinalMetod {

	public static void main(String[] args) {
		B b = new B();
		b.ekranaYaz();
	}

}
/*
 * Ana sýnýftaki bir yordamýn, altsýnýflar tarafýndan override edilmesi
 * istenmiyorsa, o yardam final yapýlarak korunabilir.
 */