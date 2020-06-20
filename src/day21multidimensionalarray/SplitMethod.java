package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		String str1 = "Ali Can okula basladi";
		// Split methodunu kullandiginizda mutlaka bir array kullanmak zorundasiniz.
		// Split ile bolunen parcalar boslukta kaldigi icin asagidaki gibi bir 
		// Array icine konulmalidir.
		
		String kelime[] = str1.split(" ");
		
		System.out.println(Arrays.toString(kelime));
		System.out.println("Kelime sayisi: " + kelime.length);
		
		
		String str2 = "Kahramanmaras";
		String harf[] = str2.split("");
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf Sayisi: " + harf.length);
	}

}
