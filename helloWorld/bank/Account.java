package bank;

public class Account {

	   private String accountHolderName = "Anshul";
	   private double accountBalance = 50000.00d;
	   private String accountType = "Savings";
	   private String accountNumber= "1234567890";
	
	   public double withdrawMoney(double amount) {
		   
		  return accountBalance - amount;
	   }
	   
	   public void depositMoney(double amount) {
		   
			  accountBalance = accountBalance + amount;
		   }
	   public void checkBalance() {
			  System.out.println(accountBalance);
		   }
}
