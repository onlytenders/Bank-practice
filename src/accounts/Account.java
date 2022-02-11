package accounts;

abstract public class Account {
    protected int value;

    public Account(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract void addMoney(int amount);
    public abstract void pay(int amount);
    public abstract void transfer(Account acc, int amount);
}
