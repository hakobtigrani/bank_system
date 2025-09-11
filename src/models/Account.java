package models;

import enums.Currency;

public class Account {

    private final String accountNumber;
    private final Currency currency;
    private double balance;

    public Account(long number, Currency currency, double balance) {

        this.accountNumber = String.format("%016d", number);
        if (Long.toString(number).length() > 16){
            throw new IllegalArgumentException("The account number must have exactly 16 digits!");
        }

        this.currency = currency;
        this.balance = balance;

    }

    public String getAccountNumber() { return accountNumber; }

    public Currency getCurrency() { return currency; }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

}
