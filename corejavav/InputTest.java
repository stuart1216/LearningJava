/**
This program demonstrates console input.
Page 55
@ Adam Su
2015-7-16
*/
import java.io.Console;
import java.util.*;
public class InputTest{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// get the string input
		System.out.println("What is your name? ");
		String name = in.nextLine();

		// get the number input
		System.out.println("How old are you? ");
		int age = in.nextInt();

		// output on screen
		System.out.println("Hello, " + name 
			+". Next year, you'll be " + (age+1) + ".")；
	}
}