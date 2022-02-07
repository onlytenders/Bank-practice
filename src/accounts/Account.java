package accounts;

abstract class Account {
    private int value;

    public Account(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void addMoney(int amount) {
        value += amount;
    }

    public void pay(int amount) {
        value -= amount;
    }

    public void transfer(Account acc, int amount) {
        value -= amount;
        acc.addMoney(amount);
    }
}
