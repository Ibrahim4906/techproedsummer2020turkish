package day12scopewhileloop;

import java.util.Scanner;

public class OdevSorusu12_6 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç, bitiş  harﬂerini alın başlangıç harﬁnden  
		// başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf olarak 
		// ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Baslangic harfi giriniz");
		char ch1 = sc.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfi giriniz");
		char ch2 = sc.next().toUpperCase().charAt(0);
		
		while(ch1<=ch2) {
			
			System.out.print(ch1 + " ");
			ch1++;
			
		}
		sc.close();
	}

}
