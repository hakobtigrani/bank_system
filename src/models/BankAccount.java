package models;

import enums.BankAccountType;

public class BankAccount extends Account {

    private String accountNumber;
    private String currency;
    private double balance;
    private BankAccountType bankAccountType;

    public BankAccount(long number, String currency, double balance, BankAccountType bankAccountType) {

        super(number, currency, balance);

        this.accountNumber = String.format("%016d", number);
        if (Long.toString(number).length() > 16){
            throw new IllegalArgumentException("The account number must have exactly 16 digits!");
        }

        this.currency = currency;
        this.balance = balance;
        this.bankAccountType = bankAccountType;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", bankAccountType=" + bankAccountType +
                '}';
    }
}
