package lara.com;

class Loan {
	private double interest;
	private String type;

	public Loan() {
	}

	public Loan(String type) {
		this.type = type;
		this.interest = 0.0;
	}

	public static void main(String[] args) {
		Loan l = new Loan("Personal_loan");
		System.out.println("Loan Type->" + l.type);
		System.out.println("Interest->" + l.interest);

	}
}
