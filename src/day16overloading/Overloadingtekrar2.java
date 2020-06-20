package day16overloading;

public class Overloadingtekrar2 {
	 
	public static void main(String[] args) {
		
		okul(33);
		okul(100, 10);
		
	}
	
	public static void okul(int idare) {
		System.out.println("idareci sayisi: " + idare);
	}
	
	public static void okul(int veli, int ogretmen) {
		System.out.println("veli ogretmen toplami: " + (veli + ogretmen));
	}
	

}
