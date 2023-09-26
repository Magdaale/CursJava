package curs3;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert a name");
		String user = scan.next();
		System.out.println("Insert a password");
		int pass = scan.nextInt();
		
		// --> && AND $
		// --> || OR |
		
		
		if(username.equals(user) && (password == pass)) {
			System.out.println("Login");
				
		}else {
			System.out.println("Login error");
			
		}

	}

}
