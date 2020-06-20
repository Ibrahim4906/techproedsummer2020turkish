package javapracticeday5;

public class OCASorusu {

	public static void main(String[] args) {
		/*
		String str = "M ";// M
		str = str.concat("E ");//M E 
		String add = "S ";//S
		str = str.concat(add);//M E S
		str.replace("S", "T");// Burada herhangibir islem yok. Cunku hicbiryere
		// atama yapilmadi. Burasi atlanir.
		str = str.concat(add);//M E S S
		System.out.println(str); //sonuc olarak console'da "M E S S" return eder
		
		 */
		String names = "Aydin Erkan Bayram Ersin";
		names.replace("Erkan", " ");// replace() methodu yerdegistirmek
										  // icin kullanilir.
		names = names.replace("Erkan", " ");
		System.out.println(names);
		
		
		
		String name = "Cevdet";
		name += " Ahmet";// String'lerde + concatination yaptirir.
		System.out.println(name);
		
		int num = 23;
		num = num + 12;
		num += 5;
		System.out.println(num++);// Burada sonuc 40 cikar. iceriye yazilan 
		// ++ bir sonraki asamada sonucu 41 yapar.Ancak su an sonuc 40.
		
		int num2 = 32;
		num2 = 12;// 32 gider yerine 12 atanir ve sonuc 12 olur. 
		num2 += 12; //Burada ise num2'ye 12 ilave edilir ve sonuc 24 olur.
		System.out.println(num2);
	}

}
