package izuzeci;

public class ExceptionGlavna {

	public static void main(String[] args) {
		
		
		System.out.println("Pozdrav!");
		System.out.println("Sada cemo da radimo exceptione!");
		
		
		int broj1 = 10;
		int broj2 = 0;
		
		// Exception handling koristeci try catch strukturu
		try {
			int kolicnik = broj1 / broj2;
			System.out.println("Kolicnik je: " + kolicnik);
		}catch (NumberFormatException e) {
			System.out.println("Los format");	
		}catch (ArithmeticException e) {
			System.out.println("Ne smes da delis nulom!");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Uhvatio sam neki exception!");
		}
		
		System.out.println("Nastavak....");
		
		
		
		
		
		

	}

}
