package Models;

public class Account {

    private String accountNumber;
    private String currency;
    private double balance;

    public Account(long number, String currency, double balance) {

        this.accountNumber = String.format("%016d", number);
        if (Long.toString(number).length() > 16){
            throw new IllegalArgumentException("The account number must have exactly 16 digits!");
        }

        this.currency = currency;
        this.balance = balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
