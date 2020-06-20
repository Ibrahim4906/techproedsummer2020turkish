package day12scopewhileloop;

public class ScopeKurallari {
	int toplama;
	public static void main(String[] args) {
		// Scope kapsam demektir. Olusturdugunuz bir variable'i nerelerde 
		// kullanabilecegimizi gosterir.
		
		int toplama = 4;
		String carpma = "Kalem";
		
	}
	
	public static void toplama() {
		
		int toplama3 = 12;
		
		System.out.println("Toplama");
	}
		
	public static void carpma() {
		
		System.out.println("Carpma");
		
		
		}
	
	}
		
	// 1. Kural : Class'in icinde, method'larin disinda olan variable'lari butun methodlar 
	// istedikleri zaman kullanabilirler. Bu variable'lara "Class Variable" veya "Instance Variable" denir.
	// Instance : Gorunur demektir.
	// Class variable'lara deger atamasi yapmazsak Java onlara default degerler verir. Java tum sayilar
	// icin default olarak 0 degeri verir.

	// 2. Kural : Bir methodun body'si icinde olusturulan variable'lar sadece o methodun icinde 
	// kullanilabilir. Diger methodlar bu variable'i kullanamaz. Methodun icerisinde olusturulan
	// bu variable'lara "Local Variable" denir.
	// ONEMLI: Methodun Body'si icinde olusturulan variable'lara deger atamak zorundayiz.Java onlara 
	// default degerler vermez. 

	// 3. Kural : Methodlarin parantezleri icinde olusturulan variable'lar local variable'lar gibi
	// sadece o methodlarin bodyleri icinde kullanilabilir. 
	// Bu vaiable'lara da local variable
	// denir. Parantez icinde olusturulan variable'lara ise deger atamasi yapmayiniz.
	
	// 4. Kural: Bir variable'i kullanmaya baslamadan once tanimlamaliyiz.
	// Once num = num + 2 sonra int num= 12 diyemeyiz.
	// Once int num = 12 sonra num = num +2 diyebiliriz. 

