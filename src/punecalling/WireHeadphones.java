package punecalling;

public class WireHeadphones extends Wirelessheadphone {
	public WireHeadphones()
	{
		super.a = 10; // calling global variable from super class
		System.out.println(super.a);

	}

	public void ap1()
	// if else statement
	{
		int marks = 12;
		if (marks >= 10) {
			System.out.println("need to practice");
		} else {
			System.out.println("impress my girl ");
		}
	}

	public static void ap2() { // nested if statement
		int c = 20;
		char d = 30;
		if (c >= 18)
			;
		{
			System.out.println("ur kautuk is more than me");
			if (d <= 20)
			{
				System.out.println("means");
			} else
			{
				System.out.println("miss college days");
			}
		}
		 {
			System.out.println("i want package");
		}
	}
}