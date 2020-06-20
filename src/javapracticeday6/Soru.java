package javapracticeday6;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String cumle = scan.nextLine();
		
		int ilkBosluk = cumle.indexOf(" ");
		int sonBosluk = cumle.lastIndexOf(" ");
		
		System.out.println(cumle.substring(sonBosluk+1) + cumle.substring(ilkBosluk,sonBosluk+1) + cumle.substring(0,ilkBosluk));

	}

}
