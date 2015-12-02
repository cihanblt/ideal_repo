/*
 * Bir yordamýn içerisinde iki boyutlu temel float türünde dizi oluþturunuz.Dizinin boyutlarý yordama gelen parametreler ile belirlenmelidir.
 * Baþka bir yordamda bu dizi içerisindeki elemanlarý ekrana yazmalýdýr.Uygulama main() yordamý üzerinden sýnanabilir olamalýdýr.
 */
package questions;

public class Q_11 {
	
	int[][] int_array;
	
	public void diziBoyutVer(int x,int y) {
		int_array=new int[x][y];
		for (int i = 0; i < int_array.length; i++) {
			for (int j = 0; j < int_array[i].length; j++) {
				int_array[i][j]=i+j;
			}
		}
	}
	
	public void diziEkranaYaz(){
		for (int i = 0; i < int_array.length; i++) {
			for (int j = 0; j < int_array[i].length; j++) {
				System.out.print(int_array[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q_11 n=new Q_11();
		n.diziBoyutVer(4, 5);
		n.diziEkranaYaz();
	}

}
