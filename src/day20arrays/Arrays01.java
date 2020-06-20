package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		// Kullanicidan kac elemanli bir array girmesini isteyin.
		// Bu array'in tum elemanlarini ekrana yazdirin.
		// Bu array'in ilk elemanini son eleman yapin ve tum elemanlarini ekrana yazdirin.
		// Mesela; array {1,2,3} ise ekrana {2,3,1} seklinde yazdirin.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli bir integer array olusturmak istersiniz");
		int length = scan.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Array elemanlarini giriniz");
		for(int i=0; i<length; i++) {
			arr[i] = scan.nextInt();
			}
		System.out.println(Arrays.toString(arr));
		/* Buradaki yazdirma islemi ile array'in ismi yazilip yandaki Arrays.toString() 
		// ifadesi yazilirsa o array'in tum elemanlarini ekranda gorursunuz.
		int arrSon [] = new int[length];
		for ( int i = 1; i<length; i++) {
			arrSon[i-1] = arr[i];
		}
		arrSon[length-1] = arr[0];
		System.out.println(Arrays.toString(arrSon));
			*/
	}

}
