package day26encapsulation;

public class Dog extends Mammal {
	public boolean sadik = true; 
	public static void main(String[] args) {
		Dog dog = new Dog();
			System.out.println("Animal Class'tan geldi: " + dog.age);
			System.out.println("Animal Class'tan geldi: " + dog.name);
			dog.move();// Hareket edebilir
			dog.eat();
			System.out.println("Mammal Class'tan geldi: " + dog.dogum);
			dog.feed();// Cocuklarini besler
			System.out.println("Dog Class'tan geldi" + dog.sadik);// true
			dog.bark();
			
	}
	public void bark() {
		System.out.println("Kopekler havlar");
	}

}
