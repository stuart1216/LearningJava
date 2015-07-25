package inheritance;

public class Manager extends Employee{
	// instance fields 
	private double bonus;

	// constructors
	public Manager(String n, double s, int year, int month, int day){
		super(n, s, year, month, day);
		bonus = 0;
	}

	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b){
		this.bonus = b;
	}


}