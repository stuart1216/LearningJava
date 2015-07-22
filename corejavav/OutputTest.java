public class OutputTest{
	public static void main(String [] args){
		String name = "Stuart";
		int age = 32;
		String message = String.format("%s, will be %d in next year.", "name", age);
		System.out.println(message);
		//System.out.printf("%tc",new Date());
	}
}