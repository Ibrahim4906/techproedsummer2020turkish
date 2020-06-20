package day11stringmethods;

public class StringMethods02 {

	public static void main(String[] args) {
		// substring() methodu bir Stringin belli bir bolumunu kesip almak icin kullanilir.
		
		String str1 = "Java calisana kolaydir";
		// substring 1. versiyon
		System.out.println(str1.substring(5));  //5 indexi gosterir. Bu yuzden kodda 5 yaziyor.
												//Ekrana "calisana kolaydir" yazdirir. 
		
		System.out.println(str1.substring(8));  // Ekrana "isana kolaydir" yazdirir.
		System.out.println(str1.substring(22)); // Ekrana hicbirsey yazdirmaz. Cunku son harf bostur.
		//System.out.println(str1.substring(23));	// Index 23 yoktur. Bu yuzden Java "Exception" verir.
												// Buyuk Hata anlamindadir.
		System.out.println(str1.substring(0));  // Ekrana kendisini yazdirir. Bu yuzden kullanilmaz.
		
		// substring() 2. versiyon
		System.out.println(str1.substring(5,13));  // ilk index dahil, ikinci index harictir.										   
												   // Ekranda "calisana" yazdirir.
		System.out.println(str1.substring(6,12));  // Ekranda "alisan" yazdirir.
		System.out.println(str1.substring(6,6));   // Ekranda hicbirsey yazdirmaz.
		//System.out.println(str1.substring(7,6)); // Ekranda "Exception" yani hata verir.
												   // Hata vermemesi icin ilk index her zaman 
												   // kucuk veya esit olmali.
		
		
		
	}

}
