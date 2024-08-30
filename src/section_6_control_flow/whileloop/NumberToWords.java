package section_6_control_flow.whileloop;

public class NumberToWords {

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}

		int reversedNumber = reverse(number);
		int numOfDigits = getDigitCount(number);

		while (numOfDigits > 0) {
			switch (reversedNumber % 10) {
				case 0 -> System.out.println("Zero");
				case 1 -> System.out.println("One");
				case 2 -> System.out.println("Two");
				case 3 -> System.out.println("Three");
				case 4 -> System.out.println("Four");
				case 5 -> System.out.println("Five");
				case 6 -> System.out.println("Six");
				case 7 -> System.out.println("Seven");
				case 8 -> System.out.println("Eight");
				case 9 -> System.out.println("Nine");
			}
			reversedNumber /= 10;
			numOfDigits--;
		}
	}

	public static int reverse(int number) {
		int reverse = 0;

		while (number > 9 || number < -9) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		reverse = reverse * 10 + number;

		return reverse;
	}

	public static int getDigitCount(int number) {
		if (number < 0) return -1;
		if (number == 0) return 1;

		int digitCount = 0;

		while (number != 0) {
			number /= 10;
			digitCount++;
		}
		return digitCount;
	}
}
