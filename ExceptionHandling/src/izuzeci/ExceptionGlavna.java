package izuzeci;

public class ExceptionGlavna {

	public static void main(String[] args) {
		
		
		System.out.println("Ovo je promena na Danilovoj grani");
	
		int broj1 = 10;
		int broj2 = 0;
		
		
		try {
			System.out.println("Podelio sam!");
			System.out.println(RacunskeOperacije.divide(broj1, broj2));
		} catch (Exception e) {
			System.out.println("Ne mozete da delite sa 0");
		}
		
		
		System.out.println("I Ovo je promena na Danilovoj grani");
		

	}

}
