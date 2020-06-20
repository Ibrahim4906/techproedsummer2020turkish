package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		// Map bir interface'dir.Map interface'inin 3 tane child class'i vardir.
		// HashMap : HashMap key - value yapisini kullanir. Key ve value programci tarafindan yazilir. 
		// Key ve value'da null degeri kullanilabilir. Key'de 1'den fazla null degeri kullanilirsa
		// Java son kullanilan null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir. 
		// HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak 
		// yazdirilir.
		// HashMap'lar ekrana yazdirirken rastgele siralama yapar. 
		// HashMap'lar arasinda en hizlisidir.
		// HashMap'lar "thread safe" degildir. Ayni anda iki application'i birden calistiriyorsa buna "thread safe"
		// denir. HashMap'lar bu sekilde calismaz. 
		
		
		HashMap <Integer, String> hashMap = new HashMap<>();
		hashMap.put(3333, "Ali");
		hashMap.put(111,"Veli");
		hashMap.put(2222,"Mine");
		hashMap.put(4, "Kemal");
	
		System.out.println(hashMap);// {4=Kemal, 3333=Ali, 2222=Mine, 111=Veli}
		
		System.out.println(hashMap.remove(4));// Kemal'i yani sildigi elemani return eder. 
		System.out.println(hashMap);// {3333=Ali, 2222=Mine, 111=Veli}
		System.out.println(hashMap.remove(111,"Veli"));// true return eder. Bu dogru oldugundan "111,"Veli" silinir.
		System.out.println(hashMap.remove(222,"Ayse"));// false return eder. Silecek birsey bulamaz.
		System.out.println(hashMap);// {3333=Ali, 2222=Mine}
		
		System.out.println(hashMap.get(2222));// Mine return eder
		System.out.println(hashMap.get(100));// null return eder.
		System.out.println(hashMap.keySet());// [3333, 2222] Key'ler [] ile gosterilir.
		System.out.println(hashMap.values());// [Ali, Mine]
		System.out.println(hashMap.size());// 2
		System.out.println(hashMap.containsKey(3333));// true. 
		System.out.println(hashMap.containsKey(4));// false. Cunku elemanlarin icinde 4 yok. 
		System.out.println(hashMap.containsValue("Mine")); // true return eder
		System.out.println(hashMap.containsValue("Emin")); // false return eder
		hashMap.replace(2222,"Emin");
		System.out.println(hashMap);
		
		
		

	}

}
