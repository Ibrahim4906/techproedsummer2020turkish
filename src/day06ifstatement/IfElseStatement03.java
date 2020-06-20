package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		// Kullanicidan alacagi urun miktari ve fiyatini alalim. Eger kullanici 1000 den 
		// fazla urun alirsa %20 indirim yapan ve kullanicinin odeyecegi toplam fiyati
		// ekrana yazdirin.
		// Para konularinda double kullanin.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen urun miktarini giriniz.");
		double urun = scan.nextDouble();
		System.out.println("Birim fiyati giriniz");
		double fiyat = scan.nextDouble();

		
		if ( urun>1000) {
			
		System.out.println("Urunun indirimli fiyati: " + urun*(fiyat*80/100) );
		}
		
		else {  
		System.out.println("Indirim Kazanamadiniz: " + urun*fiyat);
		}
		
		scan.close();
	}

}
