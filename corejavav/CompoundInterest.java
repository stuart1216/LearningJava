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