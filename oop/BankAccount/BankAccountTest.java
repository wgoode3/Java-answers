public class BankAccountTest {
	public static void main(String[] args){
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();

		acc1.deposit("checking", 100.50).deposit("savings", 33.72);
		acc2.deposit("checking", 162.25).deposit("savings", 15.99);

		acc1.showInfo();
		acc2.showInfo();

		System.out.println(acc1.totalAmount());
		
	}
}