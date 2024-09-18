package section_7_oop2_polymorphism;

public class DishWasher {

	private boolean hasWorkToDo;

	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}

	public void doDishes() {

		if (hasWorkToDo) {
			System.out.println("Washing Dishes");
			hasWorkToDo = false;
		}
	}
}
