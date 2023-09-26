package curs5;

import java.util.Scanner;

public class PasswordValidator {
	
	// Scriem un program care valideaza o parola pe baza urmatoarelor reguli
	// 1. parola tre sa aiba min 10 caractere
	// 2. parola tre sa contina cel putin un cracter upper case
	// 3. parola nu tre sa fie la fel ca numele utilizatorului
	
	//Intrebam un user si o parola si parola o validam dupa regulile de mai sus
	// daca nu sunt respectate printam doar regulile care nu sunt respectate
	//Printam la inceput reg parolei si la final cand parola este validata printam parola valida
	
	// intrebam de user
	// intrebam de parola
	// validare regui parola
	// printam regului parola
	// printam parola valida
	
	
	String username, password;
	Scanner scan = new Scanner(System.in); 
	 boolean validare;
	
	public void printPasswordRules() {
		 System.out.println("Reguli parola: ");
		 System.out.println("parola tre sa aiba min 10 caractere");
		 System.out.println("parola nu tre sa fie la fel ca numele utilizatorului");
		 System.out.println("parola tre sa contina cel putin un cracter upper case");
	}
	
     public void getusername() {
    	 System.out.println("Introdu username");
    	 username = scan.next();
     }
     
     public void getpassword() {
    	 System.out.println("Introdu password");
    	 username = scan.next();
     }
     
     
     public void validatePasswordRules() {
    	
    	 
    	 if(password.length() <10) {
    		 System.out.println("parola tre sa aiba min 10 caractere");
    		 validare = false;
    	 }
    	 
    	 if(password.equals(username)) {
    		 System.out.println("parola nu tre sa fie la fel ca numele utilizatorului"); 
    		 validare = false;
    	 }
    	 
    	 if(password.equals(password.toLowerCase())) {
    		 System.out.println("parola tre sa contina cel putin un cracter upper case"); 
    		 validare = false;
    	 }
    	 //return validare;
     }
     
     
	public void validatePassword() {
		
		do {
			getpassword();
			validatePasswordRules();
		}while(!validare);
		
		}
	}


