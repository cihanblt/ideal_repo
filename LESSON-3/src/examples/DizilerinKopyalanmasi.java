package examples;

public class DizilerinKopyalanmasi {

	public static void main(String[] args) {
		int[] dizi1 = { 1, 2, 3, 4 };
		int[] dizi2 = { 100, 90, 78, 45, 40, 30, 20, 10 };
		System.arraycopy(dizi1, 0, dizi2, 0, dizi1.length);
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println("dizi2[" + i + "] = " + dizi2[i]);
		}
	}

}
