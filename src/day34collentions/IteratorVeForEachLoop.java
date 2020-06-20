package day34collentions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		
		// Iterator bir collection'in elemanlari arasinda dolasir ve o elemanlari degistirir.
		// Foor each Loop ise elemanlari arasinda dolasir ancak degisiklik yapamaz.
		
		List<String> list1 = new ArrayList<>();// Burada object uretimini sag taraf (ArrayList<>) yapar. 
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		Iterator<String> iterator = list1.iterator();// Burada object uretimini sag taraf (iterator()) yapar. Bu her zaman boyledir
		// Interface'lerde constractor olmaz. Yani object uretmez. 
		
		// Yukarida List yerine Collection ya da Iterable yazilabilir. Burada parent'larda kullanilabilir. 
		// Aslinda yukarida List yerine ArrayList ' de kullanilarak yapilabilir. Boyle olursa
		// 4. satirdaki List icin yaptigimiz import silinmeli. Kod yine calisir. 
		// Peki neden List, collection ya da iterator kullaniliyoruz. Sadece data tipinin 
		// parent kullanabildigimiz anlasilsin diye. Ayrica parent kullanmak ileri de bize 
		// baska avantajlar saglayacak. 
			//while(iterator.hasNext()) {// hasNext() methodu bir sonraki eleman var mi, yok mu kontrol eder
			//System.out.print(iterator.next());// iceride eleman var ise true olur ve ilk elemani return eder. 
											  // icinde kac tane eleman var ise o kadar true olur ve elemanlari return eder. 
											  // Elemanlar bitince false vererek donguyu kirar ve islem biter.
		// Bu soruyu bir de for each loop ile cozelim.	
			//}
		System.out.println();// Bir satir asagiya kaydirmak icin kullandik.
		for(String w:list1) {
			System.out.print(w);// XYZ return eder
		}
		// For each loop ile degisim yapmaya calisalim.
		
		for(String w:list1) {
			w = w + "A";// Burada beklenen A ekledigimiz icin [XA,XY,XZ] olmasidir. Ancak for loop sadece elemanlar arasinda gezinti
					    // yapar. Ancak degisiklik yapamaz. Bu yuzden ekranda XYZ goruruz. Degisiklik yapmak istiyorsak iterator kullanmaliyiz
		}
		
		// Iterator ile for each loop farki: 
		while(iterator.hasNext()) { // hasNext() methodu bir sonraki eleman var mi, yok mu kontrol eder
			iterator.next(); // next() methodu 
			iterator.remove();// remove() methodu eleman siler.
			// Bir Collection'da yaptiginiz degisimin kalici olmasini istiyorsaniz " Iterator " kullanmaniz gerekir.
		}
		System.out.println(list1);
	}

}
