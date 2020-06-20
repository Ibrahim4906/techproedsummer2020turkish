package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// A harfini bulunca "Ilk harf", 
		// B harfini bulunca "Ikinci harf", 
		// C harfini bulunca "Ucuncu harf",
		// D harfini bulunca "Dorduncu harf",
		// Digerleri icin "Bilmiyorum",
		// yazdiran programi if else if() ve switch () kullanarak yaziniz.
		
		char harf = 'A';
		
		// 1.yol:
		if(harf=='A') {
			System.out.println("Ilk harf");
			
		}
		else if(harf=='B') {
			System.out.println("");
			
		}
		
		
		// 2.yol:
		switch(harf) {
			case 'A':
				System.out.println("Ilk harf");
				break;
			case 'B': 
				System.out.println("Ikinci harf");
			    break;
			case 'C':
				System.out.println("ucuncu harf");
			    break;
			case 'D':
				System.out.println("Dorduncu harf");
			default:
				System.out.println("Bilmiyorum");
		}
		
	}

}
