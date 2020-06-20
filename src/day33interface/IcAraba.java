package day33interface;

public interface IcAraba {
	
	int price = 2000; // final variable'lar mavi renklendirilir.
	boolean old = true;
	public abstract void direksiyon();// istersek public ve abstract yazmayabiliriz. 
	public void koltuk();
	abstract void klima();
	
	public default void doseme () {
		System.out.println("Interface'de default keyword ile doseme yaptim");
		
	}
	
	// public default void isitma (); default keyword'unu kullanirsak methoda body eklemek zorundayiz.
	// Aksi takdirde CTE hatasi aliriz.
}
