package examples;

public class MutluAdam {

	private String ruh_hali="Mutluyum";
	
	public void ruhHaliniYansit(){
		System.out.println("Ben "+ruh_hali);
	}
	
	// equals metodu kar��la�t�rma(nesne) i�in kullan�l�r.
    // true yada false d�nd�r�r.
	public void tokatAt() {
		if(ruh_hali.equals("Mutluyum")){
			ruh_hali="Sinirlendim";
		}		
	}
	
	public void kucakla() {
		if(ruh_hali.equals("Sinirlendim")){
			ruh_hali="Mutluyum";
		}		
	}
	
	public static void main(String[] args) {
		MutluAdam obj1=new MutluAdam();
		MutluAdam obj2=new MutluAdam();
		
		obj1.ruhHaliniYansit();
		obj2.ruhHaliniYansit();
	
		obj1.kucakla();
		obj2.tokatAt();
		
		obj1.ruhHaliniYansit();
		obj2.ruhHaliniYansit();
		

	}

}
