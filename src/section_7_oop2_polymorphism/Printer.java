package section_7_oop2_polymorphism;

public class Printer {

	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		pagesPrinted = 0 ;
		this.tonerLevel = (tonerLevel < 0 || tonerLevel >= 100) ? -1 : tonerLevel;
		this.duplex = duplex;
	}

	public int addToner(int tonerAmount) {
//		if (tonerAmount < 0 || tonerAmount > 100 || tonerLevel < 0) return -1;
//
//		int tempToner = tonerLevel + tonerAmount;
//		if (tempToner < 0 || tempToner > 100) return -1;
//
//		return tonerLevel + tonerAmount;

		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerAmount;
			return this.tonerLevel;
		} else {
			return -1;
		}
	}

	public int printPages(int pagesToPrint) {

		pagesToPrint = duplex ? (pagesToPrint / 2) + (pagesToPrint % 2) : pagesToPrint;
		pagesPrinted += pagesToPrint;

		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
