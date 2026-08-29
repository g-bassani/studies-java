package exceptions.accountWithdrawalException;


public class Account {

    private final Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }


    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;

    }
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new BalanceException("Not enough balance");
        }
        if (amount > withdrawLimit){
            throw new BalanceException("Withdrawal higher than the limit");
        }
        balance -= amount;

    }
}
