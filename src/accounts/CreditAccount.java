package accounts;

public class CreditAccount extends Account {
    public CreditAccount(int value) {
        super(value);
    }

    @Override
    public void addMoney(int amount) {
        if (super.value + amount <= 0) {
            super.value += amount;
        }
        else {
            System.out.println("Your debt is less than you trying to pay");
        }
    }

    @Override
    public void pay(int amount) {
        super.value -= amount;
    }

    @Override
    public void transfer(Account acc, int amount) {
        super.value -= amount;
        acc.addMoney(amount);
    }
}
