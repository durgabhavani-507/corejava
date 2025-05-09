package bank.com;

public class BankAccountMain {
public static void main(String args[]) {
	BankAccount b=new BankAccount();
	b.setAccountDetails("Rahul", 123456, 5000.0);
	String res=b.getAccountDetails();
	System.out.println(res);
}

}
