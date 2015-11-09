package examples;

public class VarargsTest {

	public static void main(String[] args) {
		ekranaYaz("selamlar");
		ekranaYaz("selamlar","naber");
		ekranaYaz("Bugün","hava","çok","sýcak");

	}
	
	public static void ekranaYaz(String... parametreler) {
		System.out.println("------------");
		for (String param: parametreler) {
			System.out.println(" "+param);
		}
	}
}
