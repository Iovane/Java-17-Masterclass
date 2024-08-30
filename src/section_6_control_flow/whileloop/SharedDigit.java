package section_6_control_flow.whileloop;

public class SharedDigit {
	public static boolean hasSharedDigit(int num1, int num2) {
		if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) return false;

		int firstRightDigit  = num1 % 10;
		int secondRightDigit  = num2 % 10;
		int firstLeftDigit = num1 / 10;
		int secondLeftDigit = num2 / 10;

		return firstRightDigit == secondRightDigit || firstRightDigit == secondLeftDigit
				|| secondRightDigit == firstLeftDigit || firstLeftDigit == secondLeftDigit ;
	}
}
