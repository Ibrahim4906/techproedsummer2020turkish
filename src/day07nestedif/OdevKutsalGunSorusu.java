package day07nestedif;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		// Kullanicidan bir gun alin ve eger gun Cuma ise ....., eger gun cumartesi 
		// ise ......, pazar ise ........ ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gun giriniz");
		String gun = scan.next();
		if (gun.equalsIgnoreCase("Cuma")) { // equalsIgnoreCase () buyuk kucuk harfleri dikkate almadan
														 // esitlige bakar.Cuma, CUMA, cuma hepsini kabul eder.
			System.out.println("Muslumanlar icin kutsal gun");
		}
		
		else if (gun.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		
		else if (gun.equalsIgnoreCase("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
	}
		else { 
			System.out.println("Kutsal gun degil");
		}
	}
}
