package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali", "Can", "Ayse", "Ali"]
		
		List<String> list = new ArrayList<>();
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Ali");
		System.out.println(list);
		
		list.remove("Ali");   // remove() methodu burada ilk "Ali" yi siler.
		System.out.println(list);
		
		
		list.remove("Kemal");
		System.out.println(list);// remove () methodu listede olmayan elemanlar icin 
								 // hata (error) vermez. 
		System.out.println(list.remove("Ali"));// true return eder. Cunku zaten "Ali" yi  
											   // remove ettigi icin bunu onaylar.
		System.out.println(list.remove("Kemal"));// false return eder. 
		System.out.println(list.remove(0));// Bu Can elemanini siler ve ekrana silenen 
										   // elemani yazar. 
		System.out.println(list);
		
		// "Ayse" elemanini ( su an listede sadece bu eleman kaldi ) "Aysegul" yapin.
		// Bunun icin set() methodu kullanilir. 
		System.out.println(list.set(0,"Aysegul"));
		System.out.println(list);
		
		list.add("Kenan");
		list.add("Zeynep");
		System.out.println(list);
		list.clear();// Bu method tum elemanlari siler.
		System.out.println(list.isEmpty());// true return eder.
		list.add("Kaan");
		System.out.println(list);
		System.out.println(list.isEmpty());// false return eder.
	}

}
