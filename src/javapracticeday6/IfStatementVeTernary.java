package javapracticeday6;

import java.util.Scanner;

public class IfStatementVeTernary {

	public static void main(String[] args) {
		// Kullanicidan 2 Numara isteyiniz ve bu numaralarin
		// en buyuk ve en kucuk olarak konsola yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki numara giriniz");
	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		/*
		if(num1>num2) {
			System.out.println("buyuk olan " + num1);
		}else {
			System.out.println("buyuk olan" + num2);
		}
			
		scan.close();
		*/
		// Soruyu Ternary ile cozmek istersek :
		String result = num1>=num2 ? num1 + " Buyuk olan sayi: \n" 
		+ num2 + " Kucuk olan sayi " : num2 + " Buyuk olan sayi: \n"+ num1 + " Kucuk olan sayi";
		System.out.println(result);
		scan.close();
	}
}
