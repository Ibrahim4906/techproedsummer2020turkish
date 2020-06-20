package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
	byte by1 = 101;
	int sayi1 = by1;// Kücük data tipini büyük data tipine cevirmek icin extra kod yazmaya gerek 
				   // yok. Java bunu otomatik olarak yapiyor.
	
	System.out.println("int casting degeri: " + sayi1);//Cevap: 101
	
	int sayi2 = 53;
	byte by2 = (byte)sayi2;// Büyük data tipini kücük data tipine cevirmeyi Java yapmaz.
		
	System.out.println(by2);
	
	double sayi3 = 23.5; // Console da okudugumuz sayi 23. 
	int by3 = (int) sayi3;
	System.out.println(by3);

	float sayi4 = -23.9f;
	short by4 = (short) sayi4;
	System.out.println(by4);
	
	System.out.println("Byte max. degeri: " + Byte.MAX_VALUE);
	System.out.println("Byte min. degeri: " + Byte.MIN_VALUE);
	
	System.out.println("Short max. degeri: " + Short.MAX_VALUE);
	System.out.println("Short min. degeri: " + Short.MIN_VALUE);
	
	byte b1 = 123;
	short s1 = b1;
	System.out.println("byte short'a type casting yapildiktan sonra: " + s1); // 
	
	short s2 = 3000;
	byte b2 = (byte)s2;
	System.out.println("short byte'a typecasting yapildiktan sonra: " + b2);
	
	
	double sayi5 = 4.8;
	double sayi6 = 1.4;
	double sonuc1 = sayi5 / sayi6;
	System.out.println(sonuc1);
	
	int sonuc2 = (int) (sayi5 / sayi6);
	System.out.println(sonuc2);
	
	int sayi7 = 5;
	int sayi8 = 3;
	
	int sonuc3 = (sayi7 / sayi8);
	System.out.println(sonuc3);// int. oldugu icin sonuc 1 olarak yazilir. Küsüratlar 
							   // iptal edilir. Int. tam sayi kullanilir. 
	
	int sayi9 = 255;
	byte by5 = (byte) sayi9;
	System.out.println(by5);// byte da 256 sayi var. 255 olunca sonuc -1 olarak verir.
	
	
	int sayi10 = 556;
	byte by6 = (byte) sayi10;
	System.out.println(by6);
	
	
	{
		
		int num1 = 5/2;
		System.out.println(num1);
		
		float num2 = 5f/2f;
		System.out.println(num2);
		
		double num3 = 5d/2d;
		System.out.println(num3);	
		
	System.out.println(Math.pow(6,3));
	System.out.println(Math.sqrt(625));
	
		
	}
	
	
	
	}

}
