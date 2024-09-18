package section_7_oop2_polymorphism;

public class SmartKitchen {

	private Refrigerator iceBox;
	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;

	public SmartKitchen() {
		iceBox = new Refrigerator();
		brewMaster = new CoffeeMaker();
		dishWasher = new DishWasher();
	}

	public Refrigerator getIceBox() {
		return iceBox;
	}

	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}

	public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
	                            boolean dishwasherFlag) {

		iceBox.setHasWorkToDo(fridgeFlag);
		brewMaster.setHasWorkToDo(coffeeFlag);
		dishWasher.setHasWorkToDo(dishwasherFlag);
	}

	public void doKitchenWork() {
		iceBox.orderFood();
		brewMaster.brewCoffee();
		dishWasher.doDishes();
	}
}
