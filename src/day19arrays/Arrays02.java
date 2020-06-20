package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// 4 elemanli bir char bir array olusturun. Bu Array'a elemanlar yerlestirin. Tum elemanlari 
		// for dongusu kullanarak ekrana yazdirin.
		
		char arr1[] = new char[4];
		
		arr1[0] = 'A';
		
		arr1[1] = 'D';
		
		arr1[2] = 'E';
		
		arr1[3] = 'M';

		for(int i=0; i<4; i++) {   // for icerisinde int kullaniliriz. 
								   // Bu yuzden char tercih etmedik.
			System.out.println(arr1[i]);
		}
		System.out.println(arr1[3]);
		// Array'in length'ini bulmak icin "ArrayIsmi.length" yazmak yeterlidir.
		// Stringlerde de benzer bir method vardi. Ancak bir farki var. Burada parantez 
		// kullanilmiyor.Stringlerde ise length() idi.  
		System.out.println(arr1.length);
		// Array'deki son elemanin indexi "ArrayIsmi.length-1" seklinde yazdirilir. 
		System.out.println(arr1.length-1);
		// son elemani yazdirmak icin 
		System.out.println(arr1[arr1.length-1]);
	}
}


