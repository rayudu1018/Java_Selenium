package Java2;

public class Getter {


	    // Private fields
	    private String name = "Rayudu";
	    private int age = 12;

	    // Constructor
	    public Getter(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    

	    // Getter for name
	    public String getName() {
	        return name;
	    }

	    // Setter for name
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter for age
	    public int getAge() {
	        return age;
	    }

	    // Setter for age
	    public void setAge(int age) {
	        if (age >= 0) { // Adding a simple validation
	            this.age = age;
	        } else {
	            System.out.println("Age cannot be negative");
	        }
	    }
	}

 



