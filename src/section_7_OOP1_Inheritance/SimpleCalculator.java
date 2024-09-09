package section_7_OOP1_Inheritance;

public class SimpleCalculator {

	private double firstNumber, secondNumber;

	public double getAdditionResult(){
		return firstNumber + secondNumber;
	}

	public double getSubtractionResult(){
		return firstNumber - secondNumber;
	}

	public double getMultiplicationResult(){
		return firstNumber * secondNumber;
	}

	public double getDivisionResult(){
		return secondNumber == 0 ? 0 : firstNumber / secondNumber ;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getNum2() {
		return secondNumber;
	}

	public void setNum2(double num2) {
		this.secondNumber = num2;
	}
}
