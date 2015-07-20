import java.util.*;
import java.math.*;

public class LotteryDrawing{
	public static void main(String [ ] args){
		Scanner in = new Scanner(System.in);

		System.out.println("How many numbers do you want to draw?");
		int k = in.nextInt();

		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();

		// number array initialize.
		int [ ] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;

		int [ ] result = new int[k];
		for (int i = 0; i < result.length; i++){
			// make a random index between 0 and n-1
			int r = (int)(Math.random()*n);
			// pick the element at the randowm lacation
			result[i] = numbers[r];
			// move the last elment into the random location
			numbers[r] = numbers[n-1];
			n--;
		}
		Arrays.sort(result);
		System.out.println("Bet the following conbination. It'll make you rich.");
		for (int r : result)
			System.out.println(r);

	}
	
}