package day10stringmethods;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {

	public static void main(String[] args) {
	//Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
	//Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
	//Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
	//Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir ay ismi giriniz.");
		String ay = scan.next();
		
		switch(ay) {
		
		case "ocak" :
			System.out.println("Bu ay 31 gundur");
			
		case "subat" :
			System.out.println("Bu ay 28 veya 29 gundur");
		case "mart" :
			System.out.println("Bu ay 31 gundur");
		case "nisan" :
			System.out.println("Bu ay 30 gundur");
		case "mayis" :
			System.out.println("Bu ay 31 gundur");
		case "haziran" :
			System.out.println("Bu ay 31 gundur");
		case "temmuz" :
			System.out.println("Bu ay 31 gundur");
		case "agustos" :
			System.out.println("Bu ay 31 gundur");
		case "eylul" :
			System.out.println("Bu ay 31 gundur");
		case "ekim" :
			System.out.println("Bu ay 31 gundur");
		case "kasim" :
			System.out.println("Bu ay 31 gundur");
		case "aralik" :
			System.out.println("Bu ay 31 gundur");
		default :
			System.out.println("Gecersiz ay ismi");
			
		}
			
	}

}
