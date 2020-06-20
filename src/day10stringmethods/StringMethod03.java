package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// CharAt() methodu belli indexteki characteri return eder. 
		
		String str1 = "cimbombom";
		System.out.println(str1.charAt(4));// indexi 4 olan harf 'o' harfidir.Bu yuzden ekrana 'o' yazdirir. 
		 
		System.out.println(str1.charAt(0)); // index 0 ilk harf demektir. 'c' return eder.
		System.out.println(str1.charAt(6)); // 6 yerine 10 kullansa idik, olmayan bir index ile islem yapmaya calisirsaniz
		//console da "Exception" alirsiniz. Bu da buyuk bir hata yaptiniz demektir.
		
		// length() methodu Stringin icinde kac character oldugunu verir.
		System.out.println(str1.length());// Ekrana 9 yazdirir. index saymaya 0 dan 
		// baslar. length ise 1 den baslar. bu yuzden length her zaman 1 fazladir.
		
		
		// Kullanicidan ismini girmesini isteyin. 
		// Isminin son harfini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String sonharf = scan.next();
		int length = sonharf.length();
		System.out.println(length);
		System.out.println(sonharf.charAt(length-1));
				
		
		scan.close();
	}

}
