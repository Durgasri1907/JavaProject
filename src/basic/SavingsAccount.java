package basic;

public class SavingsAccount {
	
	int a1 = 100;
	
	public void deposit() {
		System.out.println("Deposit Savings");
	}
	
	public void calculateInterest(int money) {
		System.out.println(money * 7.5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sa = new SavingsAccount();
		sa.deposit();
		sa.calculateInterest(600);

	}

}
