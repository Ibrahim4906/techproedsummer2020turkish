package javapracticeday7;

public class Case {

	private String actualCase;  // private kullanmaz isek java default atamasi yapar.
	private String emergency;   // once setter olusturuyoruz. Bu bilgileri sonra kullanmak istiyoru.
							    // sonra getter ile olusturulan bilgileri cagiriyoruz, geri aliyoruz. 
								// get ve setter olusturmanin kisa yolu yandaki actualCase; ya da
								// emergency; ifadelerinden birisinin uzerine gelip source'dan
							    // generate getter and setter yapmak ve all secmektir.
	

		// Durum(Case)
		// Case sinifi olusturunuz ve icinde 2 String variable olsun ve private olsunlar
		// sonra getter ve setter'ler kullaniniz.
		// String actualCase// su an durumu 
		// String emergency // acil durum 
		

	public String getActualCase() {
		return actualCase;
	}



	public void setActualCase(String actualCase) {
		this.actualCase = actualCase;
	}



	public String getEmergency() {
		return emergency;
	}



	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

}
