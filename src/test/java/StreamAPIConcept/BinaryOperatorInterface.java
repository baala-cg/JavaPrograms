package StreamAPIConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {

	public static void main(String[] args) {
		
		/*
		 * Interface BinaryOperator<T> 
		 * Type Parameters: T - the type of the operands and
		 * result of the operator 
		 * 	All Superinterfaces: 
		 * BiFunction<T,T,T> 
		 * 
		 * Functional Interface: This is a functional interface and can therefore be used as the
		 * assignment target for a lambda expression or method reference.
		 * 
		 * 
		 * @FunctionalInterface 
		 * public interface BinaryOperator<T> extends
		 * BiFunction<T,T,T> 
		 * 
		 * Represents an operation upon two operands of the same type,
		 * producing a result of the same type as the operands. This is a specialization
		 * of BiFunction for the case where the operands and the result are all of the
		 * same type.
		 * 
		 * This is a functional interface whose functional method is
		 * BiFunction.apply(Object, Object).
		 */
		
		
		BinaryOperator<Integer> binary = (x1, x2) -> x1 + x2;
		
		int t = binary.apply(10, 20);
		System.out.println(t);
		
		BiFunction<Integer, Integer, Integer> bifunction = (x1, x2) -> x1 + x2;
		
		int result = bifunction.apply(30, 20);
		System.out.println(result);
		
		
	}

}
