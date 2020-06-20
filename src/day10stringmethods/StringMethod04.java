package day10stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains() methodu bir String icerisinde bir characterin olup olmadigini 
		// kontrol eder. Eger character varsa true, yoksa false return eder.
		
		String str1 = "karakartal";
		System.out.println(str1.contains("m"));// false, cunku karakartal icerisinde 'm' yok. 
											   // contains() methodunun icine herzaman String koyun.
		System.out.println(str1.contains("kar")); // true return eder.cunku karakartal icerisinde 'kar' var.
		
		// trim() methodu bir Stringin bas ve sonundaki bosluklari siler.
		// Bu method aradaki bosluklari silmez. 
		
		String str2 = " Ali Can     ";
				
		System.out.println("trim kullanmadan once  : " + str2);
		System.out.println("trim kullandikta sonra : " + str2.trim());
		
		// isEmpty() methodu bir Stringin icerisinde character olup olmadigina bakar.
		// Character yoksa true, varsa false return eder. 
		
		String str3 = "Ali";
		System.out.println(str3.isEmpty());// false return eder. Icerisinde "Ali" var.
		
		String str4 = " ";
		System.out.println(str4.isEmpty());// false return eder. icerisinde space var.
		
		String str5 = "";
		System.out.println(str5.isEmpty());// true return eder. icerisinde hicbirsey yok.
		
	}

}
