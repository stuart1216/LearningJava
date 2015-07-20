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