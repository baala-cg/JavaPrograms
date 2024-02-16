package StreamAPIConcept;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

		/*
		 * Interface Function<T,R> Type Parameters: 
		 * T - the type of the input to the function 
		 * R - the type of the result of the function
		 * 
		 * Functional Interface: This is a functional interface and can therefore be
		 * used as the assignment target for a lambda expression or method reference.
		 * 
		 * @FunctionalInterface 
		 * public interface Function<T,R> 
		 * 
		 * Represents a function
		 * that accepts one argument and produces a result.
		 * 
		 * This is a functional interface whose functional method is apply(Object).
		 */
		
		Function<String, Integer> function = x -> x.length();
		
		int len = function.apply("This is functional interface example");
		System.out.println(len);
		
//		Chaining function
		Function<Integer, Integer> function2 = x -> x + 2;
		int len2 = function.andThen(function2).apply("This is stream api concept");
		System.out.println(len2 );


		
		
		
		
	}

}
