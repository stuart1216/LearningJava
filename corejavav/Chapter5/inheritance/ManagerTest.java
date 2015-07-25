package inheritance;

/**
This program demonstrates inheritance.
Based on Chapter 5.1 of Corejava I.
@ version 1.00
@ Hongquan Su(Adam Su)
@ date: 2015-7-23
*/

public class ManagerTest{
	public static void main(String [] args){
		// construct a Manager object
		Manager boss = new Manager("Harry Potter", 80000, 1980, 12, 20);
		boss.setBonus(5000);

		Employee [] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Noa Water", 70000, 1990, 12, 10);
		staff[2] = new Employee("Tommy Hifilter", 60000, 1991, 12, 20);

		for(Employee e: staff) {
			System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());
		}
	}
}