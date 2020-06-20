package day05operators;

public class Concatenation01 {

	public static void main(String[] args) {
		
		System.out.println("Ali" + "Can");
		System.out.println("Ali " + "Can");
		System.out.println("Ali" + " Can");
		System.out.println("Ali" + " " + "Can");
		
		
		System.out.println("3" + 4);// En az birisi String ise toplama degil 
									// concatenation isleminin sonucu String tipindedir.
		System.out.println("3" + 4 + 5);//   345 Sonuc Stringtir. Sayi degildir.
		System.out.println("3" + (4 + 5));//  39 Sonuc Stringtir. Sayi degildir.
		System.out.println( 3 + 4 + "5" + 6);
		System.out.println(2*3 + "4" + 6/2);
		System.out.println("2*3" + "4" + 6/2);
		
		
{
			int numA = 2;
			int numB = 3;
			String str1 = "Cok";
			String str2 = "Calis";
			
			String strA = "Cok" + " Calis";
			System.out.println(strA);
			
			String strB = ((numA + numB) + " Cok");
			System.out.println(strB);
			
			System.out.println(str2 + numA + numB);
			System.out.println(str1 + (numB-numA));
			
		}
	}

}
