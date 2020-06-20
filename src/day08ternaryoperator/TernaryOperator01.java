package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz. 
		// Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz.
		// Sayi negatif ise ekrana "Negatif" yaziniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		double sayi = scan.nextDouble();
		/*
		if (sayi>=0) {
			System.out.println("Pozitif veya 0");
		}
			else {
				System.out.println("Negatif");
			}
		
		// Ternary Operator yaparken Condontion aynen yazilir ve ardindan ? yazilir.
		 Condontion dogru ise "Pozitif veya 0 yazar.
		*/
		String sonuc = (sayi>=0)   ?   "Pozitif veya 0"    :      "Negatif";
			
			System.out.println(sonuc);
			scan.close();
		}
		
		}
	

