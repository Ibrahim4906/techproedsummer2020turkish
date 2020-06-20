package day28overriding;

public class Mammal extends Animal {
	public boolean birth = true;
	public String name = "Kedi";
	public static void main(String[] args) {
		Mammal mammal = new Mammal();
	}
	
	public void feed() {
		System.out.println("Yavrularini besler");
	}
	
	public Mammal () {
		// this icinde bulundugunuz Class'daki variable ve methodlara
		// ulasmanizi saglar.
		System.out.println(this.birth);// true return eder.
		this.feed();// Yavrularini besler return eder.
		// Child - Parent iliskisi varsa this kullanarak parent Class'daki
		// variable ve method'larada ulasabilirsiniz.
		System.out.println(this.age);// 4 return eder. 
		System.out.println(this.name);// Kedi return eder.
		this.move();// Hayvanlar hareket eder return eder.
		// Parantezsiz super parent'lardaki variable ve methodlara ulasmanizi
		// saglar. Super sadece parentlara ulasmayi saglar. Bulundugu Class'daki
		// variable ve methodlara ulasamaz.
		System.out.println(super.age);// 4 return eder.
		System.out.println(super.name);// Karabas return eder.
		super.move();// "Hayvanlar hareket eder" return eder.
		// Parent'takilere super ile ulasmak daha guvenlidir. 
		// Asagida verilen ornekte oldugu gibi this.name yazildiginda 
		// kendi Class'indaki name return eder. Parent'taki name 
		// return eden "Karabas" degisir ve "Kedi" return etmeye baslar
		// Bu yuzden Class icinde this , Parent Class icinde parantezsiz 
		// super kullanilir.
		
		System.out.println(this.name);// "Kedi" return eder.
		
	}
}
