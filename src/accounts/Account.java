package accounts;

abstract class Account {
    private int value;

    public Account(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    abstract void addMoney(int amount);
    abstract void pay(int amount);
    abstract void transfer(Account acc, int amount);
}
