package com.bhubanananda.inheritance;

/**
 * The Class SingleInheritance.
 *
 * @author Bhubanananda
 */
public class SingleInheritance {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.interestRate();
		sbi.personalLoan();
	}
}

class RBI {
	void interestRate() {
		System.out.println("Saving interest rate is 8%");
	}
}

class SBI extends RBI {
	void personalLoan() {
		System.out.println("Interest rate is 15%");
	}
}