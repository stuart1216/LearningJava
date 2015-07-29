package abstractClasses;

public class Student extends Person{
	private String major;

	public class Student(String n, String m){
		super(n);
		major = m;
	}

	public String getDescription(){
		return "A student with the major of " + major;
	}
}