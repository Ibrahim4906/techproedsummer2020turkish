package javapracticeday7;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
		// Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
		// geri kalan harfleri kucuk yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("isim ve soyisminizi giriniz");
		String isimSoyisim = scan.nextLine();
		
		// int ikinciBasNok = isimSoyisim.indexOf(" ");
		/*
		System.out.println(isimSoyisim.substring(0,1).toUpperCase());
		System.out.println(isimSoyisim.substring(1,ikinciBasNok+1).toLowerCase());
		System.out.println(isimSoyisim.substring(ikinciBasNok+1, ikinciBasNok+2).toUpperCase());
		System.out.println(isimSoyisim.substring(ikinciBasNok+2).toLowerCase());
		
		*/
		
		String [] isimler = isimSoyisim.split(" ");
		for(int i= 0 ; i< isimler.length; i++) {
			isimler[i] = isimler[i].toLowerCase();
			if(isimler.length-1 !=i)
				System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1)+" ");
			else 
				System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1));
					
		}
		scan.close();
	}

}
