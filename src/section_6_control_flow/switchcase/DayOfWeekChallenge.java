package section_6_control_flow.switchcase;

public class DayOfWeekChallenge {

	public static String dayOfWeek(int day) {
		return switch (day) {
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thursday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
			default -> "invalid day number";
		};
	}
}
