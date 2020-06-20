package day25stringbuilder;

public class StringBuilder02 {

	public static void main(String[] args) {
		// substring() methodu atama yapmadan String'i degistirmez.
		
		StringBuilder str1 = new StringBuilder("animals");
		//str1 = str1.substring(3); seklinde yazilirsa hata verir. Cunku substring() 
		// methodu String Class'indan gelir ve bir String return eder. Halbuki 
		// str1 String degil StringBuilder 'dir. Java data tipleri uyusmadigindan 
		// dolayi atamayi kabul etmez. 
		// Bu hatadan kurtulmak icin iki yol var. 
		// 1.Yol:
		// String Class'indan yeni bir String uretip atama yapabiliriz.
		String str2 = str1.substring(3);
		System.out.println(str2);
		// 2. Yol:
		// str1.substring(3) ifadesini direkt System.out.println() icine yazabiliriz.
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(1,4));
		
		// indexOf () methodu belli bir character'in index'ini return eder. 
		System.out.println(str1.indexOf("m"));
		// length() methodu String Class'indan gelir ve String'in uzunlugunu return eder.
		System.out.println(str1.length());
		// charAt() methodu belli bir index'teki character'i return eder.
		System.out.println(str1.charAt(5));
		// insert() methodu istenen index'i istenen characteri eklemeye yarar. 
		// insert() methodu append() gibi StringBuilder'i direkt degistirir.
		str1.insert(0, "x");
		System.out.println(str1);
		// delete () methodu istenen index'teki characteri siler.
		str1.delete(0,1);
		System.out.println(str1);
		// deleteCharAt(); istenen index'teki character'i siler.
		str1.deleteCharAt(6);
		System.out.println(str1);
		// reserve() methodu String'i tersten yazdirir.
		str1.reverse();
		System.out.println(str1);
		// toString () methodu StringBuilder'i String'e cevirmek icin kullanilir. 
		System.out.println(str1);// yine "lamina" return eder. Yani degisilik olmaz 
		// gibi gorunuyor. Ancak artik StringBuilder degil String olmustur.
		// StringBuilder Java'nin 5. versiyonunda olusturuldu. Daha eski versiyonlarda 
		// StringBuilder yerine StringBuffer'lar kullaniliyordu. StringBuffer'larda
		// hala kullanilmaya devam ediyor. Eskiden yazilan kodlar bozulmasin diye.
	}

}
