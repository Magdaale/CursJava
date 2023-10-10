package curs10;

import java.util.Scanner;

/* 
 * simulam un ATM cu deposit, withdraw, check balance 
 * intrebam user ce operatiune vrea si la final dc vrea sa continue
 * luam in considerare ca pe viitor putem avea si alte tipuri de conturi asociate acestui program
 * Implementarea se va face cu un cont curent 
 * avem exceptii pt fonduri insuficiente si pt sume invalide
 * 
 * 
 * o clasa parinte pentru conturi 
 * clasa copil - cont curent 
 * clasa copil - 
 * 2 clase exceptii
 * 
 * clasa parinte template cumetode abstracte si in clasa copil implementam metodele
 * 
 * 
 * */

public class BankApp {
	
	public boolean flag = false;

	public static void main(String[] args) {
		
		CurrentAccount account = new CurrentAccount(1000);
		BankApp app = new BankApp();
		
		do {
				try {
					app.bankApp(account);
					//app.flag =false;
					
				} catch (InvalidAmountException e) {
				
					e.printStackTrace();
				} catch (InsuficientFundsException e) {
				
					e.printStackTrace();
				}
			
			
		}while(app.flag= true);
			

	}

	
	public void bankApp(CurrentAccount account) throws InvalidAmountException, InsuficientFundsException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, Available operations are : ");
		System.out.println("1 Deposit ");
		System.out.println("2 Withdraw ");
		System.out.println("3 Check Balance ");
		
		String option = scan.next();
		
		switch(option) {
			case "1": 
				System.out.println("Please enter the amount to deposit !");
				double amount = scan.nextDouble();
				account.deposit(amount);
				account.checkBalance();
				break;
			case "2": 	
				System.out.println("Please enter the amount of withdraw !");
				amount = scan.nextDouble();
				account.withdraw(amount);
				account.checkBalance();
				break;
			case "3": 	
				account.checkBalance();
				break;
			default:
				System.out.println("Invalid option");
			
		}
		
		System.out.println("Do you want to continue");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("Yes")) {
			flag = true;
		}else if(answer.equalsIgnoreCase("No")) {
			flag = false;
		}
		
	}
}
