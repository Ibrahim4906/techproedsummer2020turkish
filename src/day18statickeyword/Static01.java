package day18statickeyword;

public class Static01 {
	
	static int en = 12;
	static int boy = 10;
	static int yaricap = 4;
	static double pi;
	static int alan;
	static double alanDaire;
	// Bu tip durumlarda bir veriable'i olustururken hesap yapmak gerekirse static block olusturmak
	// iyidir. Yani int. alan = en*boy demek yerine static block olusturup bu islemleri static 
	// block icerisine yazmak daha iyidir.
	// Static block variable'lara deger atamak icinde kullanilabilir.
	// Static block Class'in icinde butun methodlarin (main dahil) ve constructorlarin disinda 
	// olusturulmalidir.
	// Static block Class olusturuldugu zaman olusturulur.
	// Static block tum methodlar'larden ve constructor'lardan once calistirilir.
	// Birden fazla static block varsa ustteki once calisir.( Cunku Java yukaridan asagiya 
	// dogru calisir.ayni static block icerisinde 
	
	static {
		pi = 3.14;
	}
	static {
		alan = en*boy;
		
	}
	static {
		alanDaire = pi*(yaricap*yaricap);
	}
	
	public static void main(String[] args) {
		
		System.out.println(pi);
		System.out.println(alan);
		System.out.println(alanDaire);

	}
	// Static Class olusturulabilir ama alt Class'lar (inner Class) static Class olabilir.
	// Ust Class'lar(outer Class ) static olamazlar.
	
	private static class AltClass {  // Access Modifair(private) olmazsa da olur.
									 // Istenirse icerisinde main method konulabilir. 
		
	}

}
