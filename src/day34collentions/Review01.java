package day34collentions;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {
	
	public static void main(String [] args) {
		
		// Kullanicidan adini ve soyadini aliniz
		// Ad ve soyadini console'a yazdirin
		// Sadece adini console'a yazdirin
		// Ad ve soyadinin ilk harflerini console'a yazdirin
		// Ad ve soyadini console'a tersten yazdirin
		// Ad ve soyadinda kullanilan tum karakterleri alfabetik sirada console'a yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adinizi giriniz");
		String ad = scan.nextLine();
		
		System.out.println("Soyadinizi giriniz");
		String soyad = scan.nextLine();
		
		System.out.println(ad + " " + soyad);
		System.out.println(ad + " ");
		System.out.println("Adinizin ilk harfi: " + ad.toUpperCase().charAt(0));
		System.out.println("Soyadinizin ilk harfi: " + soyad.toUpperCase().charAt(0));
		
		StringBuilder strB = new StringBuilder(ad + soyad);
		System.out.println(strB.reverse().toString());// toString kullanilmadan da calisir. 
		// Bu kodda ilk siraya bosluk birakiyor, neden olabilir?
		String tamAd = ad + soyad;
		String harfArr[] = tamAd.split("");
		Arrays.sort(harfArr);
		System.out.println("Harflerin alfabetik sirasi: " + Arrays.toString(harfArr));
		scan.close();
	}

}
