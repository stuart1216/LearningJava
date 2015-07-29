package abstractClasses;


public class PersonTest{
	public static void main(String [] args){
		Person [] p = new Person[2];

		p[0] = new Employee("Adam", 50000, 2000, 10, 10);
		p[1] = new Student("Stuart", "CS");

		for(Person e: people) {
			System.out.println(e.getName + getDescription());
		}
	}
}