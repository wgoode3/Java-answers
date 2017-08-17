public class BankAccount {

	private static int numberOfAccounts = 0;
	private static double totalDeposits = 0;
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;

	private String generateAccountNumber(){
		return ("" + Math.random()).substring(2, 12);
	}

	public BankAccount(){
		this.accountNumber = generateAccountNumber();
		this.numberOfAccounts++;
	}

	public double getBalance(String type){
		if(type == "checking"){
			return this.checkingBalance;
		}else if(type == "savings"){
			return this.savingsBalance;
		}
		return 0;
	}

	public BankAccount deposit(String type, double amount){
		if(type == "checking"){
			this.checkingBalance += amount;
		}else if(type == "savings"){
			this.savingsBalance += amount;
		}
		this.totalDeposits += amount;
		return this;
	}

	public BankAccount withdraw(String type, double amount){
		if(type == "checking"){
			if(amount > this.checkingBalance){
				System.out.println("Insufficient Balance!");
			} else {
				System.out.println("$"+ amount + " withdrawn!");
				this.totalDeposits -= amount;
				this.checkingBalance -= amount;
			}
		}else if(type == "savings"){
			if(amount > this.savingsBalance){
				System.out.println("Insufficient Balance!");
			} else {
				System.out.println("$"+ amount + " withdrawn!");
				this.totalDeposits -= amount;
				this.savingsBalance -= amount;
			}
		}
		return this;
	}

	public double totalAmount(){
		return this.totalDeposits;
	}

	public void showInfo(){
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Checking Balance: $" + this.checkingBalance);
		System.out.println("Savings Balance: $" + this.savingsBalance);
	}

}