package day24varargsaccessmodifiers;

public class Varargs02 {

	public static void main(String[] args) {
		// Varargs'in yanlis kullanimlari
		
		// Kural 1: Varargs her zaman son parametre olmalidir.
		//          Cunku ilk parametre yaparsaniz girdiginiz her deger
		// 			Varargs'in icine duser, siz asla ikinci parametre kullanamazsiniz.	
		
		valueChar("Character: ", 'a');
		valueChar("Character: ", 'a', 'b');
		product(5,6,7 );
	}
	public static void valueChar(String s, char...c) {
		for ( char w: c) {
			System.out.println(s);
			System.out.println(w);
	}
	
	}
		// Kural 2 : Parametre olarak 1'den fazla Varargs kullanamazsiniz.
	// Cunku Varargs en sonda olmalidir, en sonda olmak tek olmayi gerektirir.
	public static void product(int x, int... y) {
		int product= 1;
		for(int w: y) {
			product = product * w;
		}
		System.out.println(product);
	}

}
