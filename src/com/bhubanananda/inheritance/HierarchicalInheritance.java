package com.bhubanananda.inheritance;

/**
 * The Class HierarchicalInheritance.
 *
 * @author Bhubanananda
 */
public class HierarchicalInheritance {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		HISmallFinance hiSmallFinance = new HISmallFinance();
		hiSmallFinance.interestRate();
		hiSmallFinance.personalLoan();
		hiSmallFinance.agriLoan();

		System.out.println("---sib-----");
		HISBI hisbi = new HISBI();
		hisbi.interestRate();
		hisbi.personalLoan();
	}
}

class HIRBI {
	void interestRate() {
		System.out.println("Saving interest rate is 8%");
	}
}

class HISBI extends HIRBI {
	void personalLoan() {
		System.out.println("personal loan interest rate is 15%");
	}
}

class HISmallFinance extends HIRBI {
	void personalLoan() {
		System.out.println("personal loan interest rate is 18%");
	}

	void agriLoan() {
		System.out.println("aggriculture loan interest rate is 5%");
	}
}