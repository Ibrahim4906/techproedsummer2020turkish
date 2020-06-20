package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {
	
	public static void main(String[] args) {
		
		//Kullanicidan bir sayi alin.
		//Bu sayinin tersini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		
		String num =scan.nextLine();
		
		String ters = "";
		
		for(int i= num.length()-1; i>=0; i--) {
			System.out.print(num.charAt(i)); // char'i Stringe cevirmek icin sonuna +"" ekleyebiliriz.
			ters = ters + num.charAt(i)+"";
		}
		System.out.println(ters);
		
	    int tersInt = Integer.valueOf(ters);
		tersInt = tersInt+2;
		System.out.println(tersInt);
			scan.close();
	}

}
