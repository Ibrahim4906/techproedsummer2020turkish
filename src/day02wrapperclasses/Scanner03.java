package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Kupun hacmini hesaplamak icin kullanicidan bir sayi isteyelim.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir kenar uzunlugu giriniz");
		
		int kenarUzunlugu = scan.nextInt();
		int kupunHacmi = (kenarUzunlugu * kenarUzunlugu * kenarUzunlugu);
		
		System.out.println("Kupun Hacmi: " + kupunHacmi);
		
			scan.close();
	}

}
