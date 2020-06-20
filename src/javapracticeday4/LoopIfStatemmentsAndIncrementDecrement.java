package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatemmentsAndIncrementDecrement {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Sadece alfabetik karakterlerden olusan bir user name giriniz");
		String userName= scan.next();
		str1.length();
		
		System.out.println("Bir sifre giriniz");
		String str2= scan.next();
		*/
		String userName = "Selim".toLowerCase();
		int count = 0;
		if (userName.length()>=8) {
			for ( int i=0; i<userName.length(); i++) {
				char temp = userName.charAt(i);
				if (!( temp < 'a' && temp > 'z')) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println("User Name Basarili bir sekilde olusturulmustur");
			}
		else {
			System.out.println("User Name olusturulamamistir.");
			System.out.println("Lutfen tekrar deneyiniz.");
		}
		
	} else {
			System.out.println("User Name lengthi yetersizdir");
			System.out.println("Tekrar deneyiniz");
		}
	


	}
}


