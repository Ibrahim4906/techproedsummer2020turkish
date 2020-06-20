package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		// Queue : Queue'ya eklenen elemanlar en sona eklenir. List'lerde oldugu gibi. 
		//         Queue'da silinen elemanlar en bastan silinir. 
		// 		   [1,2,3] ==> Bu Queue ' dan eleman silmeye basladiginizda once 1 silinir. 
		// 		   FIFO ==> First in First out / ilk giren ilk cikar. 
		
		Queue<String> q = new PriorityQueue<>();
		q.add("B");
		q.add("A");
		q.add("C");
		System.out.println(q);// [A, B, C] Queue alinma sirasina gore dizer di, yani [A, B, C] ancak 
							  // PriorityQueue kullandigimiz icin natural order'a gore dizer.
		
		// remove () methodu kullanalim
		System.out.println("Silinen eleman: " + q.remove());// A return eder. Bunun sebebi remove() methodu sildigini ekrana yazdirir.
		System.out.println("Kalan queue: " + q);// [B, C]
		System.out.println(q.remove("C"));// true, Cunku biz Java'ya hangi elemani silmesi gerektigini soyledik
		// Java true return ederek islem tamam mesaji verir. 
		System.out.println(q);// [B]
		
		Queue<String> qll = new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		System.out.println(qll);// [B, A, C] girdigimiz sirada sonuc almak istersek LinkedList methodu kullanilir
		
		System.out.println("Ilk eleman: " + qll.element());// ilk elemani dondorur.
		System.out.println(qll.poll()); // Ilk elemani siler  ve return eder. 
		System.out.println(qll);// [A, C]
		System.out.println(qll.poll());// A
		System.out.println(qll);// [C]
		System.out.println(qll.poll()); // C 
		System.out.println(qll);// []
		System.out.println("Bos Queue icin poll: " + qll.poll());
		System.out.println(qll);// []
		//Not: remove() methodu bos queue'lar icin kullanilirsa Exception verir.
		//     poll() methodu bos queue'lar icin kullanilirsa null verir.
		//     Ama dolu queue'lar icin ayni isi yaparlar, farklari yoktur.	
	}

}
