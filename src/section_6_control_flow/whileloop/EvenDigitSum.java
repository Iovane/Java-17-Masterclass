package section_6_control_flow.whileloop;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		if (number < 0) return -1;

		int sum = 0;

		while (number > 0) {
			int remainder = number % 10;
			if (remainder % 2 == 0) sum += remainder;
			number /= 10;
		}
		return sum;
	}
}
