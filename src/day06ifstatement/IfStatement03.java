package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
	
	// Bir char variable olusturun ve bir buyuk harf deger atayin.
	// Eger atanan deger haftanin gunlerinden herhangibirinin ilk harfi ise 
	// o günleri ekrana yazdirin.Eger degilse "Boyle bir gun yok" yazdirin.
			
	
	char gun ='N';	
	char gun1 = 'P';
	char gun2 = 'S';
	char gun3 = 'C';
	if(gun1==gun || gun2==gun || gun3==gun) {
		
		if(gun1==gun) {
		
	System.out.println("Pazar, Pazartesi, Persembe");
	}
	
	if(gun2==gun) {
		
		System.out.println("Sali");
		}
	if(gun3==gun) {
		
		System.out.println("Carsamba, Cuma, Cumartesi");
		}
		
	}else {
		System.out.println("Boyle bir gun yoktur.");
	}
	
	// "P" olmamak VE "C" olmamak VE "S" olmamak ==> VE islemi icin &&
    // VE isleminden True sonucu alabilmek icin tum condition'lar true olamalidir
    // True && True = True <-> True && False = False <-> False && False = False
    // True=1, False=0 ==> VE islemi carpmaya benzer

	/*
	if((gun1!='P' || gun1!='C' || gun1!='S') && (gun2!='P' || gun2!='C' || gun2!='S')  && (gun3!='P' || gun3!='C' || gun3!='S' )) {
		System.out.println("Boyle bir gun yok");
		
				}
	*/
		  }

	}


