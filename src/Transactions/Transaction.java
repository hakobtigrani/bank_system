package Transactions;

import Exceptions.BankTransactionException;
import Exceptions.InsufficientFundsException;
import Models.BankAccount;

public interface Transaction {

    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException, BankTransactionException;
    void transfer(double amount, BankAccount toAccount) throws InsufficientFundsException, BankTransactionException;

}
