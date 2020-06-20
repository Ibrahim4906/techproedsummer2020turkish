package day16overloading;

public class Constructor02 {

		public static void main(String[] args) {
			// 1)Baska bir Class'dan urettigimiz object yeni urettigimiz bir Class'ta kullanilabilir.
			// 2)Object'in ozelliklerini degistirebiliriz. fakat bu degisiklik sadece o object ile sinirli kalir.

		
		Constructor01 hondaAraba01 = new Constructor01();
		System.out.println("Zamli Fiyat: " + (hondaAraba01.price + 1000 ) );
		System.out.println("Year: " + (hondaAraba01.year-1));
		System.out.println("Type: " + hondaAraba01.type.replace("Civic", "Canry"));
		System.out.println("Make: " + hondaAraba01.make.replace("Honda","Toyota"));

	}

}
