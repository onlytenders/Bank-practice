package accounts;

public class SavingsAccount extends Account {
    public SavingsAccount(int value) {
        super(value);
    }

    @Override
    public void addMoney(int amount) {
        super.value += amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("The operation is not available on this account");
    }

    @Override
    public void transfer(Account acc, int amount) {
        if (super.value - amount >= 0) {
            super.value -= amount;
            acc.addMoney(amount);
        }
        else {
            System.out.println("The account's value is not enough for this operation");
        }
    }
}
