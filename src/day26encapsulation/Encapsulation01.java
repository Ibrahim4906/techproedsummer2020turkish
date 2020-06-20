package day26encapsulation;

public class Encapsulation01 {
	private String kimlikNo = "34212367512";// encapculation 1.adim bu sekilde 
	// tamamlanmis oldu. access modifier "private" olmalidir. 
	private int krediKartNo = 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
		// Encapsulation data saklama (data-hiding) yontemidir.
		// encapsulation iki stepte yapilabilir. 
		// 1) Data'yi (variable,method) private yapmalisiniz.
		// 2) Public olan getter() ve setter() methodlar uretmeliyim.
		// getter() data'yi sadece okumamiza yarar, getter() methodu data'da 
		// degisiklik yapamaz.
		// setter() data'yi degistirmemize yarar.
	}
	public String getKimlikNo() {
		return kimlikNo; 
		// getter uretmek icin: 
		// 1.access modifier public olmali 
		// 2.Return type variable'in return type ile ayni olmali(String)
		// 3.Method ismi "get + variable ismi" seklinde olmali. 
	}
	public int getKrediKartNo() {  // void degilse return kesinlikle kullanilmalidir.
		return krediKartNo;
	}
	// return type boolean ise method ismi "is" ile baslar. "get" kullanilmaz.
	public boolean isSoguk() {
		return soguk;
	}
	// setter uretmek icin: 
	// 1) Access Modifier public olmali.
	// 2) 
	// 
	public void setKimlikNo(String kimlikNo) {  // setter() methodlarda daima void kullanilir.										
		// setter icerisine parametre yazmak zorundayiz. 
		this.kimlikNo = kimlikNo; 
			
	}
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo = krediKartNo;
	}
	public void setSoguk(boolean soguk) {
		this.soguk = soguk;
	}

}
