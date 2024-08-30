package section_6_control_flow.switchcase;

public class Switch {
	public static void main(String[] args) {

		int switchValue = 4;

		/*switch (switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3: case 4: case 5: case 6: case 7: case 8: case 9:
 				System.out.println("Was somewhere 3-9");
 				System.out.println("was " + switchValue);
				break;
			default:
				System.out.println("Value was not any of numbers");
		}*/

	  /*switch (switchValue) {
			case 1 -> System.out.println("Value was 1");
			case 2 -> System.out.println("Value was 2");
			case 3, 4, 5, 6, 7, 8, 9 -> {
				System.out.println("Was somewhere 3-9");
				System.out.println("was " + switchValue);
			}
			default -> System.out.println("Value was not any of numbers");
		}

		String month = "April";

		System.out.println(getQuarter(month));*/

//		System.out.println(getQuarter("December"));

/*		System.out.println(NATOChallenge.interpret('A'));
		System.out.println(NATOChallenge.interpret('b'));
		System.out.println(NATOChallenge.interpret('c'));
		System.out.println(NATOChallenge.interpret('d'));
		System.out.println(NATOChallenge.interpret('e'));
		System.out.println(NATOChallenge.interpret('f'));*/

/*		System.out.println(DayOfWeekChallenge.dayOfWeek(1));
		System.out.println(DayOfWeekChallenge.dayOfWeek(2));
		System.out.println(DayOfWeekChallenge.dayOfWeek(3));
		System.out.println(DayOfWeekChallenge.dayOfWeek(4));
		System.out.println(DayOfWeekChallenge.dayOfWeek(5));
		System.out.println(DayOfWeekChallenge.dayOfWeek(6));
		System.out.println(DayOfWeekChallenge.dayOfWeek(7));
		System.out.println(DayOfWeekChallenge.dayOfWeek(8));*/


	}

	public static String getQuarter(String month) {
/*		switch (month) {
			case "January":
			case "February":
			case "March":
				return "1st";
			case "April":
			case "May":
			case "June":
				return "2nd";
			case "July":
			case "August":
			case "September":
				return "3rd";
			case "October":
			case "November":
			case "December":
				return "4th";
		}

		return "bad value";*/

		return switch (month) {
			case "January", "February", "March" -> { yield "1st"; }
			case "April", "May", "June" -> "2nd";
			case "July", "August", "September" -> "3rd";
			case "October", "November", "December" -> "4th";
			default -> "bad value";
		};
	}
}


