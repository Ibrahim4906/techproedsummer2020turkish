package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// 4,3 ve 2 yi ekrana yazdiran bir for loop olusturun.
		
		for(int i=4; i>1; i--) {
		System.out.println(i);
		}
		// 3,4,5,6,7 sayilarini ekrana yazdiran bir for loop olusturun.
		
		for(int i=3; i>=7; i++) {
			
		System.out.println(i);
		
		}
		//ilk 100 sayma sayisini ekrana yanyana yazdiriniz.
		// 1.yol:
		for(int i=1; i<101; i++) {
			System.out.print(i);
		}
		// 2.yol:
			
		for(int i=100; i>0; i--) {
			System.out.println(i);
		}
		
		// Ilk 50 cift sayma sayisini ekrana yanyana yazdiran for Loop olusturunuz.
			for (int i=2; i<101; i= i+2  ) {
				System.out.print(i + " ");
			}
		
		// Ilk 50 tek sayma sayisini ekrana yanyana yazdiran for Loop olusturunuz.
		for (int i=1; i<102; i=i+2) {
			System.out.println(i + " ");
			
		}
		
	}
	
}


			
	


