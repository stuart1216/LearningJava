import java.util.Arrays;

/**
 * This program is to demonstrate the usage of Arrays class.
 * @author Stuart1216
 * @version 1.0
 */

public class ArraysTest {
	
	public static void main(String[] args){
		int [] a1 = new int[] {3, 4, 5, 6};
		int [] a2 = new int[] {3, 4, 5, 6};
	
		System.out.println("a1 is equals to a2?: " + Arrays.equals(a1, a2));
		
		int [] b = Arrays.copyOf(a1, 6);
		System.out.println("the array b is " + Arrays.toString(b));
		System.out.println("b is equals to a1?: " + Arrays.equals(b, a1));
		
		Arrays.fill(b, 2, 4, 1);
		System.out.println("After filling the array b is " + Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println("After sorting the array b is " + Arrays.toString(b));
		
		int indexOfThree;
		indexOfThree = Arrays.binarySearch(b, 3);
		System.out.println("the position of 3 in the array b is " + indexOfThree);
		
	}
	
}
