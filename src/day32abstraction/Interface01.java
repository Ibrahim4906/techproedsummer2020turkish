package day32abstraction;

public interface Interface01 {
	// interface icine concrete method yazarsaniz cte hatasi alirsiniz.
	// public void add() {} // Bu yazilim icin hata alirsiniz.
	// Interface'de method olustururken kesinlikle body olusturmayin.
	// Interface'deki abstract method'lari uretirken abstract keyword kullansaniz da
	// olur kullanmasaniz da olur. Cunku Interface kendi icine yazilan method'lari otomatik
	// olarak abstract olarak kabul eder.
	
	public void add();
	public abstract void substract();

	public static final int a = 12;
	int b = 11; // onunde public static final olmasa da hata vermez. Java onu anlar.
	public int c = 12;
	final int d = 14; 
	static int e = 15; 
	
}
