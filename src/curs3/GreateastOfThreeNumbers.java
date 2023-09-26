package curs3;

import java.util.Scanner;

public class GreateastOfThreeNumbers {
	//Facem un program care verifica care dintre 3 numere date de utilizator este cel mai mare
	//Printam numarul cel mai mare 
	//Daca doua numere sunt egale cu valorile cele mai mari
	//Printam some nr are equals
	
	int nr1, nr2, nr3;
	
	public void askTheUserForNumbers() {
		System.out.println("Insert the first number");
		Scanner scan = new Scanner(System.in);
	    nr1 = scan.nextInt();
	    
	    System.out.println("Insert the second number");
		Scanner scan2 = new Scanner(System.in);
	    nr2 = scan.nextInt();
	    
	    System.out.println("Insert the third number");
		Scanner scan3 = new Scanner(System.in);
	    nr3 = scan.nextInt();
	}
	
	
	public void greatestOfThreeNumbers() {
		
		if(nr1 > nr2 && nr1 > nr3)  {
			 System.out.println("The first number is the greatest");
	}else if(nr2 > nr1 && nr2 > nr3) {
		System.out.println("The second number is the greatest");
	}else if(nr3 > nr1 && nr3 > nr2) {
		System.out.println("The third number is the greatest");
	}else {
		System.out.println("Some numbers are equals");
	
	}

}
}
