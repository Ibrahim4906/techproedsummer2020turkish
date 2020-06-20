package javapracticeday4;

public class AsciiNumbers {

	public static void main(String[] args) {
		// Bir loop olusturup alfabedeki harfleri kucuk harf olarak console'a yazdirin.
		// Her harfin ascii degerini ( or: a => 97 seklinde )ilgili harf ile birlikte 
		// yazdirin.
		
		
		// casting yaptirmaliyiz. cunku rakamlarin basinda ilgili harfi gormek istiyoruz.
		for ( int i='a';  i<='z'; i++){
			
			System.out.println((char)i + " =>" +i);
		}
		

	}

}
