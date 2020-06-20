package day26encapsulation;

public class Cat extends Mammal {
public boolean clean = true;
	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println("Animal'dan geldi: " + cat.age);
		System.out.println("Animal'dan geldi: " + cat.name);
		cat.move();// Animal
		cat.eat();//Animal
		System.out.println("Mamal'dan geldi: " + cat.dogum);
		cat.feed();// Mamal
		System.out.println("Dog Class'tan geldi: " + cat.clean);
		cat.meow();
		
	}
	public void meow() {
		System.out.println("Kediler miyavlar");
	}

}
