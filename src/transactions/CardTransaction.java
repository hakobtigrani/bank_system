package transactions;

import enums.CardStatus;
import exceptions.BankTransactionException;
import exceptions.InsufficientFundsException;
import models.Account;
import models.BankAccount;
import models.CardAccount;

public class CardTransaction implements Transaction {
    private CardAccount card;

    public CardTransaction(CardAccount card) {
        this.card = card;
    }

    @Override
    public void deposit(double amount) {
        if (card.getCardStatus() == CardStatus.BLOCKED) {
            System.out.println("Cannot deposit, card is blocked.");
            return;
        }
        card.setBalance(card.getBalance() + amount);
        System.out.println("Deposited " + amount + " to card.");
    }

    @Override
    public void withdraw(double amount) {
        if (card.getBalance() < amount) {
            System.out.println("Not enough balance in card.");
            return;
        }
        card.setBalance(card.getBalance() - amount);
        System.out.println("Withdrawn " + amount + " from card.");
    }

    @Override
    public void transfer(double amount, BankAccount toAccount) throws InsufficientFundsException, BankTransactionException {
        System.out.println("Card transfer executed with card-specific rules.");
    }

    @Override
    public void transfer(Account to, double amount) {

    }
}
