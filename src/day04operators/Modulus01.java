package day04operators;

public class Modulus01 {

	public static void main(String[] args) {
	
	// 12835 sayisinin 23 b�lumunden kalani bulan bir prg. yazin.
	// 1.Yol:	
	System.out.println(12835%23);// Bu kod calisir ancak kod yazmada hos karsilanmaz. Buna Hard coding denir. 
								 // Bunun icin int. kod yazmak gerekir. 
	
	// 2. Yol: Bu sekilde daha g�venli, 
	int sayi1 = 12835;
	int sayi2 = 23;
	System.out.println(sayi1%sayi2);
	
	
	}

}
