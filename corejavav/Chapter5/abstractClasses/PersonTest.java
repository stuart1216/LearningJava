package abstractClasses;

public class PersonTest {
	public static void main(String [] args){
		Person[] people = new Person[2];
		
		people[0] = new Employee("Adam", 50000, 1980, 11, 11);
		people[1] = new Student("Stuart", "Computer Science");
		
		for(Person p: people) {
			System.out.println(p.getName() + ", " + p.getDescription());
		}
	}
}