 package day11stringmethods;

public class StringMethods03 {

	public static void main(String[] args) {
		// concat() mehtod concatenation yapmanin, yani iki Stringi birlestirmenin diger yontemidir.
		
		String str1 = "Ali"; 
		String str2 = "Veli"; 
		
		System.out.println(str1+str2);  // Ekranda AliVeli yazdirir.
		
		System.out.println(str1.concat(str2)); // Ekranda AliVeli yazdirir.
		System.out.println(str1.concat(str2).concat(str1));// Ekrana AliVeliAli yazdirir.
														   // concat istenildigi kadar ardarda kullanilabilir.
		
		// replace() methodu bir characterin butun gorunumlerinin yerine baska bir chracter yazmaya yarar.
		// Ornek ata yerine ana yazmak istiyorsunuz.
		// replace 1. versiyon
		String str3 = "ata";
		System.out.println(str3.replace("t", "n"));
		System.out.println(str3.replace("a", "u"));// bu methodda gecici degisiklik yapilir.
												   // ilk yapilan degisiklik ikincisini etkilemez.
		System.out.println(str3.replace("x", "y"));// Ekrana "ata" yazdirir. Bir degisiklik olmaz.
		
		System.out.println(str3.replace("", "y"));// Ekrana "yaytyay" yazdirir.
		System.out.println(str3.replace("", "/"));// Ekrana "/a/t/a/" yazadiri.
		System.out.println(str3.replace("t", " ")); // Ekrana "aa"" yazdirir.
		System.out.println(str3.replace("at", "Mustaf")); // Ekrana "Mustafa" yazdirir.
		System.out.println(str3.replace("a", "")); // Ekrana "t" yazdirir.
		
		// replace 2. versiyon
		// replaceFirst() methodu degistirmek istedigimiz characterin sadece ilk gorunumunu degistirir.
		
		String str4 = "karakartal";
		System.out.println(	str4.replaceFirst("k","K")); // "Karakartal"
		System.out.println(	str4.replaceFirst("a","e")); // "kerakartal"
		System.out.println(	str4.replaceFirst("ka","A"));// "Arakartal"	
		System.out.println(	str4.replaceFirst("kar",""));// "akartal"
		System.out.println(	str4.replaceFirst("kara","A"));// "Akartal"
		//Soru
	    String text = "Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali yemek yedi. Ali uyudu.";
	    System.out.println(text.replace("Ali", "Veli"));
		// replace 3. versiyon 
		
	    //replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar.
		//replace() methodunda isterseniz 
	    //tek harfli karakterler icin tek tirnak kullanabilirsiniz. 
		//Fakat replaceAll() da tek tirnak kullanilamaz.

	}

}
