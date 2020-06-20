package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
	// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
	//1. 50 den az - D     
	//2. 50(dahil) ile 60 arası - C       
	//3. 60(dahil) ile 80 arası - B.    
	//4. 80(dahil) ustu- A
	//5. Yanlis not girilirse ekrana "Gecerli not giriniz" yazdiriniz.
	//   Uyari: int, byte, short, char, String ve enum values switch de kullanilir.
	//   Ancak long, float, double ve boolean switch de kullanilmaz.	
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz.");
		int not = scan.nextInt();
		
		if ( not>=0 && not<50) {
			not = 0;
		} else if (not>=50 && not<60) {
			
			not = 50;
		}else if ( not>=60 && not<80) {
			not = 60;
		}else if (not>=80 && not<=100) {
			not = 80;
		}
		
		// switch de case ifadesinden sonra sadece bir deger yazabilirsiniz.
		//Herhangibir islem yapamazsiniz.
		
		switch(not) {
		case 0:
			System.out.println("D");
			break;
		case 50:
			System.out.println("C");
		    break;
		case 60:
			System.out.println("B");
		    break;
		case 80:
			System.out.println("A");
		    break;
		default:
			System.out.println("Gecerli not giriniz");
	}
		
		scan.close();		

	}

}
