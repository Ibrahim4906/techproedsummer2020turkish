package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {
		// Verilen bir cumledeki bosluklar haric karakter sayisini bulunuz.
		// 1. yol:
		String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		str = str.replace(" ", "");
		String cumle[] = str.split("");
		System.out.println(Arrays.toString(cumle));
		System.out.println("Karakter sayisi: " + cumle.length);
		
		//2. yol : 
		String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
		String kelime[] = str1.split(" ");
		int boslukSayisi = kelime.length - 1; // Bosluk sayisi cumle icindeki kelime sayisindan
											  // daima bir azdir.
		System.out.println(boslukSayisi);
		
		String character[] = str1.split("");// Bu kod bosluk dahil tum karakter sayisini verir.
		System.out.println(character.length - boslukSayisi);// Bu kod ile cumlemizdeki karakter 
															// sayisini elde etmis oluruz.
	}

}
