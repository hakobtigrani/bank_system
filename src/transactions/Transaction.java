package transactions;

import exceptions.BankTransactionException;
import exceptions.InsufficientFundsException;
import models.Account;
import models.BankAccount;

public interface Transaction {

    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException, BankTransactionException;
    void transfer(double amount, BankAccount toAccount) throws InsufficientFundsException, BankTransactionException;

    void transfer(Account to, double amount);
}
