package arrayList;

import java.util.*;
public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<Employee> staff = new ArrayList<>(100);
		staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 17));
		staff.add(new Employee("Harry Hcaker", 50000, 1978, 12, 10));
		staff.add(new Employee("Tony Tester", 98765, 1979, 12,20));
		
		for (Employee e: staff)
			e.raiseSalary(5);
		
		for (Employee e: staff)
			System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary()
					+ "hireday: " + e.getHireDay());		
		
		
		// staff.set
		Employee james = new Employee("James Bond", 80000, 1989, 12, 28);
		staff.set(2, james);
		
		Employee tommy = new Employee("Tommy Hifile", 90000, 1999, 11, 29);
		
		staff.add(2, tommy);
		
		for (Employee e: staff)
			System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary()
					+ "hireday: " + e.getHireDay());	
		
		// int size()
		System.out.println("The size of the staff[] is " + staff.size());
		
		Integer a = 1000;
		Integer b = 1000;
		if (a == b) System.out.println("Integer a = 1000, b = 1000, a = b");
		else System.out.println("Interger a = 1000, b = 1000, a != b");
		
		if (a.equals(b)) System.out.println("Integer a = 1000, b = 1000, a.equals(b)");
		else System.out.println("Interger a = 1000, b = 1000, a.equals(b) not");
		
		
		Integer c = 100;
		Integer d = 100;
		if (c == d) System.out.println("Integer c = 100, d = 100, c = d");
		else System.out.println("Interger c = 100, d = 100, c != d");
		
		if (c.equals(d)) System.out.println("Integer c = 100, d = 100, c.equals(d)");
		else System.out.println("Interger c = 100, d = 100, c.equals(d) not");
	}
}



class Employee {
	//instance fields
	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}

	// method
	public String getName() {
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public Date getHireDay() { 
		return hireDay;
	}

	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
} 
