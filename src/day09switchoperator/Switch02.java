package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// Kullanici haftanin gun numarasi girsin
		// Programiniz gunun ismini yazsin
		// Yanlis gun sayisi girerse "Gecerli gun sayisi giriniz.
		// switch() kullanarak yapiniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun sayisi giriniz");
		int sayi = scan.nextInt();
		
		switch(sayi) {
		
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2: 
			System.out.println("Sali");
		    break;
		case 3:
			System.out.println("Carsamba");
		    break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5: 
			System.out.println("Cuma");
		    break;
		case 6:
			System.out.println("Cumartesi");
		    break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Gecerli gun sayisi giriniz");
		}
		
		scan.close();
	}

}
