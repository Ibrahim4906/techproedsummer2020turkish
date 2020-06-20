package day27constructorcagirma;

public class Mammal extends Animal {
	public boolean dogum = true;

	public static void main(String[] args) {
		
	//Mammal mammal = new Mammal();
		Mammal mammal01 = new Mammal(15);

	}
	public void feed () {
		System.out.println("Cocuklarini besler");
	}
	
	Mammal(){ // Constructor olusturduk.
		this(11);// Parent'daki parametresiz constructor'i cagir.
				// super() keyword'unu kullanmazsaniz da olur ancak bazilari 
				// kullanir, sasirmayalim.
		System.out.println("Mammal parametresiz constructor");
		// super() buraya yazilamaz, Cunku this() 'de oldugu gibi ilk satira 
		// yazilmali. Ayrica this() ve super() ayni anda kullanilamaz. 
		// Cunku ikisi de ilk satirda olmak ister, bu da mumkun degil. 
		// super() yazilsa da, yazilmasa da olur. Birsey degismez. 
		// this() ayni Class icerisindeki parametresiz constructor'i 
		// cagirmak icin kullanilir. 
	}
	Mammal(int age){
		super();
		System.out.println("Mammal parametreli constructor");
	}

}


