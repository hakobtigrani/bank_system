package transactions;

import enums.BankAccountType;
import exceptions.BankTransactionException;
import exceptions.InsufficientFundsException;
import models.Account;
import models.BankAccount;

public class BankAccountTransaction implements Transaction {
    private BankAccount account;

    public BankAccountTransaction(BankAccount account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        if (account.getBankAccountType() == BankAccountType.DEBIT) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposited " + amount + " into debit account.");
        } else {
            System.out.println("Cannot deposit into credit account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (account.getBankAccountType() == BankAccountType.CREDIT || account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawn " + amount + " from bank account.");
        } else {
            System.out.println("Not enough balance in debit account.");
        }
    }

    @Override
    public void transfer(double amount, BankAccount toAccount) throws InsufficientFundsException, BankTransactionException {

    }

    @Override
    public void transfer(Account to, double amount) {

        if (!(to instanceof BankAccount)) { throw new BankTransactionException("Transfer target must be a bank account."); }

        BankAccount target = (BankAccount) to;

        if (this.account.getBankAccountType() != BankAccountType.DEBIT) { throw new BankTransactionException("Only debit accounts can send money."); }

        if (target.getBankAccountType() != BankAccountType.CREDIT) { throw new BankTransactionException("Can only transfer money to a credit account."); }

        if (this.account.getBalance() < amount) { throw new BankTransactionException("Not enough balance in debit account."); }

        this.account.setBalance(this.account.getBalance() - amount);
        target.setBalance(target.getBalance() + amount);

        System.out.println("Transferred " + amount +
                " from debit account " + this.account.getAccountNumber() +
                " to credit account " + target.getAccountNumber());
    }
}

