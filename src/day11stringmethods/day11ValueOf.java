package day11stringmethods;

public class day11ValueOf {

	public static void main(String[] args) {
		
	// Asagida yazilan valueOf methodu return edildiginde console'da ne yazdirir.
		 		
		String str1 = "900"; 
		String str2 = "1000"; 
		int str3 = 900; 
		int str4 = 1000; 
		System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); 
		System.out.println(String.valueOf(str3) + String.valueOf(str4)); 
		
	}

}
