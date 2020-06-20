package javapracticeday8_hamza;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		// Santimetreyi, metreye ve kilometreye çeviren bir program yazınız.
		// Çıktı : 		 Lütfen santimetre değerini giriniz:		 	
		// 212		 212 santimetre 2.12 metre ve 0.00212 kilometreye eşittir.
		//  İpucu : 100 cm = 1 mt = 0.001 kilometre			 
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir deger giriniz");
		int santimetre = scan.nextInt();
		
		float metre = santimetre / 100f;
		float kilometre = santimetre / 100000f;
		
		System.out.println("kilometre degeri: " + metre);
		System.out.println("metre degeri: " + kilometre);
		}
	}

	
		/*Istenirse bu soru asagidaki gibi method hazirlanip degerlerden cagirilarak da yapilabilir.
		System.out.println("\ngetMetre " + getMetre(santimetre));
		System.out.println("getKilometre " + getKilometre(santimetre));
	

	}
	private static float getMetre(int santimetre) {
		return santimetre / 100.0f; 
		
	}
	private static float getKilometre(int santimetre) {
		return santimetre / 100000f; 
		
	}
	
*/
	