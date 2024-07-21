package Java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

		    public static void main(String[] args) {
		    	
		        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
		        
		        LocalDate currentDate = LocalDate.now();
		        
		        System.out.println(dtf.format(currentDate)); 
		    }
		

}
