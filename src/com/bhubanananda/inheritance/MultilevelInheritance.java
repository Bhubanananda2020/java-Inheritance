package com.bhubanananda.inheritance;

/**
 * The Class MultilevelInheritance.
 *
 * @author Bhubanananda
 */
public class MultilevelInheritance {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		MISmallFinance miSmallFinance = new MISmallFinance();
		miSmallFinance.interestRate();
		miSmallFinance.personalLoan();
		miSmallFinance.agriLoan();
	}
}

class MIRBI {
	void interestRate() {
		System.out.println("Saving interest rate is 8%");
	}
}

class MISBI extends MIRBI {
	void personalLoan() {
		System.out.println("personal loan interest rate is 15%");
	}
}

class MISmallFinance extends MISBI {
	void agriLoan() {
		System.out.println("aggriculture loan interest rate is 5%");
	}
}