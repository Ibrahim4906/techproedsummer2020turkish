package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {

	public static void main(String[] args) {
		// Elemanlari A,B, ve C olan bir list olusturunuz.
		// List Iterator kullanarak bu elemanlari AW, BW ve CW donusturunuz.
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		ListIterator<String> listIterator = list.listIterator(); 
		
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element + "W");
		}
		System.out.println(list);// [AW,BW,CW]
		
		listIterator.add("Kemal");
		listIterator.add("Can");
		System.out.println(list);// [AW,BW,CW,Kemal,Can]
		

	}

}
