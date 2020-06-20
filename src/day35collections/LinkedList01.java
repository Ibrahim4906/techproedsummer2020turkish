package day35collections;

import java.util.LinkedList;

import javax.print.DocFlavor.STRING;

public class LinkedList01 {

	public static void main(String[] args) {
		// Cok elemanli listelerde linklist () method sayesinde daha kolay ekleme ve silme islemi yapmaktadir.
		// Javayi yormamak ve isi kolaylastirmak icin silme ve eklemelerde bu methodu kullaniyoruz. 
		
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		
		System.out.println(linkList);//[Mark, Amanda, John, Ann, Pamela]
		linkList.remove(2);
		System.out.println(linkList); //[Mark, Amanda, Ann, Pamela]
		
		linkList.removeFirst(); 
		System.out.println(linkList);//[Amanda, Ann, Pamela]
		
		linkList.removeLast();
		System.out.println(linkList);//[Amanda, Ann]
		
		linkList.add(1,"Ali");
		System.out.println(linkList);// [Amanda, Ann, Pamela]
		
		linkList.addFirst("Kemal");
		System.out.println(linkList);// [Kemal, Amanda, Ali, Ann]
		
		linkList.addLast("Zeynep");
		System.out.println(linkList);// [Kemal, Amanda, Ali, Ann, Zeynep]
		
		linkList.set(1, "Ajanda"); // [Kemal, Ajanda, Ali, Ann, Zeynep]
		System.out.println(linkList);
		
		LinkedList<String> linkList2 = new LinkedList<>();
		
		linkList2.add("X");
		linkList2.add("Y");
		
		linkList2.addAll(linkList);
		System.out.println(linkList2);
		
		linkList.addAll(3,linkList2);
		System.out.println(linkList);// [Kemal, Ajanda, Ali, X, Y, Kemal, Ajanda, Ali, Ann, Zeynep, Ann, Zeynep]
		System.out.println(linkList2.contains("Can"));// false
		System.out.println(linkList2.contains("Ali"));// true
		linkList2.clear(); // clear() methodu list'in elemanlarini siler ve bos bir liste kalir. 
		System.out.println(linkList2); // []
	}

}
