package interfaces;


import java.util.*;

public class EmployeeTest {
	public static void main(String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry Hacker", 70000);
		staff[1] = new Employee("Carl Cracker", 50000);
		staff[2] = new Employee("Tony Tester", 70000);
		
		System.out.println("Before sorting:");
		for (Employee e: staff){
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
		}
		
		Arrays.sort(staff);
		
		System.out.println("After sorting:");
		for (Employee e: staff){
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
		}
		
	}

}
