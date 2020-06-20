package javarewiew;

import java.util.Scanner;

public class Day22 {

	public static void main(String[] args) {
		// Soru 4 : 
				/* 
		        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
		        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
		        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
		        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
		                 Harun
		                 Ekinci
		        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
		                 1983
		                 2020        
		        5.Adım Raporu aşağıdaki gibi yazdırınız      
		                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
		        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
		           //Şifre= 37HEi56        
		        
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Lutfen adinizi giriniz");
				String ad = scan.nextLine();
				System.out.println("Lutfen soyadinizi giriniz");
				String soyad = scan.nextLine();
				
				
				System.out.println("Lutfen dogum yilinizi ve simdiki yili giriniz");
				int yil1 = scan.nextInt();
				int yil2 = scan.nextInt();
				
				System.out.println("adiniz: " + ad + " soyadiniz: " + soyad + " yasiniz" + (yil2 - yil1));
				String rapor = scan.nextLine();
			
			
				String ad,soyAd,rapor;
				int d_yıl,b_yıl;
				
				System.out.println("Lütfen Adınızı Giriniz:");
				ad= sc.nextLine();
				System.out.println("Lütfen Soyadınızı Giriniz");
				soyAd= sc.nextLine();
				System.out.println("Lütfen Doğum yılınızı giriniz");
				d_yıl= sc.nextInt();
				System.out.println("Lütfen şimdiki yılı giriniz");
				b_yıl= sc.nextInt();
				int yas=(b_yıl-d_yıl);
				rapor="Adınız: "+ad+ " Soyadınız: "+soyAd+" Yaşınız: "+yas;
				
				System.out.println(rapor);
				String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
				+soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
				System.out.println("Şifreniz: "+sifre);
				*/
	}

}
