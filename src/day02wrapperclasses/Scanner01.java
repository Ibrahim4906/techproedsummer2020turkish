package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		
		//Kullanici iki tam sayi versin
		//Program bu tam sayilarin toplamini ve carpimini ekrana yazdirsin.
		
		
		Scanner scan = new Scanner(System.in);//Scanner class'ini import ettik.
		
		System.out.println("Lutfen iki tam sayi giriniz.");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int toplam = (sayi1 + sayi2);
		int carpim = (sayi1 * sayi2);
		
		System.out.println("Sayilarin toplami: " + toplam);
		System.out.println("Sayilarin carpimi: " + carpim);
		
		scan.close();

	}

}
