package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		/* Bir Array'in elemanlarini kucukten buyuge dogru diziniz ve ekrana iki durumu da yazdiriniz.
		
		int arr[] = {2, 11, 0, 23, 7};
		System.out.println("Siralamadan once " + Arrays.toString(arr));
		Arrays.sort(arr);// Arrays.sort() methoduna parametre olarak Array'in ismi yazilirsa
						 // o Array'in elemanlarini kucukten buyuge siralamis oluruz.
						 // Bu siralama (Ascending order, natural order) olarak adlandirilir. 
		System.out.println("Siralamadan sonra " + Arrays.toString(arr));
		*/
		// Charlardan olusan bir array olusturunuz. "Ascending order" yapiniz.
		// Char'lar siralanirken Java ASCII kodlari kullanir.
		// Buyuk harflerin ASCII kodlari kucuk harflerden azdir.Buyuk harfler once yazilir.
		
		char arr1[] = {'a','z','h','u'};
		System.out.println("Siralamadan once " + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		System.out.println("Siralamadan sonra " + Arrays.toString(arr1) );
		
		/*  String bir Array olusturun ve ascending order yapin.
		String arr2[] = {"Kimdir", "ali", "Can"};
		System.out.println("Siralamadan once " + Arrays.toString(arr2));
		// Alfabetik siraya gore yazdirir. Ilk harfi buyuk olan ise once yazdirilir.
		Arrays.sort(arr2);
		System.out.println("Siralamadan sonra " + Arrays.toString(arr2));
		
		// Boolean bir Array olusturun ve ascending order yapin.
		boolean arr3[] = {false, true};
		System.out.println("Siralamadan once " + Arrays.toString(arr3));
		 Arrays.sort(arr3); // Boolean'lar icin sort methodu kullanilamaz.
		 */
	}

}
