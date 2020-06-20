package day06ifstatement;

public class IfStatement01 {

	public static void main(String[] args) {
	
		//kosul dogru ise console'da asagidaki ilk ifade görülür.
		//kosul yanlis ise ilk {} atlar ve devamindaki ifadeyi  görür.
		//kosul dogru ve ikinci bir ifadede var ise iki ifadeyi de konsola yazdirir.
		/*	
		if(3>2) {
			System.out.println("if body calisti");
			
		} else {	
			System.out.println("if body calismadi");
		}*/
			// Bir int variable olusturun ve ona bir deger atayin. Eger atadiginiz deger 
			// pozitif ise ekrana pozitif yazdirin. Eger atadiginiz deger negatif ise
			// ekrana negatif yazdirin.
		
			int a = 2;
			
			if(a>0) {				
			System.out.println("Pozitif");		
			} else if(a<0){
			System.out.println("Negatif");
		}
			
			else if (a==0){
			System.out.println("Notr");
			}
			
	  }

}
