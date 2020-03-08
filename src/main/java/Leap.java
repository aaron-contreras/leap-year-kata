class Leap {

	private int year;

    boolean isLeapYear(int year) {
		this.year = year;
	    
		return isDivisibleBy4() && (!isDivisibleBy100() || isDivisibleBy400());
    }

	boolean isDivisibleBy4() {
		return year % 4 == 0;
	}

	boolean isDivisibleBy100() {
		return year % 100 == 0;
	}

	boolean isDivisibleBy400() {
		return year % 400 == 0;
	}
}
