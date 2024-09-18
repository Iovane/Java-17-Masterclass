package section_7_oop1_inheritance;

public class Carpet {

	private double cost;

	public Carpet(double cost) {
		this.cost = cost < 0 ? 0 : cost;
	}

	public double getCost() {
		return cost;
	}

}
