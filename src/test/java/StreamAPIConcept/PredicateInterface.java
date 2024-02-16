package StreamAPIConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {

	public static void main(String[] args) {


		Predicate<Integer> predicate = x -> x >  8 ;
		
		System.out.println(predicate.test(10));	
		
		List<Integer> list = Arrays.asList(1, 2, 5, 6, 7, 8, 12, 14, 17);
		
		List<Integer> colList = list.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(colList);	

//		Predicate with &&
		List<Integer> colList1 = list.stream().filter(x -> x> 5 &&  x < 14).collect(Collectors.toList());

		System.out.println(colList1);	

//		Predicate with negate()
		
		List<String> tech = Arrays.asList("Java", "Selenium","JavaScript","NodeJS","AdvancedJava");
		
		Predicate<String> exp = x -> x.startsWith("Java");
		
		List<String> updatedList = tech.stream().filter(exp.negate()).collect(Collectors.toList());
		
		System.out.println(updatedList);	


	
	}

}
