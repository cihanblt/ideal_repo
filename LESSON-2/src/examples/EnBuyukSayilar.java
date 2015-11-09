package examples;

public class EnBuyukSayilar {

	public static void ekranaBas(String deger) {

		System.out.println(deger);

	}

	public static void main(String[] args) {

		// Tamsayýlar

		byte enbuyukByte = Byte.MAX_VALUE;
		short enbuyukShort = Short.MAX_VALUE;
		int enbuyukInteger = Integer.MAX_VALUE;
		long enbuyukLong = Long.MAX_VALUE;

		ekranaBas("enbuyukByte --> " + enbuyukByte);
		ekranaBas("enbuyukShort --> " + enbuyukShort);
		ekranaBas("enbuyukInteger --> " + enbuyukInteger);
		ekranaBas("enbuyukLong --> " + enbuyukLong);

		// Gerçel sayýlar

		float enbuyukFloat = Float.MAX_VALUE;
		double enbuyukDouble = Double.MAX_VALUE;

		ekranaBas("enbuyukFloat --> " + enbuyukFloat);
		ekranaBas("enbuyukDouble --> " + enbuyukDouble);

		// Diðer temel türler

		char birChar = 'S';
		boolean birBoolean = true;

		ekranaBas("birChar --> " + birChar);
		ekranaBas("birBoolean --> " + birBoolean);

	}

}
