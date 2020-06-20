package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		// ["A", "C", "B", "C"]
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("C"); 
		list.add("B"); 
		list.add("C");
		
		// List'deki B elemani var mi kontrol edelim
		
		list.contains("B");// Eger B eleman olarak varsa true , yoksa false return eder.
		System.out.println(list.contains("B"));//true return eder. 
		
		// List'deki Z elemani var mi kontrol edelim
		list.contains("Z");
		System.out.println(list.contains("Z"));// false return eder.
		
		// List'deki elemanlari alfabetik siraya koyunuz.
		// Collection ==> Biraraya getirilmis parcalardir.
		// Bir List'teki elemanlari alfabetik siraya(Natural Order) dizmek icin
		// Collections.sort() methodu kullanilir.Argument olarak List'in adini kullaniriz.
		Collections.sort(list);
		System.out.println(list);
		
	}

}
