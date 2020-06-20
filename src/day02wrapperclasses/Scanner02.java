package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		// Kullanici karenin bir kenar uzunlugunu girsin. Biz de karenin cevresini ve
		// alanini bululalim. Karenin alani a*a , cevresi a+a+a+a dir.
				
				Scanner scan = new Scanner(System.in);
				
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz.");
		
		int kenarUzunlugu = scan.nextInt();
		int alan = (kenarUzunlugu * kenarUzunlugu);
		int cevre = (kenarUzunlugu + kenarUzunlugu + kenarUzunlugu + kenarUzunlugu);
		System.out.println("Karenin alani: " + alan);
		System.out.println("Karenin cevresi: " + cevre);
		
		scan.close();
		
	}

}
