package day27constructorcagirma;

public class Animal {

	public int age;
	protected String name;
	public static void main(String[] args) {
		// 

	}
	public void move () {
		System.out.println("Hareket edebilir");
	}
	public void eat () {
		System.out.println("Yemek yer");
	}
	
	Animal(){ // Constructor olusturduk.
		System.out.println("Animal parametresiz constructor");
	}
	

}
