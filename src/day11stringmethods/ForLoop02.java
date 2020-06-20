package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		// 100'e kadar sayma yazilarindan 3'e bolunebilenleri yanyana yazdiran for loop yazdirin.
		
		 
		for (int i= 3 ; i<100; i=i+3) {
		System.out.print(" " + i);
	}
		System.out.println();
		// 1,2,3 sayilarinin toplamini ekrana yazdiran bir for loop olusturun.
		int sum = 0;
		for(int i=1; i<4; i++) {
			sum = sum + i;
			
		}System.out.print("Toplam:" + sum);
		System.out.println();
		// 10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop yaziniz
		
		int sum2 = 0;
		for ( int i= 11; i<14; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Toplam: " + sum2);
		
		// 20'den buyuk 5 sayma sayinin toplamlarini for loop ile ekrana yazdiriniz.
		
		int sum3 = 0; 
		for ( int i = 21; i<26; i++) {
		sum3= sum3 +i;
		}
		System.out.println("Toplam: " + sum3);// 115
		
		int sum4 = 0;
		for( int i=0  ;  i<51; i++) {
			sum4 = sum4 +i;
			
		}
		System.out.println("Toplam:" + sum4);
		
		// 5 ile bolunebilen 100 den kucuk sayma sayilarinin toplami 
		
		int sum5 = 0;
		for ( int i=5; i<100; i= i +5) {
			sum5= sum5 + i;
		}
		System.out.println("Toplam: " + sum5);
		
	}


}