package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startsWith() methodu bir Stringin istenilen harfle baslayip baslamadigini kontrol eder.
		// Eger istenilen harf ile basliyor ise True, baslamiyorsa False return eder.
		
		String str1 = "Ali Can";
		// startWith() 1. versiyon
		
		System.out.println(str1.startsWith("A")); // true
		System.out.println(str1.startsWith("B")); // false
		System.out.println(str1.startsWith("Ali")); // true
		
		// starstWith() 2. versiyon
		System.out.println(str1.startsWith("a", 3)); // false
		System.out.println(str1.startsWith("a", 5)); // true
		
		System.out.println(str1.startsWith("Can", 4));
		
		// endsWith() methodu bir Stringin istenilen harfle bitip bitmedigini kontrol eder.
		// Eger istenilen harf ile bitiyor ise True, baslamiyorsa False return eder.
		
		String str2 = "Ayse Canan";
		System.out.println(str2.endsWith("n"));  // true
		System.out.println(str2.endsWith("Canan")); // true
		System.out.println(str2.endsWith("")); // true ( cunku Java bitiminde hicbirsey
											   // olmamasindan dolayi bu durumu dogru kabul eder.
		System.out.println(str2.endsWith(" ")); // false
		String str3 = "Ali ";
		System.out.println(str3.endsWith(" "));  // true
		System.out.println(str3.endsWith(""));	 // true
		
	}

}
