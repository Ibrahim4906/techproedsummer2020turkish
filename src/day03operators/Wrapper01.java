package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
	// Kullanicidan ad ve soyadini alip ekrana yazdiran bir program yaziniz.
	// (String kullaniniz.)
		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Lutfen adinizi ve soyadinizi giriniz...");
	String isim;// String isim= scan.nextLine(); seklinde de yazilabilir. O zaman asagidaki ifadeyi tekrarlamayiz.
	isim = scan.nextLine();
	
			/*
			 . dan sonra bircok next cikar. Biz next() ya da
			 nextLine() kullaniliriz. next () tek kelimelik String ler icin kullanilir. 
			 NextLine () tüm cümleyi ya da girilen tum String'i almak icin kullanilir.
			 */
	
	System.out.println("Girilen isim: " + isim);
	
	scan.close();
	}

}
