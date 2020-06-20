package day17constructors;

public class Constructors04 {
	
	int num1 = 12;
	static int num2 = 22;

	public static void main(String[] args) {
		// Static methodlarin icerisinde sadece static elemanlar kullanilabilir.
		// num1 static olmadigindan main methodun icerisinde kullanilamaz.
		// num2 static oldugundan main methodun icerisinde kullanmamiz problem olusturmaz.
		
		//num1++; Commenti kaldirirsak num1++ altini kirmizi cizer.
		num2++;
	
		System.out.println(num2);
	}

}
