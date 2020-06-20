package day04operators;

import java.util.Scanner;

public class OdevSorusuCozumu01 {

	public static void main(String[] args) {
		
	//Kullanicidan ingeter aldiktan sonra String alamiyoruz.
	
	Scanner scan = new Scanner(System.in);
	// Java'da nextLine() kullandiktan sonra elde ettiginiz String'i 
	// Integer.parseInt() kullanarak integer'a ceviriniz. 
	
	System.out.println("Yasinizi giriniz...");
	String yas = scan.nextLine();// String harf olarak tanir. Bu kod calisir. Ancak 
								 // bazen islem yapmak gerekebilir. Bunun icin nextInt()
								 // yerine nextLine() kullanilir.
	int yeniYas = Integer.parseInt(yas);
	System.out.println(yeniYas + 1);
	
	System.out.println("Adinizi ve soyadinizi giriniz...");
	String isim = scan.nextLine();
	System.out.println(isim);
	
		scan.close();
		
	}

}
