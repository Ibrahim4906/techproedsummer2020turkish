package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu List'i Array'e cevirmek icin kullanilir. 
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		// 1. Yontem: toArray() methodu'nun icinde parametre olarak new String[0]
		// kullanin.
		String arr[]= list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
		// 2. Yontem: Olusturdugunuz array'in data type'ini Object olarak secin.
		// 
		Object[] arr1 = list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		// Javada Parent'i (babasi) olmayan tek Class "Object" tir.
		// Javada diger Class'lar Object'ten daha kapsamli olabilmektedir.
		// Javadaki her Class aslinda Object'in tum ozelliklerini tasir.
		// asList() methodu array'leri List'e cevirmek icin kullanilir.
		
		String arr2[] = {"Aliye", "Canan"};
		List<String> list1 = Arrays.asList(arr2);
		System.out.println(list1);
		// Array'den List'e cevirme yaptiginizda, elde ettiginiz List uzunluk olarak 
		// esnek degildir. Yani array'den olusturdugunuz List'e "add" ve "remove" 
		// yapamazsiniz. list1.add("Emine"); Bu islem sirasinda "Run Time Error return" 
		// eder. Bu hata "UnsupportedOperationException" olarak adlandirilir.
		System.out.println(list1);
		list1.set(0,"Kemal");
		System.out.println(list1);
		

	}

}
