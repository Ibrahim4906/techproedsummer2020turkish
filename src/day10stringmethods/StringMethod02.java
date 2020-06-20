package day10stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		// lastIndexOf() methodu aradigimiz characterin String icerisindeki son 
		// gorunumundeki indexi return eder.
		
		// lastIndexOf() methodu 1. versiyonu
		
		String str1 = "Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));// Ekrana 6 yazdirir. Cunku 'i' characterinin 
		// String icerisindeki son gorunumunun indexi 6'dir.
		
		System.out.println(str1.lastIndexOf('r'));// Ekrana 9 yazdirir.
		
		// lastIndexOf() methodu 2. versiyonu
		
		System.out.println(str1.lastIndexOf('i',7)); // Ekrana 6 yazdirir.
		System.out.println(str1.lastIndexOf('i',5)); // Ekrana 4 yazdirir.
		
		//  lastIndexOf() methodu 3. versiyonu
		String str2 = "rivrihisari";
		System.out.println(str2.lastIndexOf("his")); // Ekrana 5 yazdirir.
		System.out.println(str2.lastIndexOf("ri"));//String icerisindeki ri'nin son 
		//gorunumunu bulacak. Son ri' harfinin indexi olan 9'u return edecek.
		
		
		
	}

}
