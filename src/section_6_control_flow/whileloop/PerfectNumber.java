package section_6_control_flow.whileloop;

public class PerfectNumber {

	public static boolean isPerfectNumber(int number) {
		if (number < 1) return false;

		int sumOfDivs = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) sumOfDivs += i;
		}

		return sumOfDivs == number;
	}
}
