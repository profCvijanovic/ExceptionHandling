package izuzeci;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionGlavna {

	public static void main(String[] args) {
		
		System.out.println("Unesite broj artikla: ");
		System.out.println("0,1 ili 2");
		Scanner scanner = new Scanner(System.in);
		
		
		List<String> korpa = new ArrayList<String>();
			korpa.add("mis");
			korpa.add("tastatura");
			korpa.add("monitor");
	
		try {
			int broj = scanner.nextInt();
			String izabraniArtikal = korpa.get(broj);
			System.out.println("Izabrali ste: " + izabraniArtikal);
			System.out.println("Kraj");
		}catch (Exception e) {
			System.out.println("Ovo pokriva sve ostale exceptione");
			System.out.println("Kraj");
			e.printStackTrace();
		}finally {
			scanner.close();
			System.out.println("Zatvoren skener");
		}
		
		
		
		
		
		
		

	}

}
