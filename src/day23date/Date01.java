package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		
		// LocalDate () methodu ile tarih,saat vb. yazdirmak icin kullanilir. 
		// Bugunun tarihini ekrana yazdiralim.
		System.out.println(LocalDate.now());
		// Bugunun zamanini saat,dakika, saniye ve salise olarak ekrana yazdirin.
		System.out.println(LocalTime.now());
		// Bugunun tarihini ve zamanini ekrana yazdiralim.
		System.out.println(LocalDateTime.now());//2020-05-20T17:03:53.412
												// T tarih ve zamani ayirmak icin kullanilir.
	}

}
