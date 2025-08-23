package Transactions;

import Exceptions.BankTransactionException;
import Exceptions.InsufficientFundsException;

public interface BankAccountTransaction {

    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException, BankTransactionException;
    void transfer(double amount, CardTransaction toCard) throws InsufficientFundsException, BankTransactionException;

}
