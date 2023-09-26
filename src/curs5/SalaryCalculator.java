package curs5;

import java.util.Scanner;

public class SalaryCalculator {

	//Facem un program care calculeaza salariul pe o saptamana
	//Intrebam utilizatorul cate ore a lucrat
	//Nu permitem overtime - max ore = 40 
	//Nu permitem nici ore negative sau 0 - min ore = 1 
	//Daca introduce nr invalid de ore, printam si il rugam sa introuca din nou 
	//facem asta pana introduce ore valide
	// dc nr valid -> nr ore 25
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Cate ore ai lucrat?");
		
		
		/*int nrore = scan.nextInt();
		while(nrore<1 || nrore>40) {
			System.out.println("Numarul de ore este invalid. Te rog introdu un numar de ore intre 1 si 40");
			nrore = scan.nextInt();
		}
		System.out.println(nrore*25);
		}	*/	

	int nrore;
	for(nrore = scan.nextInt(); nrore<1 || nrore>40;nrore = scan.nextInt()) {
		System.out.println("Numarul de ore este invalid. Te rog introdu un numar de ore intre 1 si 40");
		nrore = scan.nextInt();
	}
	   System.out.println(nrore*25);
	}
		
	
}

