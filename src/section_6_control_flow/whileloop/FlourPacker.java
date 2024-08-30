package section_6_control_flow.whileloop;

public class FlourPacker {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

		int bigVolume = 5;


		while (bigCount > 0) {
			if (bigVolume * bigCount > goal) {
				bigCount--;
				continue;
			}

			bigCount--;
			goal -= bigVolume;

			if (goal == 0) return true;
		}

		while (smallCount > 0) {
			goal --;
			smallCount--;
			if (goal == 0) return true;
		}

		return false;
	}
}
