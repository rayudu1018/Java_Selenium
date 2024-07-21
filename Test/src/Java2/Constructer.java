package Java2;

public class Constructer {
	
	    private String model;
	    private int year;

	    // No constructor defined
	    
	    public Constructer() {
	       // this.model = name;
	       // this.year = age;
	    	
	    	model="value";
	    	year =10;
	    }

	    // Setter methods
	    public void setModel(String model) {
	        this.model = model;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    // Getter methods
	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Creating a Car object without a constructor
	    	Constructer car = new Constructer();
	    	
	    	System.out.println("Model: " + car.getModel());

	        // Setting values using setter methods
	        car.setModel("Toyota");
	        car.setYear(2020);

	        // Using getter methods to access object's state
	        System.out.println("Model: " + car.getModel());
	        System.out.println("Year: " + car.getYear());
	    }
	}



