package org;

public class NumberGame {

	private int rawNumber;

	public NumberGame(int rawNumber) {
		this.rawNumber = rawNumber;
	}

	@Override
	public String toString() {
		String resultStr = "";
		if (isRelated(3) && isRelated(5)) {
			resultStr = "fizzbuzz";
		} else if (isRelated(3)) {
			resultStr = "fizz";
		} else if (isRelated(5)) {
			resultStr = "buzz";
		} else {
			resultStr = String.valueOf(rawNumber);
		}
		return resultStr;
	}

	private boolean isRelated(int i) {
		return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
	}

}
