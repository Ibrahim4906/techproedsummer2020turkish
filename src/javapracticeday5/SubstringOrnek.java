package javapracticeday5;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		// Kullanicidan iki isim isteyiniz. Eger ilk isim uzunlugu cift sayi ise
		// ikinci isim ilk isim ortasina eklensin.
		Scanner sc = new Scanner(System.in);
		System.out.println("Cift rakamli bir sayi giriniz");
		String name1 = sc.next();
		System.out.println("Ikinci bir sayi giriniz");
		String name2 = sc.next();
		
		if (name1.length()%2==0) {
		System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
		

		}

	}
}