package examples;

public class TestStatic {
	
	public static void uyariYap(){
		System.out.println("Diakkat Dikkat");
	}
	
	public static void main(String[] args) {
		
		uyariYap();				//Ayn� Class i�inde oldu�u i�in direkt static yordam �a��r�labilir.
		TestStatic.uyariYap();	//Varsau�lan static yodam �a��r�m�

	}

}
