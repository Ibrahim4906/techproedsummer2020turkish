package day10stringmethods;

public class StringMethod05 {

	public static void main(String[] args) {
		
		// valueOf() rakamlarla olusturulan Stringleri sayiya donusturur. Boylece rakamlarla 
		// olusturulan Stringlerle matematiksel islemler yapabilmemizi saglar.
		
		// valueOf() hem Integer wrapper classinin icinde hem de String in icinde de var.
		// Integer wrapper classinin icinde olan valueOf() methodu Stringi Integere cevirir.
		
		String paraErkek = "1900";
		String paraKadin = "2000";
		
		// Bu ailenin toplam gelirini bulunuz.
		System.out.println(paraErkek + paraKadin);//19002000
		System.out.println(Integer.valueOf(paraErkek) + Integer.valueOf(paraKadin));//3900
		
		
		int maasErkek = 1900;
		int maasKadin = 2000;
		System.out.println(maasErkek + maasKadin);// 3900
		System.out.println(String.valueOf(maasErkek) + String.valueOf(maasKadin));//19002000
		

	}

}
