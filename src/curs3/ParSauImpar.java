package curs3;

import java.util.Scanner;

public class ParSauImpar {
	
	//Variabila de instanta/ de clasa
	//int number;
	
	/*public void askTheUser() {
		System.out.println("Insert the number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		String nume; // variabila locala }*/
		
	
	
	
	public int askTheUser() {
		System.out.println("Insert the number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		return number;
		//String nume; // variabila locala
	}
		
	public void checkNrIsOddOrEven() {
		
		if (askTheUser() % 2 ==0) {
			System.out.println( askTheUser() + " is " + "par");
			
		}else {
			System.out.println( askTheUser() + " is " + "impar");
		}
	}

	
	

		
	}


