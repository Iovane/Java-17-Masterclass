package section_7_oop2_polymorphism.master;

public class Burger extends Item {

	private Item extra1, extra2, extra3;

	public Burger(String name, double price) {
		super("Burger", name, price);
	}


	public double getExtraPrice(String toppingName) {

		return switch (toppingName.toUpperCase()) {
			case "CHEESE", "AVOCADO", "JALAPENO" -> 0.99;
			case "BACON", "HAM", "STAKE" -> 1.49;
			default -> 0.0;
		};
	}


	public void addToppings(String extra1, String extra2, String extra3) {

		this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
		this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
		this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));

	}

	public void printItemizedList() {

		System.out.println("-".repeat(30));
		printItem("BASE BURGER", getBasePrice());
		if (extra1 != null) extra1.printItem();
		if (extra2 != null) extra2.printItem();
		if (extra3 != null) extra3.printItem();

	}

	@Override
	public String getName() {
		return super.getName() + " BURGER";
	}

	@Override
	public double getAdjustedPrice() {
		return super.getAdjustedPrice() +
				((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
				((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
				((extra3 == null) ? 0 : extra3.getAdjustedPrice());
	}

	@Override
	public void printItem() {

		printItemizedList();
		System.out.println("-".repeat(30));
		super.printItem();

	}


}
