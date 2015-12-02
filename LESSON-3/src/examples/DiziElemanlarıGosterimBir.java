package examples;

public class DiziElemanlarýGosterimBir {

	public static void main(String[] args) {
		double[] d = { 2.1, 3.4, 4.6, 1.1, 0.11 };
		String[] s = { "defter", "kalem", "sarman", "tekir", "boncuk" };

		// double türündeki diziyi yazdýrýyoruz

		for (int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		System.out.println("--------------------------");
		// String türündeki diziyi yazdýrýyoruz
		for (int i = 0; i < s.length; i++) {
			System.out.println("s[" + i + "] = " + s[i]);
		}
	}

}
