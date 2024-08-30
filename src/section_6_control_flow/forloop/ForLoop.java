package section_6_control_flow.forloop;

public class ForLoop {
	public static void main(String[] args) {

		double amount = 100;

		for (double i = 7.5; i <= 10; i += 0.25) {
			if (i == 8.5) continue;
			System.out.println("With Interest " + i + " on " + amount + " = " + (amount * i / 100));
		}

		System.out.println(SumOddRange.sumOdd(1, 11));
	}
}
