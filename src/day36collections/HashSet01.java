package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// HashSet 1) Tekrarli eleman kullanimina (Duplication) izin vermez.
		//         2) Key-Value yapisini kullanir. Key'ler ve Value'lar HashSet icin unique'dir.
		// 			Normalde Key'ler her zaman unique'dir. Value'lar kullanilan Class'a bagli olarak 
		//          unique olabilir veya olmayabilir. Kullanilan Class HashSet ise Value'lar da unique olur 
		//          ama ArrayList ise unique olma zorunlulugu yoktur. 
		// Key kismini Java uretiyor. Key tekrarli olmaz. Tekrar eden Value olabilir. 
		
		HashSet<String> hSet  = new HashSet<>();// Genelde kullanimi hSet seklindedir. 
		// List'lerde add methodu yeni elemani her zaman sona ekler.
		// Ancak HashSet'lerde boyle bir zorunluluk yok. 
		// Javada HashSet() lerde elemanlar rastgele siralar. Key'lere gore siralama yapar. 
		// Ancak Java'nin sectigi Key'lerin ne oldugunu bizler bilemeyiz.
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Ali");
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		// Ayni eleman HashSet ile eklenmek istendiginde CTE ya da RTE alinmaz. Son eklenen eleman ilk eklenen
		// elemanin ustune yazilir.
		hSet.add("Apple");
		System.out.println(hSet);
		
		
	}

}
