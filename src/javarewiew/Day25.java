package javarewiew;

import java.util.Scanner;

public class Day25 {

	
		public static void main(String[] args) {
			// Kullanıcıdan bir sayı girmesini isteyiniz
					// Sayı tek sayı ise "Sayınız tek sayıdır."
					// Sayı çift sayı ise "Sayınız çift sayıdır." yazdırınız
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir sayi giriniz.");
			int sayi = scan.nextInt();
			
			if (sayi%2==0) {
				System.out.println("Sayiniz cift sayidir.");
			}
			else {
				System.out.println("Sayiniz tek sayidir.");
			}
			scan.close();
		}



	}


