/**
This program demonstrates a <code> while </code> loop.
@Adam Su
2015-07-16
*/
import java.util.*;
public class Retirement{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you need to retire? ");
		double goal = in.nextDouble();
		System.out.println("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();

		double balance = 0;
		int year = 0;
		while(balance < goal){
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			year ++;
		}
		System.out.println("You can reitre in " + year + " year.");
		System.out.printf("And you will have %,.2f dollors.", balance);
	}
}