package section_6_control_flow.whileloop;

public class LargestPrime {

	public static int getLargestPrime (int number) {
		if (number < 2) return -1;

		for (int i = number; i > 2; i--) {
			if (number % i == 0){
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) continue;
				}
				return i;
			}
		}

		return -1;
	}
}
