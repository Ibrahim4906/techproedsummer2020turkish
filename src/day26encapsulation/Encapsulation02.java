package day26encapsulation;

public class Encapsulation02 {
	
	private char ilkHarf = 'S';
	private double para = 23.75;
	private boolean emekli = false;
	// Variable'a atanan degerin degistirilmesini istemiyorsaniz o variable ile alakali setter() 
	// 

	public static void main(String[] args) {
		Encapsulation01 obj = new Encapsulation01();
        System.out.println(obj.getKimlikNo());
        obj.setKimlikNo("10000000000");
        System.out.println(obj.getKimlikNo());
		

	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
