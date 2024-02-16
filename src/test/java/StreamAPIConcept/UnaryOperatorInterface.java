package StreamAPIConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

	public static void main(String[] args) {

		UnaryOperator<Integer> unary = (x) -> x + 5;

		int result = unary.apply(10);
		System.out.println(result);

		Function<Integer, Integer> function = x -> x * 2;

		int len = function.apply(4);
		System.out.println(len);
		
		List<String> langlist = new ArrayList<String>();
		langlist.add("Java");
		langlist.add("JS");
		langlist.add("Python");
		
		System.out.println(langlist);
		
		langlist.replaceAll(ele -> ele + " is a programming lang");
		System.out.println(langlist);
		
		langlist.forEach(System.out::println);

	}

}
