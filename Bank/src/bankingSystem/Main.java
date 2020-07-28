package bankingSystem;

public class Main {
	public static void main(String args[]) {
		BranchManager branchManager = new BranchManager();
		RelationalManager realtionalManager = new RelationalManager();
		Cashier cashier = new Cashier();
		Customer customer = new Customer();
		Money money = new Money();
		
		money.getMoney(branchManager);
		
		// Branch Manager and Cashier want to add money
//		branchManager.setMoney(100);
//		cashier.setMoney(50);
		
		
		// All members and Customers of the bank can view the money
//		branchManager.getMoney();
	}
}
