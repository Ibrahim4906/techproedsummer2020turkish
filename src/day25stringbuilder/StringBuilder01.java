package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBilder Class'i String uretmeye ve uretilen String'leri manipule 
		// etmeye yarar.
		// String Class'i kullanarak String uretirseniz yaptiginiz degi
		String str = "Ali";
		str.substring(1);// 
		System.out.println(str.substring(1)); //"li" return eder.
		System.out.println(str);// //"Ali" return eder
		
		str=str.substring(1);    // Yukarida atama yapmadigimiz icin "Ali" return etti.
		System.out.println(str); // Ancak "str" ye atama islem yapilirsa "li" return eder.
		//1.yol:
		StringBuilder strBld = new StringBuilder("Ali");
		strBld.append("Can");// append() methodu Stringe yeni bir method eklemek icin 
							 // kullanilir. Yani "Concatenation" yapar. 
		System.out.println(strBld);// Bu method atama islemi yapilmasa da degisikligi 
								   // uygular.
		
		// Ozetle StirngBuilder() methodu bize tekrar atama islemi yapmadan degisiklik yapma  
		// imkani sagliyor. Bu tip durumlardaki Class'lara "mutable" denir. 
		// Stringler de ise atama yapmadan degisiklik yapilamaz. Bu tip durumlardaki
		//  Class'lara "immutable" denir. Ama illa ki ilk urettimiz String degissin 
		// istiyorsak atama islemi yaparak degisiklik saglayabiliriz.
		
		// 2.yol:
		StringBuilder strBld2 = new StringBuilder();// bos bir String uretir.
		strBld2.append("Ali Can");// Bos String'e "Ali Can" ekledim.
		// 3. yol: 
		
		StringBuilder strBld3 = new StringBuilder(7); // Uzunlugu 7 character olan
												      // bir String urettim.
		// Olusturdugunuz String'in uzunlugunu belirledikten sonra o uzunluktan az veya
		// cok Stringler ekleyebilirsiniz."StringBuilder" methodu bunu kabul eder.
		
		strBld3.append("Ali");
		System.out.println(strBld3);
		strBld3.append("Kahraman");
		System.out.println(strBld3);
	}

}
