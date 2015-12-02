package examples;

public class VarargsTest {

	public static void main(String[] args) {
		ekranaYaz("selamlar");
		ekranaYaz("selamlar","naber");
		ekranaYaz("Bug�n","hava","�ok","s�cak");

	}
	
	public static void ekranaYaz(String... parametreler) {
		System.out.println("------------");
		for (String param: parametreler) {
			System.out.println(" "+param);
		}
	}
}
