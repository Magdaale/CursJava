package curs6;

import java.util.Scanner;

public class VerificaVocala {
	
	/* 
	 * Verifica daca o litera de la tastatura este vocala sau consoana
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti o litera: ");
		
		char litera = scan.next().toUpperCase().charAt(0);
		
		switch(litera) {
		case 'A', 'E', 'I', 'O', 'U' :
			System.out.println("Este vocala!");
			
			break;
			default: //echivalent lui else; nu e nevoie de break pe default nu e nevoie, ca e oricum else si se termina run ul 
				System.out.println("Este Consoana");
		
		}
		scan.close();

	}

}
