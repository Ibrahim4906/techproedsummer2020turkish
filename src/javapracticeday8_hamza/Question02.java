package javapracticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayı tahmin oyunu" yazınız. 
		 * 
		 * 1. Adım : Java ile rastgele bir sayı üretelim (new Random() kullanabilrsiniz)
		 * 2. Adım : Kullanıcıdan tahminini alalım.
		 * 3. Adım : Kullanıcının girdiği tahmini, bilgisayarın ürettiği 
		 * 			 rastgele sayı ile karşılaştıralım.
		 * 4. Adım : Cevap doğru olana kadar 2. ve 3. adımı tekrarlayalım, 
		 * 			 bunu da while döngüsü ile yapalım.
		 *
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int rastgeleSayi = new Random().nextInt(10);// 0 ile 10 arasinda rastgele sayi olusturur.
	
		int tahmin = -1;// 1-10 arasi sayi olmamasi icin -1 yazildi. 11 de olabilirdi.
		// System.out.println(rastgeleSayi);Bu ifade comment yapilirsa bilgisayarin tahmini gizlenmis olur
		
		while(tahmin != rastgeleSayi) {
			System.out.println("Tahminizi yaziniz");
			tahmin = scan.nextInt();
			if(tahmin == rastgeleSayi) {
				System.out.println("Tebrikler kazandiniz");
			}else {
				System.out.println("Yanlis cevap, tekrar deneyiniz");
			}
		}
		

	}
}


