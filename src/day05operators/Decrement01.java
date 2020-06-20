package day05operators;

public class Decrement01 {

	public static void main(String[] args) {
	
		// int data type bir variable olusturun.
		// Bu variable'in degerini 3 yöntemi de kullanarak her defasinda 1 azaltin. 
		
		int num1 = 12; 
		
		// uzun yol
		num1 = num1 - 1;
		System.out.println(num1);
		
		//kisa yol 
		
		num1-=1;
		System.out.println(num1);
		
		// en kisa yol
		
		num1--;
		System.out.println(num1);
		
		// int data type bir variable olusturun.
		// Bu variable in degerini 3 yöntemi de kullanarak her defasinda 1 azaltin. 
		
		int sayi1 = 13;
		sayi1 = sayi1 - 1;
		sayi1-=1;
		sayi1--;
		System.out.println(sayi1);
		
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		System.out.println(str2);
		
		System.out.println((numA*30+1) + str1 + (numA-numB));
		
	}

}
