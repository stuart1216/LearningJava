package inheritance;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee{
	// Instance fields
	private String name; 
	private double salary;
	private Date hireDay;

	// constructors
	public Employee(String n, double s, int year, int month, int day){
		this.name = n;
		this.salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		this.hireDay = calendar.getTime();
	}

	// methods 
	public String getName(){
		return name;
	}

	public double getSalary(){
		return salary;
	}

	public Date getHireDay(){
		return hireDay;
	}

	public void raiseSalary(double byPercent){
		double raise =  salary * byPercent;
		this.salary += raise; 
	}
}