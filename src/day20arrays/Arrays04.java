package day20arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Bir array'in icinde belli bir elemanin var olup olmadigini kontrol ediniz.
		// binarySearch() methodu ile yapabiliriz. 
		// Onemli Not: binarySearch() methodunu kullanmadan once sort() methodunu kullanmak 
		// zorundasiniz. Aksi takdirde binarySearch() methodu anlamli bir sonuc vermez.
		
		int arr[] = {1,4,2,4,3};
		// Yukarida verilen array'de 3 eleman olarak var mi?
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr,3));// 2 return eder. Cunku sort edildiginde
													   // siralama yapilir.3 index'te 2'dir.
		System.out.println(Arrays.binarySearch(arr,4));// ayni iki sayi icin ilkinin index'ini
													   // return eder.
		System.out.println(Arrays.binarySearch(arr,5));
		// negatif sonuc o elemanin array'da olmadigini, sayisi ise var olsaydi kacinci 
		// sirada oldugunu gosterir. Dikkat edelim bu sira index degildir.
	}

}
