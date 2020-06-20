package arabaprojesiday6;

public class Car {
	/*
	Bir class olusturunuz adi Honda olsun
	icerisinde 3 instance variable olsun 
	protected String make;
	protected String model;
	protected int year;

	Sonra 3 tane String return tipinden method olusturunuz

	arabaMarkasi
	arabaModeli
	arabaYili
	
	iki constructor olusturunuz ( 1 parametreli, 1 parametresiz )
	String model;
	int year;

	Son olarak bir object olusturup method lari main method da print ediniz 
	*/
	
	protected String make;
	protected String model;
	protected int year;
	
	public Car() {
		
	}
	public Car(String model,int year) {
		this.model=model;
		this.year=year;
	}

// Main method olusturmadik, cunku methodlari baska bir yerde calistiracagiz.
// Main method Runner Class icinde calistirilacak.

		public String arabaMarkasi() {
			
			return make;
		}
		
		public  String arabaModeli() {
			
			return model;
		}
		
		public  int arabaYili() {
			
			return year;
	
		}
}
