## Chapter 3
###Constants.jva
for the usage of keyword "final"
```java
/**
An example of constants defined by keyword final.
Page 38
@ Adam Su
2015-7-15
*/
public class Constants{
	public static void main(String[] args){
		final double CM_PER_INCH = 2.54; 
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper sizi in centimeters: "
			+ paperWidth * CM_PER_INCH + " by " 
			+ paperHeight * CM_PER_INCH);

	}
}
```
###Constants1.java
for the usage of keyword "static final"
```java
/**
An example of constants defined by globle definition.
Keyword: static final
Page 38
@ Adam Su
2015-7-15
*/
public class Constants1{
	public static final double CM_PER_INCH = 2.54;
	public static void main(String[] args){
		//final double CM_PER_INCH = 2.54; 
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper sizi in centimeters: "
			+ paperWidth * CM_PER_INCH + " by " 
			+ paperHeight * CM_PER_INCH);

	}
}
```
###Codelength.java
- for the culcualtion of the code length.
- .length and .codePointAt
```java
/**
An example of Code point and Code unit.
Page 49
@ Adam Su
2015-7-15
*/
public class CodeLength{
	public static void main(String [] args){
		String greeting = "Hello World!";
		int n = greeting.length();
		int cpCount = greeting.codePointCount(0, greeting.length());
		System.out.println("The length of greeting is " + n);
		System.out.println("The code point of greeting is " + cpCount);
	}
}
```

###InputTest.java
- define the Scanner in System.in
- methods in java.util.Scanner
```java
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
```

###InputPassword.java
for the usage of Console
```java
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
```

###Outputtest.java
for the println and printf
```java
public class OutputTest{
	public static void main(String [] args){
		String name = "Stuart";
		int age = 32;
		String message = String.format("%s, will be %d in next year.", "name", age);
		System.out.println(message);
		//System.out.printf("%tc",new Date());
	}
}
```

###Retirement.java
```
while
```
```java
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
```

###Retirement2.java
``` 
do - while
```
```java
/**
This program demonstrates a do-while loop.
@Adam Su
2015-07-16
*/
import java.util.*;
public class Retirement2{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);

		System.out.println("How much money will you contribute every year? ");
		double payment = in.nextDouble();

		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();

		double balance = 0;
		int year = 0;

		String input;

		do{
			balance += payment;
			double interest = balance * interestRate /100;
			balance += interest;
			year++;

			System.out.printf("After %d years, your balance is %,.2f %n", year, balance);

			System.out.println("Ready to retire: (Y/N)");
			input = in.next();	
		}
		while (input.equalsIgnoreCase("N"));	
	}
}
```

### LotteryOdds.java
```
for
```
```java
/**
This program demonstrates a for loop.
@Adam Su
2015-07-17
*/
import java.util.*;
public class LotteryOdds{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();

		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();

		int lotteryOdds = 1;
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds * (n - i + 1)/i;
		}

		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}
```

###BigIntegerTest.java
for the usage of Bigdata
```java
/**
This program demonstrates bigdata.
@Adam Su
2015-07-17
*/
import java.util.*;
import java.math.*;
public class BigIntegerTest{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();

		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();

		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(
				BigInteger.valueOf(i)));
		}

		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}
```

###ForEachLoop.java
for the usage of for-each
```java
public class ForEachLoop{
	public static void main(String args[]){
		int [] a = new int[10];
		for(int elment: a){
			System.out.println(elment);
		}
	}
}
```


###BigIntegerTest.java
```java
/**
This program demonstrates bigdata.
@Adam Su
2015-07-17
*/
import java.util.*;
import java.math.*;
public class BigIntegerTest{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();

		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();

		BigInteger lotteryOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++) {
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(
				BigInteger.valueOf(i)));
		}

		System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
	}
}
```

###LotteryDrawing.java
for the usage of array and random function.
```java
/**
This program shows how to store tabular data in a 2D array.
*/

public class CompoundInterest{
	public static void main(String [ ] args){
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		double [ ] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j)/100;
		double [ ] [ ] blances = new double[NYEARS][NRATES];

		for(int j = 0; j < blances[0].length; j++)
			blances[0][j] = 10000;

		for(int i = 1; i < blances.length; i++){
			for (int j = 0; j < blances[0].length; j++)
				blances[i][j] = blances[i-1][j] * (1 + interestRate[j]);
		}

		for(int j = 0; j < interestRate.length; j++)
			System.out.printf("%9.0f%%", interestRate[j]*100);

		System.out.println();

		for(double [] row: blances){
			for(double b: row)
				System.out.printf("%10.2f",b);
			System.out.println();
		}

	}
}
```

## Chapter 4.2
###CalendarTest.java
```java
import java.text.DateFormatSymbols;
import java.util.*;


public class CalendarTest{
	public static void main(String[] args) {
		
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);


		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);

		int firstDayOfWeek = d.getFirstDayOfWeek();

		int indent = 0;

		while(weekday != firstDayOfWeek) {
			indent ++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar. DAY_OF_WEEK);
		}

		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do {
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);

		}
		while (weekday != firstDayOfWeek);

		System.out.println();

		for (int i = 1; i <= indent; i++)
			System.out.print("       ");

		
		d.set(Calendar.DAY_OF_MONTH, 1);
		do {
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);

			if(day == today) 
				System.out.print("*   ");
			else
				System.out.print("    ");
 
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);

			if(weekday == firstDayOfWeek) 
				System.out.println();
		}
		while(d.get(Calendar.MONTH) == month);

		if(weekday != firstDayOfWeek)
			System.out.println();
	}
}
```


