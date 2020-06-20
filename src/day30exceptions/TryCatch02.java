package day30exceptions;

public class TryCatch02 {
	String m;// Bu variable main method icine yazilsa idi, exception error verirdi. 
	// Ancak Class variable olarak yazildiginda hata vermiyor. 
	
	public static void main(String[] args) {
		String s = "";
		
		try {
			s+="t";
		}catch(Exception e) {
			s+="c";
		}finally {
			s+= "f";
		}
		s+="a";
		System.out.println(s);// tfa return eder
		
		String n = null;// Exception error verir. 
		System.out.println(n.length());
	}

}
