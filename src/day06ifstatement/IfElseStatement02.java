package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main (String [] args) {
		
		//Kullanicidan bir tamsayi isteyiniz ve o tamsayinin mutlak degerini ekrana yazdiriniz.
		//Mutlak deger bir sayinin kendi isareti ile carpilmasi demektir.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz.");
		int sayi = scan.nextInt();
		
		
		if (sayi>0)
		System.out.println("Mutlak deger " + sayi*(+1));
		
		else { 
			
		System.out.println("Mutlak deger " + sayi*(-1));	
		}
		scan.close();
	}
}
