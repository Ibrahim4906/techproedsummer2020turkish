package javapracticeday5;

public class ObjectOrnek {

	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		System.out.println(stb.append("bayram"));
		System.out.println(stb.equals(stb.reverse()));// true return eder.
		System.out.println(stb.equals(stb.reverse().toString()));
		// Ilk ciktiya toString () methodu ilave edilirse sonuc "false" return eder
		// 
		
		StringBuilder stb2 = new StringBuilder();
		stb2.append("Zehra");// add yerine StringBuilder'da append() methodu kullanilir.
							// Bu sekilde istediginiz kadar deger ilave edebilirsiniz.
		System.out.println(stb2);// Zehra return eder
		System.out.println(stb2.equals(stb2.reverse()));// true return eder
		System.out.println(stb.equals(stb2.reverse().toString()));

		String name = "mahmut";
		String name2 = "mahmut";
		System.out.println(name.equals(name2));// true return eder
		
	}

}
