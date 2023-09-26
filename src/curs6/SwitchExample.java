package curs6;

import java.util.Scanner;

public class SwitchExample {
	// Switch este o conditie multiway, multiple condition, inlocuieste un if unde este cazul
	//avantaj este un improve citibil 
	
	/* 
	 * intrebam un calificativ 
	 * in fct de calificativ printam :
	 * A -> Felicitari
	 * B-> Destul de bine
	 * C -> Suficient
	 * D-> Insuficient
	 * Daca nu introducem niciun din cele de mai sus printam : Calificativ invalid
	 
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti un calificativ: ");
		
		String calificativ = scan.next();
		
		
		switch(calificativ.toUpperCase() ) {
		case "A" :
			System.out.println("Felicitari!");
			break;// asa funct switch si tre sa ii punem la fiecare conditie un break
		case "B" :
			System.out.println("Destul de bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" : 
			System.out.println("Insuficient!");
			break;
			default: //echivalent lui else; nu e nevoie de break pe default nu e nevoie, ca e oricum else si se termina run ul 
				System.out.println("Calificativ Invalid!");
		
		}
		scan.close();

       /* int result =0;
		if(result == 2 || result == 6 || result == 12) {
			System.out.println("Ai dat " + result + "Imi pare rau ! Ai pierdut jocul");
			
			switch(result) {
			case 2, 6: improve version
				System.out.println("Ai dat " + result + "Imi pare rau ! Ai pierdut jocul");
				break;
			case 6: 
				System.out.println("Ai dat " + result + "Felicitari! Ai castigat jocul");
				
				*/
			}
	

	
}
