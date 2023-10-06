package curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
 try {
      Scanner scan = new Scanner(System.in);
	  System.out.println("Introduceti un numar");
	  int num1 = scan.nextInt();
	  
	  System.out.println("Introduceti un numar");
	  int num2 = scan.nextInt();
	  num2 = (Integer)null;
	  
	
	  System.out.println(num1/num2);
	  
	}catch(ArithmeticException e) {
		  System.out.println("nu este permis sa imparti la 0");
		  
	}catch (InputMismatchException e) {
		System.out.println("Tre s aintorduci doar numere");
		
	}catch(NullPointerException e) {
		System.out.println("Null pointer");
		
	}catch(Exception e) {
		System.out.println("Something went wrong");
	}
  }
}

	

