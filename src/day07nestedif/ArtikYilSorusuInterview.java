package day07nestedif;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		// Kullanicidan yil girmesini isteyin. Girilen yil artik yil ise 
		// ekrana "Artik yil " yazdirin. degilse "Artik yil degil " yazdirin.
		// Artik yil 1)Yil 100'e bolunurse 400'e de bolunmeli
		//			 2)Yil 100'e bolunmezse 4'e bolunmeli.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir yil giriniz");
		int yil = scan.nextInt();
		if(yil%100==0 && yil%400==0 ) {
			System.out.println("Artik yil");
		}if( yil%100!=0 && yil%4==0) {
			System.out.println("Artik yil");
		}else {
			System.out.println("Artik yil degil");
		}
	/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yil giriniz");
		int yil = scan.nextInt();
		
		if(yil%100==0 && yil%400 ==0)	{
			System.out.println("Artik yildir");
		}
		if(yil%100!=0 && yil%4 ==0)	{
			System.out.println("Artik yildir");
	}
		else {
			System.out.println("Artik yil degildir");
		}
	*/
		scan.close();
	}
}
