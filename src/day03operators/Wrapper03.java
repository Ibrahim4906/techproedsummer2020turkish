package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
		//Kullanicidan ilk ismini alin
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Lutfen ilk adinizi giriniz...");
		String ilkIsim = scan.nextLine();
					
		System.out.println("Lutfen soyismizi giriniz..."); 				
		String soyIsim = scan.nextLine();	
						
		System.out.println("Ilk isim: " + ilkIsim);	
		System.out.println("Soyisim: " + soyIsim);
		
		scan.close();
	}

}
