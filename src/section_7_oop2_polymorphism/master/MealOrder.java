package section_7_oop2_polymorphism.master;

public class MealOrder {

	private Burger burger;
	private Item drink;
	private Item sideItem;

	public MealOrder() {
		this("regular", "coke", "fries");
	}

	public MealOrder(String burgerType, String drinkType, String sideItemType) {

		this.burger = new Burger(burgerType, 3.99);
		this.drink = new Item("drink", drinkType, 1.49);
		this.sideItem = new Item("side",sideItemType, 2.99);

	}


	public double getTotalPrice() {
		return sideItem.getAdjustedPrice() + drink.getAdjustedPrice() +
				burger.getAdjustedPrice();
	}

	public void printItemizedList() {

		burger.printItem();
		drink.printItem();
		sideItem.printItem();
		System.out.println("-".repeat(30));
		Item.printItem("TOTAL PRICE: ", getTotalPrice());

	}

	public void addBurgerToppings(String extra1, String extra2, String extra3) {
		this.burger.addToppings(extra1, extra2, extra3);
	}

	public void setDrinkSize(String drinkSize) {
		this.drink.setSize(drinkSize);
	}


}
