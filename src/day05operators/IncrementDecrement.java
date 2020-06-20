package day05operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		// int data tipinde bir variable olusturun. Bu variable'nin degerini carpma
		// ve bölme kullanarak artirin ve azaltin.
		
		int num1 = 12;
		// uzun yol ile carpma yaparak increment
		
		num1= num1 * 3;// sonuc 36 olmali.
		
		// kisa yol ile carpma yaparak increment
		
		num1*=3; // 36*3= 108
		
		System.out.println(num1);
		
		//Uzun Yol ile bolme yaparak decrement
        num1 = num1 / 9; //108/9=12
        System.out.println(num1);//12
        
        //Kisa Yol  bolme yaparak decrement
        num1/=2; // 12/2=6
        System.out.println(num1);
        
        int sayi1 = 12;
        sayi1 = sayi1 * 3;
        sayi1*= 3;
        System.out.println(sayi1);//108
        
        int sayi2 = 14;
        sayi2 = sayi2 / 2;
        sayi2/=2;
        System.out.println(sayi2);
	}

}
