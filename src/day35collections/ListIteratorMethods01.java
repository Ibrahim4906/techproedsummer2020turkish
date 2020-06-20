package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		
		// Elemanlari A,B ve C Stringleri olan bir list olusturunuz
		
		List<String> list = new ArrayList<>();// sag tarafa class yazilir , ancak interface yazamayiz
		
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		// Iterator ya da ListIterator'a list'lerde degisiklik yapmak icin ihtiyac duyulur.
		// List iterator olusturunuz ve list elemanlarini console'a yazdiriniz.
		
		ListIterator<String> listIterator = list.listIterator();// ListIterator list'in elemanlari arasinda gezecek
		// ListIterator normal Iterator'lardan daha kabiliyetli ve daha fazla method bulundurur. Bu yuzden 
		// bu methodu yaziyoruz.
		while(listIterator.hasNext()) {// hasNext() bir sonraki elemanin var olup olmadigini kontrol eder.
			// Iterator kullanilirken her zaman while kullanilir. Baska methodlarda bu isi yapar. Ancak while kullanilir.
			Object element = listIterator.next(); // next() for dongusundeki i++; gorevi gibi artirma islemi yapar.
			System.out.print(element + " "); // while dongusu true gordukce calisir
			// hasNext() methodu C'nin sonuna kadar true return ettigi icin A,B,C return eder.
			// Ancak C'den sonra false return edecegi icin dongu kirilir ve biter.
			}
			System.out.println();
		while(listIterator.hasPrevious()) {
			
			Object element = listIterator.previous();
			System.out.print(element + " ");
			
			// Bir liste tersten yazdirmak icin once hasNext() methodu kullanilmali, daha sonra hasPrevios()
			// kullanilmali. Cunku once pointer sola alinmali ki, hasPrevios() sagdan sola calisabilsin. 
			
		}
	}

}
