package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
        //Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir
        //Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir 
        //jackpot oyunu icin program yaziniz.
		//000000 - 000001 - 000002 - ..........999998 - 999999
	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alti basamakli bir sayi giriniz");
		
		int sayi = scan.nextInt();
		if(sayi<0 || sayi>999999) {
			System.out.println("Negatif sayi ya da alti basamaktan buyuk sayi giremezsiniz");
		}
		else if(sayi<200000) {
			System.out.println("Kazandiniz");
		}else if(sayi<500000) {
			System.out.println("Amorti");
		}else if(sayi<1000000) {
			System.out.println("Kaybettiniz");
		}
	
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 6 basamakli sayi giriniz. Sifiri basta kullanabilirsiniz");
		int num = scan.nextInt();

		if (num<200000 ) {
					
			System.out.println("Kazandiniz");
		}	
		else if (num<500000) {
			System.out.println("Amorti Kazandiniz");
		}
		
		else {
			
			System.out.println("Kaybettiniz");
		}
		*/
		scan.close();
		
	}

}
