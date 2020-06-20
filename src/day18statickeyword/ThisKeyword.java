package day18statickeyword;

public class ThisKeyword {
	int x = 12;
	static int y = 13;
	ThisKeyword(int x){
		// this kullandigim zaman icinde bulundugum Class'taki instance veya static variable'lara
		// ulasmak 
		// this () icinde bulundugunuz Class'taki parametresiz constructor'i cagirmak icin 
		// kullanilir.
		// this() kullanilacaksa ilk satira yazilmalidir. Diger bir degisle "Scoop'taki ilk satir" 
		// da olmali.Yoksa Compile Time Error verir. Ayrica this() constructor'lar arasinda 
		// gecis yapmamizi saglar.
		// this("Ali") bu Class'taki parametreli constructorlari cagirmak icin kullanilir.
		this();	// Eger this() yerine this("Ali"); yazilirsa String parametreli cons. cagirir.
		this.x = x;
		
		System.out.println("Parametreli constructor");
	}
	ThisKeyword(){
		System.out.println("Parametresiz constructor");
	}
	ThisKeyword(String str){
		System.out.println("String parametreli constructor");
		
	}
	public static void main(String[] args) {
		ThisKeyword obj1 = new ThisKeyword(15);
		System.out.println(obj1.x);
		
	}

}
