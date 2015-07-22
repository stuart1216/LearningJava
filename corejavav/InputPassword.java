/**
This program demonstrates password input.
Page 55
@ Adam Su
2015-7-16
*/
import java.io.Console;
import java.util.*;
public class InputPassword{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		Console cons = System.console();
		String username = cons.readLine("User name: ");
		//char [] passwd = cons.readPassword("Password: ");
		//String [] passwd = cons.readPassword("Password: "); 
		String passwd; 
		passwd = new String(cons.readPassword("Password: "));
		//System.out.println("The Password you typed in is:" + passwd);
		if(passwd.equals("sss"))
			System.out.println("Granted");
		else
			System.out.println("Access Denied");
	}
}