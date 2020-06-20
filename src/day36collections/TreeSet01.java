package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TreeSet: 1) HashSet ile hemen hemen aynidir. Duplication'a musaade etmez. Key-Value yapisi kullanir.
		// 			2) TreeSet elemanlarini natural order'a (Alfabetik siraya gore) gore dizer. HashSet rastgele
		// 			dizer.
		// Ne zaman TreeSet kullaniriz? Siralama onemli oldugunda kullanilir. 
		// 			3) HashSet ile farki; HashSet daha hizlidir.
		// 			4) Natural Order'a sahip bir Set lazim oldugunda HashSet olusturulur, elemanlar eklenir.
		// 			sonra bu HashSet TreeSet'e donusturulur. Boylelikle TreeSet'in hiz problemi halledilir. 
		
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");	
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet); // [ABC, Ink, Jack, Pen, String, Test]
		
		HashSet<String> hSet1 = new HashSet<>();
		hSet1.add("ABC");
		hSet1.add("String");	
		hSet1.add("Test");
		hSet1.add("Pen");
		hSet1.add("Ink");
		hSet1.add("Jack");
		
		System.out.println(hSet1);// Hem alfabetik sirada degil , hem de verilen siraya gore de dizmedi. 
								  // Bunu TreeSet methodu ile alfabetik siraya koyabiliriz. 
		
		TreeSet<String> tSet1 = new TreeSet<>(hSet1);
		System.out.println(tSet1);// [ABC, Ink, Jack, Pen, String, Test] TreeSet methodu alfabetik siraya koydu. 
		// Bunu daha once olusturdugumuz HashSet methodu ile kolaylastiririz. 

	}

}
