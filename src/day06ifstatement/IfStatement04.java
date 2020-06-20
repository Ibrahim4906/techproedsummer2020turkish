package day06ifstatement;

public class IfStatement04 {

	
	public static void main(String[] args) {
		// Bir tane String variable olusturun ve bir gun ismini kucuk harflerle
		// deger olarak atayin. 
		// Eger atadiginiz deger hafta ici gunlerinden birisinin ilk harfi ise 
		// ekrana Hafta Ici yazdirin.  
		// Eger atadiginiz deger hafta sonu gunlerinden biri ise
		// ekrana “hafta sonu” yazdirin.
		
		
		String g = "carsamba";
		
		String g1 = "pazartesi";
		String g2 = "sali";
		String g3 = "carsamba";
		String g4 = "persembe";
		String g5 = "cuma";
		String g6 = "cumartesi";
		String g7 = "pazar";
		
		if(g.equals(g1) || g.equals(g2) || g.equals(g3) || g.equals(g4) || g.equals(g5)) {
			System.out.println("Hafta ici");
		}
			
	if(g.equals(g6) || g.equals(g7)) {
		System.out.println("H.ici degil");
	}
		
		/*
		String day = "pazartesi";
				
        if (day.equals("pazartesi") || day.equals("sali")|| day.equals("carsamba") || day.equals("persembe") || day.equals("cuma")) {
            System.out.println("haftaici");
        }
        if (day.equals("cumartesi") ||  day.equals("pazar")) {
        	System.out.println("haftasonu");
        }
            
	*/
	}

}
