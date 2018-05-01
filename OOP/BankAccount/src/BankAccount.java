import java.util.*;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	public static int accountsCreated = 0;
	public static double totalBalance = 0;
	
	public BankAccount() {
		accountNumber = createAccountNumber(); 
		checkingBalance = 0.00;
		savingsBalance = 0.00;
		accountsCreated ++;
	}
	private String createAccountNumber() {
		Random numb = new Random();
		int account = numb.nextInt(9000000) + 1000000000;
		String accnumber = String.valueOf(account);
		System.out.println(accnumber);
		return accnumber;
	}
	public double getCheckingAccount() {
		return checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void depositToAccount(String name, double deposit) {
		if (name == "checking") {
			this.checkingBalance += deposit;
			BankAccount.totalBalance += deposit;
			System.out.println("You have deposited "+deposit+" to your checking account.");
		} else if (name == "savings"){
			this.savingsBalance += deposit;
			BankAccount.totalBalance += deposit;
			System.out.println("You have deposited "+deposit+" to your savings account.");
		} else {
		System.out.println("Please enter the correct type of account, either Savings or Checking");
		}
	}
	public void withdrawMoney(String name, double money) {
		if (name == "checking") {
			if (this.checkingBalance < money) {
				System.out.println("You do not have enough money in your checking account.");
			} else {
				this.checkingBalance -= money;
				BankAccount.totalBalance -= money;
				System.out.println("You have withdrawn "+money+" from your checking account.");
			}
			if (this.savingsBalance < money) {
				System.out.println("You do not have enough money in your savings account.");
			} else {
				this.savingsBalance -= money;
				BankAccount.totalBalance -= money;
				System.out.println("You have withdrawn "+money+" from your savings account.");
			}
		} else if (name == "savings"){
			this.savingsBalance += money;
			BankAccount.totalBalance += money;
			System.out.println("You have deposited "+money+" to your checking account.");
		} else {
		System.out.println("Please enter the correct type of account, either Savings or Checking");
		}
	}
	public String getBalance() {
		return "Your current savings balance is "+this.getSavingsBalance()+". Your current checkings balance is "+this.getCheckingAccount();
		}
	}
