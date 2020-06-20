package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// List olusturun.
		// List'ler data type olarak primitive'leri kabul etmezler.
		// Integer olmasini istersek ( primitive oldugu icin List kabul etmez ) Wrapper
		// olarak degistirerek Non-primitive yaparak kullanabiliriz.
		List<Integer> list01 = new ArrayList<>();
		// Bu list icinde eleman olup olmadigini kontrol edin. Bunun icin isEmpty methodu
		// kullanilir. isEmpty() methodu list bos ise true; dolu ise false return eder.
		System.out.println(list01.isEmpty());// true
		
		// Bu List'e bir eleman ekleyin.
		list01.add(1);
		System.out.println(list01.isEmpty());// false
		// List'ten eleman silmek icin remove() methodu kullanilir.
		// remove uzaklastirmak demektir.
		list01.add(124);
		list01.add(125);
		list01.add(124);
		System.out.println(list01);
		list01.remove(1);// ilk 124'u remove edecek , yani silecek. Ancak dikkat bir remove 
		// method index uzerinden silme yapma, ancak listedeki diger remove() method
		// ise eleman sayisi uzerinden yapar.
		System.out.println(list01);
		list01.remove(0); // bu method listede remove(index) olarak gecer.
		System.out.println(list01);// indexi 0 olan elemani siler.
		// Listteki son elemani silin
		list01.remove(list01.size()-1); // List'lerde son elemani bulmak icin 
										// length() yerine size() method kullanilir.
		System.out.println(list01);
	}

}
