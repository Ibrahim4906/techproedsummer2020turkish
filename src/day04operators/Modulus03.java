package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
	
	// Kullanicidan 3 basamakli bir tamsayi alin ve rakamlari toplamini bulun.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Uc basamakli bir tamsayi giriniz...");
	int sayi = scan.nextInt();
	
	int birler = sayi%10;
	int onlar = (sayi/10)%10;
	int yuzler = sayi/100;
	
	System.out.println("Sayinin rakamlari toplami: " + (birler+onlar+yuzler));
	
	/*
	
	int sonRakam = s % 10;
	int v = s / 10; 
	int ortaRakam = v % 10; 
	int ilkRakam = s / 100; // 3 basamakli sayilarin ilk basamagini bulmak icin 
							// sayi 100'e bölünür.
							// 4 basamaklilar 1000'e 
							// 5 basamaklilar 1000'e  
	
	System.out.println(sonRakam + ortaRakam + ilkRakam);
	
	*/
	scan.close();
	}

}
