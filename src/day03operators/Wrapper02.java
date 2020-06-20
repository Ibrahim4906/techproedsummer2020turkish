package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
	// Kullanicidan ad ve soyadini alalim, ekrana yazdiralim.
	// Kullanicidan adresini alalim ve ekrana yazdiralim.
	// Kullanicidan yasini alalim.
	// Kullaniciya "Türkiye'de mi yasiyorsunuz" sorusunu sorup "Dogru/Yanlis" cevabi alalim.
	
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("Lutfen isim ve soyisminizi giriniz...");
	
	String tamIsim = scan.nextLine();// Neden nextLine() kullandik. Kullanicinin iki adi varsa next() birini alir.
	System.out.println(tamIsim);
	
	System.out.println("Lutfen adresinizi giriniz...");
	String adres = scan.nextLine();
	System.out.println(adres);
	
	System.out.println("Lutfen yasinizi giriniz...");
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("Turkiye'de mi yasiyorsunuz? true/false");
	boolean isTr = scan.nextBoolean();
	System.out.println(isTr);
	
		scan.close();
	}

}
