package StreamAPIConcept;

public class ICICI {

	public static void main(String[] args) {

		RBI r = new RBI() { // Anonymous Inner Type

			@Override
			public void payment(String type) {
				System.out.println("payment type: " + type);
			}

		};

//		Below initilization can be modified with the help of lambda[->] as below
		RBI r2 = (type) -> System.out.println("payment type: " + type);
		// The error is popped up if second abstract method2 is added in interface,
		// whenever lambda is in use, the interface should be functional interface even
		// if its not explicitly declared-> The target type of
		// this expression must be a functional interface
		RBI r3 = (t) -> System.out.println("payment type: " + t.length());

		r.payment("NEFT");
		r.payment("UPI");
		r2.payment("RTGS");
		r3.payment("SWIFT");
	}

}
