package StreamAPIConcept;

@FunctionalInterface
public interface RBI {

//	SAM - Single Abstract Method
	void payment(String type);
//	void method2(); 

	public static void test() {

	}

	default void display() {

	}
	/*
	 * FunctionalInterface introduced in JDK 1.8 having only 1 abstract method, can
	 * have one static and one default method
	 * 
	 * filter -> Predicate functional interface 
	 * sort - > comparator functional
	 * interface map -> function functional interface
	 * 
	 * Interface							Method Signature					Examples
	 * UnaryOperator<T>			T apply(T t)                               String::toLowerCase, Math::tan
	 * BinaryOperator<T>			T apply(T t1, T t2)						BigInteger::add, Math::pow
	 * Function<T, R> 					R apply(T t)								Arrays::asList, Integer::toBinaryString
	 * Predicate<T, U>				boolean test(T t, U u)				String::isEmpty, Character::IsDigit
	 * Supplier<T>						T get()										LocalDate::now, Instant::now
	 * Consumer<T>					void accept(T t)						System.out::println, Error:printStackTrace
	 */
	
	
}
