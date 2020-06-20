package day16overloading;

public class Constructor01 {
			// Constructor method ve variable degildir. Bir kod parcasidir.
			// Class'tan Object uretmek icin kullanilan bir Java kodudur.
			// Constructor Class'in body'si icerisinde olmalidir.
			// Ismi Class ismi ile ayni olmalidir.
			// Constructor'larda return type olmaz.
			// Her bir Class ayni zamanda data type'dir. 
			// new ifadesi object uretilmek icin kullanilir. 
			// Class olusturdugumuzda Java class ile beraber otomatik bir constructor olusturur.
			// Biz bu constructor'i goremeyiz, ancak direk kullanmaya baslariz. Bu constructor'a
			// "default constructor" denir. Default constructor'larda parametre olmaz.
			// Default constructor Class olusturuldugu anda Java tarafindan olusturulur.
			// Biz kendimiz bir constructor urettigimiz an Java Default constructor'i siler.
	
	
	int price = 20000;
	int year = 2020;
	String make = "Honda";
	String type = "Civic";	
	
	
	public static void main(String[] args) {
		
		Constructor01 hondaAraba = new Constructor01();// Bu kodu yazarak bir "Object" uretilmis olur.
													   
		System.out.println("Preis: " + hondaAraba.price);
		System.out.println("Make: " + hondaAraba.make);
		System.out.println("Year: " + hondaAraba.year);
		System.out.println("Type:" + hondaAraba.type);
		
	
		}

	}
