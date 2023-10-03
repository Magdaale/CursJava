package curs6;

import java.util.Scanner;

public class DiceGame {

	
	/* 
	 * Facem un joc de zaruri care are urmatoarele reguli:
	 * simulam ca aruncam zarurile , primim un numar intre 1 si 12
	 * Daca user da in total: 2, 6, 12 -> pierde jocul
	 * Daca user da in total: 7, 11 -> castiga jocul
	 * Daca user da in total: 3, 10 -> repeta automat aruncarea
	 * Daca user da in total: oricare alta varianta decat cele de mai sus -> il intrebam daca mai vrea sa joace
	 * rasp tre sa fie un boolean true sau false
	 * Pt fiecare regula de mai sus printam corespunzator
	 * */
	
	public static void main(String[] args) {
	
		int dice1 = 0;
		int dice2 = 0;
		int result = 0;
		
		
		
		boolean raspuns = true;
		
		/* do {
			raspuns = false;
			
			dice1 = (int) (Math.random()*6+1);
			dice2 = (int) (Math.random()*6+1);
			
			result = dice1+dice2;
					
		if(result == 2 || result == 6 || result == 12) {
			System.out.println(dice1);
			System.out.println(dice2);
			
			    System.out.println("Ai dat " + result + "! " + " Imi pare rau ! Ai pierdut jocul");
			    break;
			    //raspuns= false;
			    
			}else if(result == 7 || result == 11) {
				System.out.println(dice1);
				System.out.println(dice2);
				
			    System.out.println("Ai dat " + result + "! " + " Felicitari! Ai castigat jocul");	
			    break;
			    
			}else if(result == 3 || result == 10) {
				System.out.println(dice1);
				System.out.println(dice2);
				
				System.out.println("Ai dat " + result + "! " + " Repeta automat aruncarea");
			}else {
				System.out.println(dice1);
				System.out.println(dice2);
				
				System.out.println("Ai dat " + result + " ! ");
				Scanner scan = new Scanner(System.in);
				System.out.println(" Mai vrei sa joci?");
				raspuns = scan.nextBoolean();
				
			}
		}while(result == 3 || result == 10 || raspuns == true);*/
		
		

		while(raspuns) {
		
			
			dice1 = (int) (Math.random()*6+1);
			dice2 = (int) (Math.random()*6+1);
			
			result = dice1+dice2;
					
		if(result == 2 || result == 6 || result == 12) {
			    System.out.println(dice1);
			    System.out.println(dice2);
			
			    System.out.println("Ai dat " + result + "! " + " Imi pare rau ! Ai pierdut jocul");
			    break;
			    
			}else if(result == 7 || result == 11) {
				System.out.println(dice1);
				System.out.println(dice2);
				
			    System.out.println("Ai dat " + result + "! " + " Felicitari! Ai castigat jocul");	
			    break;
			    
			}else if(result == 3 || result == 10) {
				System.out.println(dice1);
				System.out.println(dice2);
				
				System.out.println("Ai dat " + result + "! " + " Repeta automat aruncarea");
			}else {
				System.out.println(dice1);
				System.out.println(dice2);
				
				System.out.println("Ai dat " + result + " ! ");
				Scanner scan = new Scanner(System.in);
				System.out.println(" Mai vrei sa joci?");
				raspuns = scan.nextBoolean();
				
			}
		}
		

	}

}
