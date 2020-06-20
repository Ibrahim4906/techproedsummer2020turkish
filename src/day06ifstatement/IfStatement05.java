package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		//Kullanicidan karenin kenar uzunluklari icin en ve boy degerleri aliniz.
		//Bu sayiyi koyacaginiz double bir variable olusturunuz.
		//Aldiginiz degerler esit ise ekrana Bu bir karedir yazdiriniz.
		//Farkli ise Bu bir dikdortgendir yazdiriniz.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("En degeri icin bir sayi giriniz");
		double sayi1 = scan.nextDouble();
		
		System.out.println("Boy degeri icin bir sayi giriniz");
		double sayi2 = scan.nextDouble();
		
		if(sayi1==sayi2) {
			System.out.println("Bu bir karedir.");
		}if(sayi1!=sayi2) {
			System.out.println("Bu bir dikdortgendir.");
		}
	
		/*
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen en icin bir sayi giriniz...");
	double en = scan.nextDouble();
	
	System.out.println("Lutfen boy icin bir sayi giriniz...");
	double boy = scan.nextDouble();
	
	if(en==boy){
		System.out.println("Bu bir karedir");	
	}
	
	if(en!=boy){
		
		System.out.println("Bu bir dikdortgendir");	
	}
	
	//else==> diger ihtimallerin tamami
	//Bunun disinda demektir.
	 
	
	if(en==boy) {
	
	System.out.println("Bu bir karedir");
	}
	else {System.out.println("Bu bir dikdortgendir");
		
	}
	
	*/
	scan.close();
	}

}
