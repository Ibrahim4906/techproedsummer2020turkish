package day16overloading;

public class Overloading1Tekrar {

	

	public static void main(String[] args) {
		
		okul(1234,24);
		okul(1234);
		okul(1234567.80);
		
		
	}
		private static void okul(double para) {
			System.out.println("Okul aile birligi parasi: " + para + " $");
		
	}
		public static void okul(int ogrenci,int ogretmen) {
			System.out.println("Okuldaki ogrenci ve ogretmen sayisi: " + (ogrenci+ogretmen) + " kisi");
		}
		
		public static void okul(int veli) {
			System.out.println("Okuldaki veli sayisi: " + veli + " kisi");
		}
		
}
