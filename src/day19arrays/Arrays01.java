package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		// Integer array olusturalim.
		int arr1[] = new int[5];
		System.out.println(arr1);// arr1 kullanarak yazdirmaya calisirsak console'da 
								 // reference'i (adresi) yazar.
		char arr2[]= new char[3];
		System.out.println(arr2[2]);// [] ile icerisine index yazilirsa sadece o indexteki 
							     // karakteri alir.Burada indexi 2 olani yazdirir.
		
		arr1[0] = 12;
		System.out.println(arr1[0]);
		
		arr1[1] = 3;
		System.out.println(arr1[1]);
		
		arr1[2] = 1;
		System.out.println(arr1[2]);
		
		arr1[3] = 8;
		System.out.println(arr1[3]);
		
		arr1[4] = 22;
		System.out.println(arr1[4]);
		// Array'daki elemanlari ekrana yazdirmak icin for dongusu kullaniniz.
		
		for (int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		
	// Array'da olmayan indexe deger atamasi yapilirsa "run time error" hata alinir.
	// Array'da olmayan indexi kullanmaya calisirsak console'da "ArrrayIndexOutBoundsException" 
	//  yazar.
	//	arr1[5] = 9;  
	//	System.out.println(arr1[5]); // Burada comment kaldirilirsa Run Time Error verir.
	}

}
