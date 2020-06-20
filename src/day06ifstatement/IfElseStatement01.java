package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		
		// Kullacidan password girmesini isteyin. Password Java2020. Dogru ise ekrana 
		// Password Dogru yazdiriniz.
		// Dogru degilse ekrana "Password yanlis, tekrar giriniz." yazdiriniz.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Password'unuzu giriniz");
		String password = scan.nextLine();
		String dogrulama = "Java 2020";
		
		if(password.equals(dogrulama)) {
			System.out.println("Password dogru");
		}else {
			System.out.println("Password yanlis, tekrar giriniz");
		}
		scan.close();
		/*
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Password'unuzu giriniz...");
		String password = scan.next();
		
		if(password.equals("Java2020")) {  
										  
			// Stringlerin esitligini kontrol ederken asla == kullanmayiniz. Bunun yerine equals kullanilir.
			// " == " Stringin degerini ve adresini kontrol eder. 
			// equals ise sadece degerlerini kontrol eder.
			System.out.println("Password dogru");
		}
		
		else {System.out.println("Password yanlis, tekrar giriniz. ");
		
		}	
		*/
	
	}

}
