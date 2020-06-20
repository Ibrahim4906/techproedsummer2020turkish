package day16overloading;

public class Overloading01 {

	public static void main(String[] args) {
		
		// Overloading asiri yukleme demektir ve mulakatlarda mutlaka sorulur.
		// Asagida iki ayni method yazilinca java hata veriyor.
		// Javaya kabul ettirebilmek icin ayni isimli method uzerinde bazi degisiklikler
		// yapmak gerekir. 
		// 1. yontem: ikinci methodda parametre isimleri ya da sayisi degisirse
		// (double num1, int num2) degisikligi ile sorun asilir.
		// 2. yontem: Farkli data parametrelerin yerini degistirmek ile sorun asilir.
		// (int num2, double num1 )
		toplam(2,3); // 
		toplam(7); //
		toplam(2.3,3);
		toplam(4,5.7);
		
	}
	public static void toplam(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void toplam(int num1) {
		System.out.println(num1+num1);
	}
	public static void toplam(double num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void toplam(int num1,double num2) {
		System.out.println(num1+num2);
		
	}
}
