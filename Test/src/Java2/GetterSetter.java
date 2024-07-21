package Java2;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        // Step 1: Create a new Person object
		Getter person = new Getter("rayudu",2);

		        // Step 2: Use getter methods to access the fields
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());

		        // Step 3: Use setter methods to modify the fields
		        person.setName("Jane"); // Modifying name using setter
		        person.setAge(30);      // Modifying age using setter

		        // Step 4: Access the modified fields using getter methods
		        System.out.println("Updated Name: " + person.getName());
		        System.out.println("Updated Age: " + person.getAge());

		        // Step 5: Try setting an invalid age
		        person.setAge(-5);      // Attempt to set an invalid age
		    }
		


	}


