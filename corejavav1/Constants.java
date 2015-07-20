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