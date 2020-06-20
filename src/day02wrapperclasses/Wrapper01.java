package day02wrapperclasses;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//int data tipinin maximum ve minimum degerlerini bulup ekrana yazdirin.
		//int'in wrapper class'i Integer
		// Bir class'in icerisindeki metodlara ulasmak icin isminden sonra nokta koy, listeden secim yap.
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
			
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Tum primitive lerin max. ve min. degerlerini bulunuz.
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		//Kullanici ile iletisime gecmek icin asagidaki kod kullanilir.
		//System.out.println(Chrackter.);
		//Scanner scan = new Scanner(System.in);
		//Scanner bir class, scan ise class ismidir
		
		System.out.println("100 den kucuk iki sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		System.out.println("Girilen sayi: " + sayi);
		
		scan.close();	
	}
	
}
