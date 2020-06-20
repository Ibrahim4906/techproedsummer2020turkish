package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque: Double Ended Queue ( Iki uclu Queue )
		// Ekleme sona , silme bastan yapilir. 
		// Deque kullanirsaniz eklemeyi hem basa, hem de sona yapabilirsiniz. Ayni sekilde silmeyi de hem bastan 
		// hem de sondan yapabilirsiniz. 
		// Deque'da FIFO var bunun yaninda LIFO (Last In First Out) da var. 
		// Deque resizable'dir. Yani; kapasitesi degistirilebilir. 
		
		// Queu'lara eleman olarak null eklenebilir. Ancak Deque'lara null eleman olarak eklenemez.
		// 
		
		Deque<String> dq = new LinkedList<String>();
		
		dq.add("Son 1");
		dq.addFirst("Bas 1");
		dq.addLast("Son2");
		dq.push("Bas2");
		dq.offer("Son3");
		dq.offerFirst("Bas3");
		dq.offerLast("Son4");
		System.out.println(dq);// [Bas3, Bas2, Bas 1, Son 1, Son2, Son3, Son4]
		
		// pop () methodu bastaki elemani siler ve bastaki elemani return eder. Adeta sildigi elemani haber verir.
		System.out.println(dq.pop());// Bas3
		System.out.println(dq.removeLast());// Son4
		System.out.println(dq);// [Bas2, Bas 1, Son 1, Son2, Son3]
		System.out.println(dq.removeFirst());// Bas2
		System.out.println(dq);// [Bas 1, Son 1, Son2, Son3]
		

	}

}
