package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		// Kullanicidan yasadigi ulkenin ismini aliniz.
		// Bu ulkenin bastan ikinci harfi ile sondan ikinci
		// harfini buyuk harf olarak ekrana yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yasadiginiz ulkenin ismini giriniz.");
		String ulke = scan.nextLine();
		
		// Almanya ==> length 7, 
		
		System.out.println(ulke.toUpperCase().charAt(1));// 2. harfin indexi 1'dir.
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2)); // sondan ikinci harfin indexi (length()-2) seklinde calisir.
		scan.close();
	}

}
