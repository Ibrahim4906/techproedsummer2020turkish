package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// List Array'larda "esnek" anlamina gelir. Array'larda length sabittir degismez.
		// ArrayList'lerde (List) length esnektir. Siz eleman ekledikce List length'ini 
		// artirir. Siz eleman sildikce List length'ini azaltir.
		// Mulakatlarda Array ve ArrayList farki sorulur. 
		/*
		int arr[] = {1,2,3};
		 // new objelerde kullanilir. List de bir object oldugu icin burada kullanilir.			 				   
		 // List ve ArrayListte olusan kirmizi cizgiler java.until ile import etmek gerekir.
		 // awt.until kullanilmamali.
		 // List<String> list01 = new List<>(); seklinde yazilamaz.
		 // ArrayList<String> list01 = new List<>(); seklinde yazilamaz.
		 // kisacasi List<> sag tarafta olamaz.
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);
		// List'e eleman eklemek icin add() methodu kullanilir.
		list01.add("Ali");
		System.out.println(list01);
		list01.add("Can");
		System.out.println(list01);
		// Veli'yi Ali ile Can'in arasina ekleyelim.
		list01.add(1, "Veli");
		System.out.println(list01);
		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add(5, "Ayse");// Bunun yerine direk list01.add("Ayse") yazilabilirdi.  
		System.out.println(list01);
		
		// list01'in eleman sayisini ekrana yazdirin.
		// List'in uzunlugu icin "size" methodu kullanilir. Arrays'larda "length" idi. 
		System.out.println(list01.size());

		
		*/
		
		
		List<String> list01 = new ArrayList<>();
		System.out.println(list01);
		
		list01.add("Ali Kan");
		System.out.println(list01);
		list01.add(1, "Mehmet");
		System.out.println(list01);
		list01.size();
		System.out.println(list01.size()-1);
		
	
		
	}

}
