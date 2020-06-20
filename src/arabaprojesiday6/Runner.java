package arabaprojesiday6;

public class Runner {

	public static void main(String[] args) {
		//       Sol tarafta olan(Car) =  Sagda olan object type(Toyota) 
		// polymorphisse : Car araba1 = new Car Toyota();
		
		Car araba1 = new Honda();
		System.out.println(araba1.arabaMarkasi());// Honda
		
		System.out.println("Arabanin markasi " + araba1.arabaMarkasi());
		System.out.println("Arabanin modeli " + araba1.arabaModeli());
		System.out.println("Arabanin yili " + araba1.arabaYili());
		
		Car araba2 = new Honda("Jazz",2020);
		System.out.println("Arabanin markasi " + araba2.arabaMarkasi());
		System.out.println("Arabanin modeli " + araba2.arabaModeli());
		System.out.println("Arabanin yili " + araba2.arabaYili());
		
		

	}

}
