package section_6_control_flow.whileloop;

public class GreatestCommonDivisor {

	public static int getGreatestCommonDivisor(int a, int b) {
		if (a < 10 || b < 10) return -1;

		int gcd = 1;

		for (int i = a < b ? a : b; i >= 1; i--){
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}
}
