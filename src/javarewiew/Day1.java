package javarewiew;

import java.util.Scanner;

public class Day1 {
	
	public static void main(String[] args) {
		
				
			
				System.out.println("     1     ");
				System.out.println("    1 1    ");
				System.out.println("   1 2 1   ");
				System.out.println("  1 3 3 1  ");
				System.out.println(" 1 4 6 4 1 ");
				/*
				     A
				    B B
				   C   C
				  D     D
				 E       E
				F         F
				 E       E
				  D     D
				   C   C
				    B B
				     A
				*/
					System.out.println("       A      ");
					System.out.println("  	  B B     ");
					System.out.println("     C   C    ");
					System.out.println("    D     D   ");
					System.out.println("   E	   E  ");
					System.out.println("  F         F ");
					System.out.println("   E       E  ");
					System.out.println("    D     D   ");
					System.out.println("     C   C    ");
					System.out.println("  	  B B     ");
					System.out.println(" 	   A      ");
				
				
				//sagliginiz icin "Evde Kal". cumlesini ekrana yazdiriniz.
				 
				
			System.out.println("Sagligin icin \"Evde Kal\".");
				
			System.out.println("Would you like \'coffee\' or \'tea\' ?");
			
			// double 10.231 sayisini int'e ceviriniz

			 
			double sayi1= 10.231;
			int sayi2 = (int) (sayi1);
				
			System.out.println(sayi2);
			
			int a = 11;
			int b = 5;
			double pi =3.14;
			
			System.out.println(a*b);
			System.out.println(a*pi);
			System.out.println(b/a);
			System.out.println(a*b/pi);
			System.out.println(a+b+pi);
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(-pi/a);
			System.out.println((a+b)/pi);
			System.out.println((b/pi)*a);
			
			/*
			hi 21
			hi Harun
			5TechProEd203
			TechProEd305
			7TechProEd305
			Yukaridaki ifadeleri ekrana yazdiriniz.
			
			*/
			
			System.out.println("hi " + 2 + 1);
			System.out.println("hi" + " Harun");
			System.out.println(5 + "TechProEd" + "203");
			System.out.println("TechProEd" + 305);
			System.out.println(7 + "TechProEd" + 305);
			
			/*  islem önceligine göre cozunuz.
			    a. -5 + 8 * 6
			    b. (55+9) % 9
			    c. 20 + -3*5 / 8
			    d. 5 + 15 / 3 * 2 - 8 % 3
			*/
			System.out.println(-5 + 8 * 6);
			System.out.println((55+9) % 9);
			System.out.println(20 + -3*5 / 8);
			System.out.println(5 + 15 / 3 * 2 - 8 % 3);
			
			
			System.out.println(Math.pow(2,3));// Yandaki ifade 2'nin ustu 3 seklinde sonuc verir.
			System.out.println(Math.sqrt(144));//Yandaki ifade sayinin karakökünü alir.
			System.out.println(Math.round(2.7));//Yandaki ifade sayiyi uygun sayiya yuvarlar.
			
			System.out.println(Math.pow(2,2));
			System.out.println(Math.sqrt(36));
			System.out.println(Math.round(3.513));
			
			//Dikdörtgenin alanini ve cervresini bulunuz
			 
			double sayia = 5.6;
			double sayib = 8.5;
			
			double Cevre = 2*(sayia+sayib);
			double Alan = sayia * sayib;
			
			System.out.println("cevre = " + 2*(sayia + sayib));
			System.out.println("alan = " + sayia * sayib);
			
			/*
			Kullanıcıdan Dikdörtgenin kenar uzunluğunu alan ve sonra bu karenin alan ve
			çevresini hesaplayıp ekrana yazdıran bir program yazınız.
			integer kullanınız
			Not: Alan: Boy x En
			Not: Çevre: 2x (Boy + En)
			*/
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Lutfen dikdörtgenin boy uzunlugunu giriniz...");
			int boy = scan.nextInt();
			
			System.out.println("Lutfen dikdörtgenin en uzunlugunu giriniz...");
			int en = scan.nextInt();
			
			int Alan1 = en * boy;
			int Cevre1 = 2*(en + boy);
			
			System.out.println("Alan= " + Alan1);
			System.out.println("Cevre= " + Cevre1);
			
			
			/*Kullanicidan üc sayi isteyin ve ekrana bu sayilarin toplamini yazdiriniz.
			 * 
			 * 
			 */
			Scanner Scan = new Scanner(System.in);
			
			int numAB,numBC,numCD,toplam;
			System.out.println("Lutfen birinci sayiyi giriniz...");
			int birincisayi = scan.nextInt();
			System.out.println("Lutfen ikinci sayiyi giriniz...");
			int ikincisayi = scan.nextInt();
			System.out.println("Lutfen ucuncu sayiyi giriniz...");
			int ucuncusayi = scan.nextInt();
			
			System.out.println("Sonuc= " + (birincisayi+ ikincisayi + ucuncusayi));
					
			
			
					
			}

		
		
		
	}


