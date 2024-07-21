package Maps;
import java.util.Optional;

public class OptionalExcercise {
	
	public static void main(String[] args) {
		
		Integer width = null;
		Integer height = 4;
		
		Optional rwidth = Optional.of(width);
		
		Optional rHeight = Optional.ofNullable(height);
		System.out.println("width is" + rwidth.isPresent());
		System.out.println("height is" + rHeight.isPresent());
		
	}

}

