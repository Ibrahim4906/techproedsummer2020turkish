package javapracticeday6;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Uc numara giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1 + " En buyuk sayi");
		if (num2>=num3) {
			System.out.println(num3 + " En kucuk sayi");
		}else {
			System.out.println(num2 + " En kucuk sayi");
			}
		}else if (num2>=num1 && num2>num3) {
			System.out.println(num2 + " En buyuk sayi");
		if(num1>=num3) {
			System.out.println(num3 + " En kucuk sayi");
		} else {
			System.out.println(num1 + " En kucuk sayi");
			}
		}
		else if (num3>=num2 && num3>=num1) {
			System.out.println(num3 + " En buyuk sayi");
		} if (num2>=num1) {
			System.out.println(num1 + " En kucuk sayi");
		}
		else { 
			System.out.println(num2 + " En kucuk sayi");
		}
		scan.close();
	}

}
