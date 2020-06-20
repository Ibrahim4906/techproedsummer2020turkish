package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana 
		// yansitan bir prg. yaziniz. 1234 ==> son basamak:4 ilk basamak:1  toplam : 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli bir tamsayi giriniz...");
		int sayi = scan.nextInt();
		
		int son = sayi%10;
		int ilk = sayi/1000; 
		
		System.out.println("Sayinin son ve ilk basamaklari toplamai: " + (son + ilk));
		
		/*
		// Bir tamsayinin birler basamagini bulmak icin 
							  // sayiyi 10 ' a böleriz.
		int sonRakam = s % 10;
		int ilkRakam = s / 1000;
		
		System.out.println(sonRakam + ilkRakam);
		
		*/
		scan.close();
	}

}
