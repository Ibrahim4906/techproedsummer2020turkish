package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki List'in birbirine esit olup olmadigini kontrol eder. 
		// List'ler esit ise "true", degil ise " false " return eder. 
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.equals(list2);// istersek once list2'i yazdirabilirdik. Ayni sonucu verir.
		
		System.out.println(list1.equals(list2));// true return eder.
		// equals() methodu adreslere bakmaz. Sadece elemanlarin ayni olup olmadigina
		// bakar. list1 ve list2'nin adresleri farkli olmasina ragmen "true" return eder.
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));// false return eder.
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));// false return eder.
		// Cunku "A" ile "B" elemanlarinin isimleri ayni, ancak index'leri farklidir.
		
		
		
		
		

	}

}
