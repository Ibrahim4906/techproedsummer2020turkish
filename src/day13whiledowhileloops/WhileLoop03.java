package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3'un carpim tablosunu ekrana yazdiran programi yazdiriniz.
		// 3x1=3, 3x2=6, ..........3x10=30
		// Bu soruyu once for, sonra while ile cozelim.
		
	
	
		for ( int i= 1; i<11; i++ ) {
			System.out.println("3x" + i + "=" + (3*i));
		}
		
		int num= 1;
		while(num<11) {
			System.out.println("3x" + num + "=" + (3*num));
			num++;
		    }
	
	     }
		
	}


