package day01variables;

public class Variable01 {
	
	public static void main(String [] args) {
		
		int maas = 3000; 
		
		char harf = 'S'; // char'lara deger atamasi yaparken önünde ve arkasinda '' isareti olmali.
		System.out.println(maas);// 
		System.out.println(harf);
		
		int sayi = 123;
		System.out.println(sayi);
		
		boolean isOld = true; // boolean'lar icin sadece true ya da false kullanabilirsiniz.
		System.out.println(isOld);
		
		boolean isNew = false; 
		System.out.println(isNew);
		
		byte derinlik = 123;
		System.out.println(derinlik);
		
		short sirnakNufus = 28000;
		System.out.println(sirnakNufus);
		
		long hucreSayisi = 50034099987867659l; 
		
		System.out.println(hucreSayisi);
	
		double pi = 3.14;
		System.out.println(pi);//Java butun ondalik kesirleri otomatik olarak double kabul eder.
	
		float para = 5.25f;//Java ondalikli sayilari double kullanmak ister. Ancak siz israr ile float kullanmak isterseniz o zaman rakamin sonuna f konulur.
		System.out.println(para);
	
		String ogrenciIsmi = "Ali Can";
		System.out.println(ogrenciIsmi);
	
	}

}
