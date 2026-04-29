package com.StreamAPIPrograms;

public class Name {

	public static void main(String[] args) {

//		Lambda Implementation 1               - Same as Implementation 2
		Sample amp2 = (name) -> System.out.println(name);
		amp2.printName("Bala Krishna");

//		Implementation 2
		Sample sample = new Sample() { // anonymous inner classes
			@Override
			public void printName(String name) {
				System.out.println(name);
			}
		};

//		Implementation 3:
		SampleReturn amp1 = (name) -> name.toUpperCase();
		System.out.println(amp1.printNameInUpper("Balu"));

//		Implementation 4:
		SampleReturn sample2 = new SampleReturn() {

			@Override
			public String printNameInUpper(String name) {
				return name.toUpperCase();
			}
		};

	}

}
