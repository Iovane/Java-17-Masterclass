package section_6_control_flow.whileloop;

public class EvenNumberChallenge {

	public static void main(String[] args) {
		int num = 5;

		while (num <= 20) {

			if(isEven(num)) System.out.println(num);
			num++;
		}
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

}
