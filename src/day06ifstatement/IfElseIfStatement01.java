package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		// Negatif sayi girerse "Yas negatif olamaz" yazdirin.	
		// Kullanicidan yasini aliniz. 
		// Yas 13 den az ise ekrana "Calisamaz" yazdirin.
		// Yas 65 e kadar ise ekrana "Calisabilir" yazdirin.
		// Yas 65 den buyuk ise "Emekli" yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int yas = scan.nextInt();
		
		if(yas<0) {
			System.out.println("Yas negatif olamaz");
		}if(yas<=13) {
			System.out.println("Calisamaz");
		}	
		else if(yas<=65) {
			System.out.println("Calisabilir");
		}
		
		/*
		Scanner scan = new Scanner(System.in); 
			System.out.println("Lutfen yasinizi giriniz.");
		int yas = scan.nextInt();
		
		if (yas<0) {
			System.out.println("Yas negatif olamaz");
		}
		
		else if (yas<13) {
			System.out.println("Calisamaz");	
		}
		
		else if (yas<=65) {
		System.out.println("Calisabilir");				
		}	
		
		else {
			System.out.println("Emekli");
		}
		*/
		scan.close();
	}	

}
