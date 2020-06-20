package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz.
		// Sayi cift ise 10'a bolunup bolunmedigini kontrol ediniz. Bolunuyorsa "Wooow 10"
		// yazdiriniz. Bolunmuyorsa "Yazik 10" yazdiriniz.
		// Sayi tek ise 5'e bolunup bolunmedigini kontrol ediniz. Bolunuyorsa "Wooow 5"
		// yazdiriniz. Bolunmuyorsa "Yazik 5" yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi = scan.nextInt();
		
		       // Condition   Soru isareti           True                         :                   False
		
	String result = (sayi%2==0) ?   (sayi%10==0  ? "Wooow 10" : "Yazik 10" )      :     (sayi%5==0  ?  "Wooow 5" :  "Yazik 5"  );

			System.out.println(result);
			
			scan.close();
	}

}
