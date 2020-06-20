package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		// While loop kullanicidan ilk 5 sayma sayisinin toplamini ekrana yazdirin programi yaziniz.
	
		
		int sum= 0;
		int sayi=1;
		
		while ( sayi<6) {
			sum = sum + sayi;
			
			sayi++;
			
		}
		System.out.println(sum); // Bu ifade yukaridaki {} arasina yazilirsa ayrintili olarak 
		 						 // toplam basamaklarini gosterir. 
		 						
	}

}
