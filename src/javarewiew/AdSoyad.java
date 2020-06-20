package javarewiew;

import java.util.Scanner;

public class AdSoyad {

	public static void main(String[] args) {
		/* SORU1: 
		// Adinizi ve soyadinizi ekrana yazdiriniz.
		// 1.yol:
		System.out.println("Ibrahim Saffet KASMER");
		
		// 2.yol
		System.out.println("Isim: " + "Ibrahim Saffet");
		System.out.println("Soyisim " + "KASMER");
		
		// 3.yol
		String isim = "Ibrahim Saffet";
		String soyisim = "KASMER";
		String bosluk = " ";
		System.out.println(isim + bosluk + soyisim);
		
		// SORU2:
		
		int nm = 11 + 'A';
		System.out.println(nm);
		String str = "Merhaba";
		System.out.println(str);
		char ch = 'T';
		System.out.println(ch);
		boolean isNumPozitif = true;
		System.out.println(isNumPozitif);
		long In = 1324;
		System.out.println(In);
		double dl = 62.0; // double'da 62 de yazilsa hatali olmazdi.
		System.out.println(dl);
		float fl = 5.2f;
		System.out.println(fl);
		
		// Soru 3: 
		 
		int harf = '1'; // Ascii kod degeri 49
		char ch = '2'; // Ascii kod degeri 50
		
		
		System.out.println(harf + ch);// 99
		System.out.println(harf + " " + ch);// 49 2
		
		System.out.println(17 + 3);// 20
		System.out.println(17 + "" + 3);// 173
		System.out.println("" + 17 + 3);//173
		System.out.println("" + 24 + 3 + 6 + 10);//243610
			
	  // Soru 4: 
		
			// '!' , '%' , '*', '$', '@', '&'
		int unlem = '!';
		System.out.println(unlem);
				
		int yuzde = '%';
		System.out.println(yuzde);
		
		int asteriks = '*';
		System.out.println(asteriks);
		
		int dollar = '$';
		System.out.println(dollar);
		
		int et = '@';
		System.out.println(et);
		
		int and = '&';
		System.out.println(and);
		 
		// Soru5 : int ve long data tipinin max. ve min. degerleri
		// Kod asagidaki sekilde dinamik sekilde yazilirsa
		// Daha sonra guncellemelere ve degisikliklere hazir olur.
		int maxdeger1 =  Integer.MAX_VALUE;
		System.out.println("Maksimum Integer degeri: " + maxdeger1);
		int mindeger1 = Integer.MIN_VALUE;
		System.out.println("Minimum Integer degeri: " + mindeger1);
		long maxdeger2 = Long.MAX_VALUE;
		System.out.println("Maksimum Long degeri: " + maxdeger2);
		long mindeger2 = Long.MIN_VALUE;
		System.out.println("Minimum Long degeri: " + mindeger2);
		
		long tlfLng = 535_200_3030L;
		System.out.println(tlfLng);
		
		
		// Kullanicidan iki farkli kelime isteyelim.(String olarak)
		// Sonuna ! isareti ilave edin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci kelimeyi giriniz");
		String str1 = scan.next();// Iki ya da daha fazla kelime 
								  // girilecek ise nextLine kullanilmalidir.
		
		
		System.out.println("Ikinci kelimeyi giriniz");
		String str2 = scan.next();
		
		System.out.println(str1 + str2 + "!");
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		int sayi1 = scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz");
		int sayi2 = scan.nextInt();
		
		int kare1 = sayi1*sayi1;
		int kare2 = sayi2*sayi2;
		
		int kat5ilk = sayi1*5;
		int kat5ikinci = sayi2*5;
		
		int fazla12ilk = sayi1+12;
		int fazla12ikinci = sayi2+12;
		
		int eksi5ilk = sayi1-5;
		int eksi5ikinci = sayi2-5;
		
		System.out.println("ilk sayinin karesi: " + kare1 );
		System.out.println("Ikinci sayinin karesi: " + kare2 );
		
		System.out.println("ilk sayinin 5 kati: " + (kat5ilk));
		System.out.println("Ikinci sayinin 5 kati: " + (kat5ikinci ));
		
		System.out.println("ilk sayinin 12 fazlasi: " + (fazla12ilk));
		System.out.println("Ikinci sayinin 12 fazlasi: " + (fazla12ikinci ));
		
		System.out.println("ilk sayinin 5 eksigi: " + (eksi5ilk));
		System.out.println("Ikinci sayinin 5 eksigi: " + (eksi5ikinci ));
		
		int i1 = 23;
		int i2 = 15;
		int i3 = 38;
		int i4 = 14;
		
		
		System.out.println(i1+i2*i3);
		System.out.println(i1*i2 + i3*i4);
		System.out.println((i1+i2)/i4);
		System.out.println(i4*(i2 + i1 / 3));
		
		
		*/
		// 
		
		int sayi1 = 23;
		int sayi2 = 54;
		int gecici = 0;
		System.out.println("Yerdegistirmeden onceki degerleri");
		System.out.println("sayi1'in degeri: " + sayi1);
		System.out.println("sayi2'in degeri: " + sayi2);
		
		gecici = sayi1;
		sayi1 = sayi2;
		sayi2 = gecici;
		
		System.out.println("Yerdegistirdikten sonraki degerleri");
		System.out.println("sayi1'in degeri: " + sayi1);
		System.out.println("sayi2'in degeri: " + sayi2);
		
		
		int sayiA = 67;
		int sayiB = 12;
		System.out.println("sayiA: " + sayiA);
		System.out.println("sayiB: " + sayiB);
		sayiA = sayiA + sayiB;
		sayiB = sayiA - sayiB;
		sayiA = sayiA - sayiB;
		
		System.out.println("sayiA: " + sayiA);
		System.out.println("sayiB: " + sayiB);	
		
		
		
		
		}
	

}
