package section_6_control_flow.forloop;

public class SumOddRange {


	public static boolean isOdd(int number) {

		if (number < 0) return false;

		return number % 2 == 1;
	}

	public static int sumOdd(int start, int end) {

		if (start > end || start < 0) return -1;

		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				sum += i;
			}
		}
		return sum;
	}
}
