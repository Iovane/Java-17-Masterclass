package section_6_control_flow.whileloop;

public class WhileLoop {
	public static void main(String[] args) {

		System.out.println(NumberPalindrome.isPalindrome(-1221));
		System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(20000005));
		System.out.println(EvenDigitSum.getEvenDigitSum(252));
		System.out.println(SharedDigit.hasSharedDigit(12,13));
		System.out.println(LastDigitChecker.hasSameLastDigit(1, 2, 3));
		System.out.println(LastDigitChecker.isValid(1));
		FactorPrinter.printFactors(10);
		System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,18));
		System.out.println(PerfectNumber.isPerfectNumber(6));
		NumberToWords.numberToWords(0);
		System.out.println(NumberToWords.getDigitCount(0));
		System.out.println(FlourPacker.canPack(4,18,19));
		System.out.println(LargestPrime.getLargestPrime(45));
	}
}
