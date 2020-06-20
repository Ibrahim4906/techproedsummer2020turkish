package day23date;

import java.util.ArrayList;
import java.util.List;

public class ListAllMethod {

	public static void main(String[] args) {
		// addAll() methodu iki List'i birlestirmek icin kullanilir.
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(11);
		list1.add(12);
		
		System.out.println(list1); // [11,12]
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(13);
		list2.add(14);
		list2.add(15);
		System.out.println(list2);
		// Olusturdugumuz iki array'i birlestirmek istersek addAll() methodu kullanilir.
		// index kullanmadan addAll() kullanirsaniz ya bas tarafa ya da son tarafa 
		// ekleme yaparsiniz. Ekleme sirasi ile yapilir. Ancak ilk eklenen korunur. 
		// Digerleri eklenmeye devam edilir. 
		// Fakat index kullanarak addAll() methodu kullanirsaniz List'i istediginiz
		// index'e ekleyebilirsiniz.
		
		list1.addAll(list2);
		System.out.println(list1);
		list2.addAll(list1);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(7);
		System.out.println(list3);// [1,2]
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(2);
		list4.add(3);
		list4.add(4);
		System.out.println(list4);// [2,3,4]
		
		// addAll(a,b) methodunda index ile ekleme yapilabilir. 
		
		list4.addAll(1,list3);
		System.out.println(list3);
		
		
	}

}
