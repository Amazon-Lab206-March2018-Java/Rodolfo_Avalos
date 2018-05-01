
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount Chanto = new BankAccount();
		BankAccount Rodo = new BankAccount();
		BankAccount Alex = new BankAccount();
		System.out.println(BankAccount.totalBalance);
		Chanto.depositToAccount("savings", 100);
		Chanto.depositToAccount("checking", 150);
		Rodo.depositToAccount("savings", 75);
		Rodo.depositToAccount("checking", 500);
		Alex.depositToAccount("savings", 500);
		Alex.depositToAccount("checking", 125);
		Chanto.depositToAccount("saving", 700);
		System.out.println(BankAccount.totalBalance);
		Chanto.withdrawMoney("checking", 250);
		Rodo.depositToAccount("savings", 750);
		Rodo.withdrawMoney("savings", 246.45);
		System.out.println(BankAccount.totalBalance);
	}
}
