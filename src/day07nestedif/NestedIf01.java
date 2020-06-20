package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz. Bu sayi pozitif ise 9'dan buyuk mu kontrol
		// edin. Buyuk ise ekrana "Sayi" yazdirin. 9'dan kucuk ve 0'dan buyuk ise
		// ekrana "Rakam" yazdirin.
		// Bu sayi negatif ise ekrana "Sayi" yazdirin.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		if(sayi>=0) {
			if(sayi>=9) {
				System.out.println("Sayi");
			}else if(sayi<=9 && sayi>=0) {
				System.out.println("Rakam");
			}else if(sayi<0) {
				System.out.println("Sayi");
			}
		}
		
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int num = scan.nextInt();
		
		if (num>=0) { 
			
			if (num>=9) {
				System.out.println("Sayi");
					
			}
			else if(num<=9 && num>=0) {
				
				System.out.println("Rakam");
			}
			
			else if(num<0) {
				
				System.out.println("Sayi");
			}
		}
	
	/*
	
	// Scanner class'ini kullandiktan sonra en altta 
				 // main method icinde Scanner kapatiniz.
				  //Scanner class'ini kapatmak icin scan.close(); yazmak yeterlidir.
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir sayi giriniz");
	int sayi = scan.nextInt();
	
	if (sayi>=0) {
		if (sayi>=9) {
			System.out.println("Sayi");
		}
		else if(sayi>=0 && sayi<9) {
			System.out.println("Rakam");
		}
	}
		else if (sayi<0) {
			System.out.println("Sayi");
		}
		
		*/scan.close();
			}
	
	}


