package day38interviewhazirlik;

public class InterviewHazirlik01 {
	
	// 1) Java "Platform Independet" programlama dilidir. 
	// Yani java her platformda calisir. Ornegin kodumuzu MAC'ta yazarsak, windows'ta calistirabiliriz.
	// IDE : Integreted Development Environment demektir. Eclipse ve IntelliJ piyasada kullanilan meshur iki IDE'dir 
	
	// Constructor : Yeni bir object uretilirken Constructor aktive olur ve objecti uretir. 
	// 				 Return type'i yoktur.
	// 				 Ismi Class ismi ile aynidir.
	// 				 Object uretmek icin Constructor uretmek zorunda degiliz. Cunku Java her class icin default
	// 				 bir constructor uretmistir. Default constructor'lar parametresizdir.
	// 				 Biz herhangibir constructor urettigimizde default constructor'lar yok olur. Constructor'lar
	// 			     overload edilebilir. Constructor'lar child Class'lardan cagirabilirler. ama override edilemezler.
	
	// 4) OOP Concept nedir?
	// 				OOP concept a) Inheritance b)Encapsulation  c) Polymorphism d) Abstraction  e) Interface icerir.
	
	// a) Inheritance nedir? 
	// 				Inheritance parent (super Class) - child ( sub Class ) iliskisidir.
	// 			    A Class'i B Class'ina extends ederse A child , B parent olur. 
	// 			    A Class'i B interface'ine implements ederse A child olur, B parent olur.
	// 			    A interface'i B interface'ine extends ederse A child, B parent olur. 
	// 				Child parent'teki kodlarin public ve protected olanlarini kullanabilir. 
	// 				Reusability(Tekrar kullanabilme), short coding, maintenance (tamir) faydalari vardir. 
	
	// b) Encapsulation nedir? 
	// 				Data hiding (Data gizleme) demektir. Data'lar private yapilarak gizlenir. Gizlenen data'lar
	// 				getter() ile okunur, setter() ile update edilir. 
	// 				Degistirilmesini istemedigimiz kodlari koruma altina almak icin kullanilir. Maintanance bir
	// 				faydasi da vardir. 
	
	// c) Polymorphis 
	// 				Polymorpmism(Coklu yapi) overloading ve overriding'dir. 
	
	// d) Abstract Class nedir?
	// 				Abstract Class uretmek icin abstract keyword kullanmaliyiz.
	// 				Abstract Class'lardan object uretilemez. (instantiate yapilamaz)
	// 				Abstract Class'larda hem abstract hem de concrete methodlar bulunabilir.
	// 				Abstract Method'un oldugu Class kesinlikle abstract olmalidir.
	// 				Abstract methodlarin ( bodysiz ) concrete child'lar tarafindan override edilme zorunlulugu 
	// 				vardir. Concrete'ler override edilmese de olur. 
	// 				Mutlaka soylenmesi gereken ifade : Abstract Class'i child Class'lari bazi gorevleri yapmak 
	// 				zorunda birakmak icin olustururuz.
	
	// e) interface nedir? 
	// 				Java normalde multiple inheritance'a musaade etmez. Bu yuzden Abstract Class kullandigimizda 
	// 				multiple inheritance yapamayiz. Fakat bazi projelerde multiple inheritance kullanmak zorunda
	// 				kaliriz. Bunu Java bize interface kullanma hakki vererek halletmistir. 
	
	// 5) Overloading nedir?
	// 				Method ismi ayni tutularak parametrelerin sayilari, yerleri ve data type'leri degistirilerek
	// 				methodlar olusturmaktir. Overloading Compile Time'dir. Yani overloading'de yaptiginiz hata
	// 				code yazarken belli olur. 
	// 				Ayni isme sahip methodlarda farkli islemler yapabilmek icin Mesela; substring(4) ve 
	// 				substring(4,7) methodlarinin fonksiyonlari esasinda aynidir. Ikisi de bir String'in 
	// 				belli bir bolumunu almaya yarar. Fakat bazi durumlarda bitis index'ini soylemek gerekir.
	// 				bazi durumlarda gerekmez. Bunun icin parametreleri farklilastiririz. Bu da overloading'i dogurur.
	
	//	6) Overriding nedir? 
	// 				Method Signature'a (Method ismi + Parametreler dokunmuyoruz, sadece body'i degistiriyoruz.
	// 				Overriding inheritance olunca olur. 
	// 				Ayni methodun farkli kullanimlari icin overriding gereklidir. 
	// 				Animal da ses() {Ses cikarir} ==> Dog() {Havlama} ==> Kedi() {Miyavlama}
	// 				Overriding Run Time Error verir.
	
	// 7) Array ile ArrayList arasindaki fark nedir?
	// 				Array olusturulurken uzunlugu onceden belli olmali ve degistirilemez. Fakat ArrayList'lerde
	// 				baslangicta uzunlugu belirtme zorunlulugu yok. Eleman ekledikce, uzunluk artar. Eleman 
	// 				sildikce azalir.
	
	// 8) String ile StringBuilder arasindaki fark nedir?
	// 				String'ler immutiable'dir, StringBuilder mutable'dir. 
	// 				StringBuilder Class'i daha fazla kullanisli methodlara sahiptir. 
	// 				Mesela; bir String'i tersten yazdirmaya yarayan reverse() methodu. 
	
}
