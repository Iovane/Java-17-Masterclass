package section_6_control_flow.whileloop;

public class NumberPalindrome {

	public static boolean isPalindrome(int num) {
		int startNum = num;
		int reverse = 0;

		while (num > 9 || num < -9) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		reverse = reverse * 10 + num;

		return startNum == reverse;
	}
}
