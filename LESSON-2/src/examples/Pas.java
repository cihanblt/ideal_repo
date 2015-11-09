package examples;
class Harf{
	char c;
}
public class Pas {

	static void f(Harf h){
		h.c='z';
	}
	
	public static void main(String[] args) {
		
		Harf x=new Harf();	// x referansý ile Harf nesnesi oluþturuluyor.
		x.c='a';			// Harf nesnesinin c alanýna deðer atandý.
		System.out.println("1 : x.c: "+x.c);
		
		f(x);				//Dikkat yordama referans gönderildi.
		
		System.out.println("2 : x.c: "+x.c);

	}

}
