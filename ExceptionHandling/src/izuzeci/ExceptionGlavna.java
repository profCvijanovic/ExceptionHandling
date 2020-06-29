package izuzeci;

public class ExceptionGlavna {

	public static void main(String[] args) {
		
		
		System.out.println("Pozdrav!");
		System.out.println("Sada cemo da radimo exceptione!");
		
		
		int broj1 = 10;
		int broj2 = 0;
		
		// Exception handling koristeci if else strukturu
		if(broj2 != 0) {
			int kolicnik = broj1/broj2;
			System.out.println("Kolicnik je: " + kolicnik);
		}else {
			System.out.println("Zabranjeno je deliti sa nulom!!!");
		}
		
		System.out.println("Nastavak....");
		
		
		
		
		
		

	}

}
