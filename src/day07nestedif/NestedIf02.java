package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanicidan password girmesini isteyiniz.
		// Password 4 basamakli bir sayi ise cift olup olmadigini kontrol ediniz.
		// Cift ise ekrana "Password tamam" , tek ise "Tekrar deneyin " yazdirin.
		// Password 4 basamakli degil ise "Tekrar deneyin" yazdirin.
		// 4 Basamakli demek 999<num<10000 olmalidir.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen password giriniz");
		
		int num = scan.nextInt();
		
		if (num>999 && num<10000) { // 0123 Java icin 123 'tür. Bu dikkate alinmalidir.
			
		
			
			if (num%2==0) {
				
				System.out.println("Password tamam");
			}
			
			else {
				
				System.out.println("Tekrar deneyiniz");
			}
			
			scan.close();
		}

	}

}
