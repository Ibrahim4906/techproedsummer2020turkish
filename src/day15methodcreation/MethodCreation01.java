package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		// Methodlar bazen main disinda olusturulur ve main icinde kullanilir.
		// Bu sekilde main'in icerisini rahatlatmis oluruz. 
		// Main methodun icinden disariya alma islemine cagirma denir.
		// Bir methodu main methodun icinden cagirmak icin static kelimesi kullanilmali.
		// Parametrenin datatype'i ile Argumetin datatype'i eslesmeli.
		System.out.println(toplama(3,5.2));// Parantez icindeki iki sayi icin "Argument" ifadesi kullanilir.
		System.out.println(carpma(11,5));
		
	}
	public static double toplama(int num1,double num2){// Method parantezlarinin icerisinde 
													   // olusturulan variable'lara "Parametre" denir.
		return num1+num2;
		
	}
	public static int carpma(int num1, int num2) {
		return num1*num2;
		
	}

}
