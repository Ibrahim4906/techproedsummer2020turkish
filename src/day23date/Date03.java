package day23date;

import java.time.LocalTime;

public class Date03 {

	public static void main(String[] args) {
		// Time Manipilation (Zamani degistirecegiz)
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.plusHours(1));
		System.out.println(time.plusMinutes(3));
		System.out.println(time.plusSeconds(60));
		
		System.out.println(time.minusHours(5));
		System.out.println(time.minusMinutes(18));
		System.out.println(time.minusSeconds(34));
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);

	}

}
