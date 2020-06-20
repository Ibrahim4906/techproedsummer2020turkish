package javarewiew;

import java.util.Random;

public class Day2 {

	public static void main(String[] args) {
		
		/*verilen iki sayinin yerlerini degistiriniz.
		
		int num1 = 11;
		int num2 = 33;
		
		System.out.println("...Degisiklik oncesi....");
		System.out.println("1.sayi: "  + num1);
		System.out.println("2. sayi: "  + num2);
		
		// ilk ince 1. sayi degerini tem( gecici deger ) icerisine atiyoruz. 
		int temp= num1;
				
				// 2. sayi degerini 1. sayiya atiyoruz. 
		num1 = num2;		
		
		// ve son olarak temp. icindeki 2. sayiya esitliyoruz. 
	
		num2 = temp;
		
		// soru 2 : //*** interview question***
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
		
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	       
	       
	       
	       
	       System.out.println("Degisiklik oncesi : " );
	       System.out.println(" x degeri " + x);
	       System.out.println(" y degeri " + y);
	       
	      x = x + y;
	      y = x - y; 
	      x = x - y;
	    		 
	       System.out.println("Degisiklik oncesi : " );
	       System.out.println(" x degeri " + x);
	       System.out.println(" y degeri " + y);
	      
	      */
		  //Soru 3 : 
  
	      // 0 ile 1000 arasinda random(rastgele) bir sayi olusturunuz
	      // bu sayinin rakamlari toplamini veren java algoritma kodunu yaziniz.       
	        int randomSayi= (int)(Math.random()*1000); // 0 ile 1000 arasi sayi
	       //Random rnd = new Random();
	       //int randomSayi = rnd.nextInt(1000);
		System.out.println(randomSayi);
		
		int birler = randomSayi%10; //  birler basamagi
		randomSayi = randomSayi/10;
		int onlar = randomSayi%10;  // onlar basamagi
		int yuzler = randomSayi/10; // yuzler basamagi 
		
		System.out.println("Toplamlari: " + (birler+onlar+yuzler));
		
		














		
	}

}
