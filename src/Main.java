import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(0);
        Account creditAccount = new CreditAccount(0);
        Account checkingAccount = new CheckingAccount(0);

        savingsAccount.addMoney(500);
        creditAccount.addMoney(500);
        checkingAccount.addMoney(500);

        savingsAccount.pay(300);
        creditAccount.pay(300);
        checkingAccount.pay(300);

        savingsAccount.transfer(creditAccount, 100);
        creditAccount.transfer(checkingAccount, 100);
        checkingAccount.transfer(savingsAccount, 100);

        System.out.println(savingsAccount.getValue());
        System.out.println(creditAccount.getValue());
        System.out.println(checkingAccount.getValue());
    }
}
