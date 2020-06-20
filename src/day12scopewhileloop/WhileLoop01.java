package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While => iken demektir. 
		// while I go to school => Ben okula giderken.
		// while I go to Uskudar, it rained.
		
		int num= 0;
		
		while(num<4) { //Parantez icindeki condotion true oldugu surece while loop calisir.
			System.out.print("Ali");
			num++;  // Bu satiri unutursaniz while loop sonsuz donguye girer. Unutmayin. 
		}
		// While loop kullanarak birden ona kadar tamsayilari ekrana yazdiriniz.
		int num2=1;
		while( num2<=10 ) { //Parantez icindeki condotion true oldugu surece while loop calisir.
			System.out.print(num2);
			num2++; 
		}
		
		// While loop kullanarak 1 den 20 ye kadar cift tamsayilari ekrana yazdiriniz.
		
		int num3= 1;
		
		while ( num3<21) {
			if( num3%2==0) {
			System.out.println(num3);
			
			}
			num3++;
		}
		System.out.println();
		
		int num4 = 5;// 5 ile 121 arasinda 3'e bolunebilen tam sayilari ekrana yazdiriniz
		while ( num4<121) {
			if ( num4%3==0) {
				
				System.out.print(num4);
				
			}
			num4++;
		}
		System.out.println();
		
	
	}

}
