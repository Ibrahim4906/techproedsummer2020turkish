package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz 
		// Bu saayilar birbirine esit ise 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen birinci sayiyi giriniz");
		double sayi1 = scan.nextInt();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		double sayi2 = scan.nextInt();
		
		
		Double sonuc = sayi1==sayi2   ?  sayi1+sayi2   :     sayi1*sayi2;
		System.out.println(sonuc);
		scan.close();
	}

}
