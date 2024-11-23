package basic;

public class CurrentAccount extends SavingsAccount {
	
	int a1 = 150;
	
	public void demo() {
		System.out.println(this.a1);
		System.out.println(super.a1);
		super.deposit();
		this.deposit();	
	}
	
	@Override
	public void calculateInterest(int money) {
		// TODO Auto-generated method stub
		System.out.println("Override" + " " + money * 5);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.calculateInterest(6000);
		ca.demo();

	}
	
	public void deposit() {
		System.out.println("Deposit current");
	}

}
