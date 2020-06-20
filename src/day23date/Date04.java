package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	public static void main(String[] args) {
		// Date formatini degistirmek 
		
		LocalDate date = LocalDate.now();
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		//MM kullandigimizda rakam olarak return eder.
		// tarihte ay olarak "M" de kullanilabilir. Ancak ikili olan tercih edilir. 
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(date));
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/M/dd");
		System.out.println(dtf3.format(date));
		
		// Time Formatini degistirmek
		LocalTime time = LocalTime.now();
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss");
		// HH kullanilirsa 24 saatlik dilimi kullanir.
		// Yukarida dakika "mm" olarak kullanildi. Cunku "MM" ay icin kullanilmisti.
		System.out.println(dtf4.format(time));
		
		// Baska ulkenin local zamanini almak ????
		System.out.println(time.now(ZoneId.of("America/Sao_Paulo")));
		
		//User Interface demek kullanicinin muhatap oldugu yuz demektir.
		
		
	}

}
