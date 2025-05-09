package bank.com;

public class BankAccount {
 String accountHolder;
 int accountNumber;
 double balance;
 public void setAccountDetails(String holder,int accNum,double bal) {
	 accountHolder=holder;
	 accountNumber=accNum;
	 balance=bal;
 }
public String getAccountDetails() {
	return "account holder:"+accountHolder+"\naccountNumber:"+accountNumber+"\nbalane:"+balance;
}
}