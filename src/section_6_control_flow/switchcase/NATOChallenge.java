package section_6_control_flow.switchcase;

public class NATOChallenge {

	public static String interpret(char character) {
		switch (character) {
			case 'A': case 'a':
				return "Able";
			case 'B': case 'b':
				return "Baker";
			case 'C': case 'c':
				return "Charlie";
			case 'D': case 'd':
				return "Dog";
			case 'E': case 'e':
				return "Easy";
			default: return "Unknown";
		}
	}
}
