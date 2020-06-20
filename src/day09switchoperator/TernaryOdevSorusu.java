package day09switchoperator;

import java.util.Scanner;

public class TernaryOdevSorusu {

	public static void main(String[] args) {

		// Kullanicidan bir tamsayi girmesini isteyiniz. 
		// Sayi 3 basamakli ise ekrana "3 Basamakli" yazdirin.
		// Degilse cift sayi olup olmadigini kontrol ediniz.
		// Cift ise "3 basamakli olmayan cift sayi" yazdirin.
		// Degilse "3 basamakli olmayan tek sayi" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int sayi = scan.nextInt();
		
		String result = (sayi>99 && sayi<1000) ? ("3 basamakli") : ( sayi%2==0  ?
		  "3 basamakli olmayan cift sayi"  :  "3 basamakli olmayan tek sayi");
		System.out.println(result);
		
		scan.close();
	}

}
