package StreamAPIConcept;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		Consumer<String> function = x -> System.out.println(x);

		System.out.println("This is functional interface - accepts one input and returns no output");
		
		
	}

}
