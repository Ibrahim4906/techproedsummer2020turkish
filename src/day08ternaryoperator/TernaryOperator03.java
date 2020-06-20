package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi aliniz.
		// Kucuk olanini ekrana yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		
		double sayi1 = scan.nextInt();
		double sayi2 = scan.nextInt();
		
		
		Double result = sayi1>=sayi2    ?   sayi2     : sayi1;
		
		System.out.println(result);
		scan.close();
	}

}
