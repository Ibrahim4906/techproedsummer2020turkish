package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
		// Ilk 4 sayma sayisinin carpimini veren for loop olusturunuz
		// 1,2,3,4 ==>1*2*3*4
		
		int product = 1;
		
		for(int i=1; i<5; i++) {
			
			product = product*i;
		}
		System.out.println("Carpim: " + product);
		// ilk 6 cift sayma sayisinin carpimini veren bir for loop olusturunuz
		int product2 = 1;
		for(int i=2; i<13 ; i=i+2) {
			product2 = product2*i;
		}
		System.out.println("Carpim: " + product2);
		
		// Matematikte 1 er 1 er geri sayim yapip carpmaya faktoriyel denir.
		// 9!= 9*8*7*6*5*4*3*2*1 Interview sorusudur.
		
		int product3 = 1;
		for(int i= 1; i<10; i++) {
			product3 = product3*i;
		}
		System.out.println("9!: " + product3);
	}

}
