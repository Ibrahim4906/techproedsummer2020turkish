package day29polymorphismexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

	// Checked Exception'lari (Compile Time Exp.) handle etmek icin iki yol var.
	// Birincisi "throws" keyword'unu kullanmak. Bunu kullanirsaniz console'da
	// teknik mesajlar gorursunuz. Bu yuzden tercih edilmez. 

public class Exception02 {
	public static void main(String[] args) throws FileNotFoundException {
		
			FileInputStream file = new FileInputStream("C/ogrenci.txt");
		
	}
}
// Ikincisi try-catch block kullanmaktir. Bunu kullanirsaniz console'da teknik mesajlar
// yerine kendi yazdiginiz mesajlari gorebilirsiniz.
class ExceptionTryCatch{
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C/ogrenci.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Dosyanin pathi yanlis ya da dosya silinmis olabilir");
		}
	}

}
