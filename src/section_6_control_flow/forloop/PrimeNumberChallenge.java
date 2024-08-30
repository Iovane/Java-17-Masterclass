package section_6_control_flow.forloop;

public class PrimeNumberChallenge {
	public static void main(String[] args) {

		/*System.out.println("0 is" + (isPrime(0) ? "" : " not") + " prime");
		System.out.println("1 is" + (isPrime(1) ? "" : " not") + " prime");
		System.out.println("2 is" + (isPrime(2) ? "" : " not") + " prime");
		System.out.println("3 is" + (isPrime(3) ? "" : " not") + " prime");
		System.out.println("4 is" + (isPrime(4) ? "" : " not") + " prime");
		System.out.println("5 is" + (isPrime(5) ? "" : " not") + " prime");
		System.out.println("8 is" + (isPrime(8) ? "" : " not") + " prime");
		System.out.println("17 is" + (isPrime(17) ? "" : " not") + " prime");*/

		int primeCount = 0;

		for (int i = 22; primeCount < 3 && i <= 100; i++) {

			if (isPrime(i)) {
				System.out.println(i + " is prime");
				primeCount++;
			}
		}

		/*for (int i = 100; i >= Integer.MIN_VALUE; i += 1000000) {
			if (i < 0) {
				System.out.println("last iteration because of overflow in int i = " + i);
				break;
			}
		}*/


	}


	public static boolean isPrime(int n) {

		if (n <= 2) return n == 2;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) return false;
		}

		return true;
	}

}
