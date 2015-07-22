/** 
This program demonstrates parameter passing in Java.
Modified based on Program4-4 in CoreJava Phase I.
@ Hongquan Su(Adam Su)
@ version: 1.00
@ Date: 2015-07-22
*/
public class ParamTest{
	public static void main(String [] args){

		/*
		Test 1: Methods can't modify numeric parameters
		*/
		System.out.println("\nTesting tripleValue:");
		double percent = 10;
		System.out.println("Before: precent = " + percent);
		tripleValue(percent);
		System.out.println("After: precent = " + percent);

		/*
		Test 2: Methods can change the state of object parameters
		*/
		System.out.println("\nTesting tripleSalary: ");
		Employee harry = new Employee("Harry", 500000);
		System.out.println("Before: salary = " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary = " + harry.getSalary());

		/*
		Test 3: Methods can't attach new objects to object parameters
		*/
		System.out.println("\nTesting swaping: ");
		Employee a = new Employee("Alice", 30000);
		Employee b = new Employee("Booom", 50000);
		System.out.println("Before a = " + a.getName());
		System.out.println("Before b = " + b.getName());
		swap(a,b);
		System.out.println("After a = " + a.getName());
		System.out.println("After b = " + b.getName());



	}

	public static void tripleValue(double x){
		x = 3 * x;
		System.out.println("End of Method: x = " + x);
	}

	public static void tripleSalary(Employee x){
		x.raiseSalary(200);
		System.out.println("End of Meth/od: Salary = " + x.getSalary());
	}

	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y; 
		y = temp;
		System.out.println("End of method: x = " + x.getName());
		System.out.println("End of method: y = " + y.getName());
	}

}
class Employee{
	private String name;
	private double salary;

	public Employee(String n, double s){
		this.name = n;
		this.salary = s;
	}

	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public void raiseSalary(double byPercent){
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}
}


