//Checking ACcount code

import java.util.*;
import java.io.*; //using second week

public class CheckingAccount implements HasMenu, Serializable {
	double balance;

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	} // end main (tester function)
	
	public CheckingAccount(){
		this.balance = 0d; //d means this is a double
	} // end no parameter constructor
	
	public CheckingAccount(double balance) {
		this.balance = balance;
	} // end constructor with parameter
	
	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("0) Quit");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a Deposit");
		System.out.println("3) Make a Withdrawal");
		System.out.println();
		System.out.print("Enter 0-3: ");
		String response = input.nextLine();
		return response;
	} // end menu
	
	public void start(){
		boolean keepGoing = true;
		String response;
		while (keepGoing) {
			response = menu();
			if (response.equals("0")){
				keepGoing = false;
			} // end if
			else if (response.equals("1")){
				System.out.println(" Checking balance now... ");
			} // end else if 1
			else if (response.equals("2")){
				System.out.println(" Making a desposit now...");
			} // end else if 2
			else if (response.equals("3")){
				System.out.println(" Making a withdrawal now... ");
			} // end else if 3
			else {
				System.out.println( " Please enter 0, 1, 2, or 3 ");
			} // end else
		} // end while loop
	} // end start

} // end Checking Account Class definition
