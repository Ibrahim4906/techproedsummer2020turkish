package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Date Manipulation(Date uzerinde degisiklikler yapmak)
		
		LocalDate date = LocalDate.now();// Su anki tarih date adli degiskenin icerisine
										 // atandi.
		System.out.println(date);
		date.plusDays(1);// Bu islem ile su anki tarihe bir gun ekler ve yarinin 
						 // tarihini yazdirir.
		System.out.println(date.plusDays(1));
		System.out.println(date.plusDays(-1));// Java eksi degerler icin farkli bir method
											  // kullaniyor. Bu method - icin cok kullanilmaz.
		System.out.println(date.plusMonths(2));
		System.out.println(date.plusYears(2));
		System.out.println(date.plusWeeks(2));
		
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(1));
		System.out.println(date.minusMonths(1));
		System.out.println(date.minusYears(1));
	}

}
