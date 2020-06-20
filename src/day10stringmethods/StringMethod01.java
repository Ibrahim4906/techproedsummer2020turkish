package day10stringmethods;

public class StringMethod01 {

	public static void main(String[] args) {
		// indexOf() methodu Stringin icindeki characterin yerini 
		// belirlemek icin kullanilir.
		
		
		String str1 = "Java World";
		System.out.println(str1.indexOf("v"));
		//Ekrana 2 yazdirir. Cunku index sayimi 0'dan baslar. 
			
		System.out.println(str1.indexOf("W"));// Ekrana 5 yazdirir. //Space Java icin bir character'dir.
		
		System.out.println(str1.indexOf("w"));
		// Javada yukarida indexI bulamaz. Java "case sensitive" dir.
		// Kucuk w String'te yoktur. Java character bulamayinca -1 return eder.
		
		System.out.println(str1.indexOf("a"));// Ekrana 1 yazdirir. Birden fazla 
		// kullanilan characterler icin Java ilk character'in indexini verir.
		
		// indexOf methodu diger versiyonu:
		//"Javva" Stringinde asagidaki a characterinin farkli indexlerini bulunuz.
		String str4 = "Javva World";
		System.out.println(str4.indexOf("a",2));//Stringteki ikinci 'a' characterinin indexini bulunuz.
		// Ekrana 4 yazdirmali.
		
		System.out.println(str4.indexOf("a",4));// Ekrana 4 yazdirir.
		System.out.println(str4.indexOf("a",1));// Ekrana 1 yazdirir.
		System.out.println(str4.indexOf("a",5));// Ekrana -1 yazdirir.
		
		
		//"Alamanya" Stringindeki ikinci 'a' characterinin indexini bulunuz.
		
		String str2 = "Alamanya";
		System.out.println(str2.indexOf("a"));// Bu birinci 'a' nin indexi 2 
		int idx = str2.indexOf("a");
		System.out.println(str2.indexOf("a",idx+1));
		// indexOf methodunun 3.versiyonu
		String str3 = "Missisippi";
		System.out.println(str3.indexOf("is"));  // Java bir hecenin indexini yazarken ilk harfin indexini
		//return eder. Bu ornekte ilk "is" teki i harfinin indexi olan 1 i return eder. 
		
		System.out.println(str3.indexOf("si"));// Ekrana 3 yazdirir.
	}

}
