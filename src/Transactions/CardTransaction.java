package Transactions;

import Exceptions.BankTransactionException;
import Exceptions.InsufficientFundsException;
import Models.BankAccount;

public interface CardTransaction {

    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException, BankTransactionException;
    void transfer(double amount, CardTransaction toCard) throws InsufficientFundsException, BankTransactionException;
    void blockCard(boolean status);

}
