package examples;

public class TestStatic {
	
	public static void uyariYap(){
		System.out.println("Diakkat Dikkat");
	}
	
	public static void main(String[] args) {
		
		uyariYap();				//Ayný Class içinde olduðu için direkt static yordam çaðýrýlabilir.
		TestStatic.uyariYap();	//Varsauýlan static yodam çaðýrýmý

	}

}
