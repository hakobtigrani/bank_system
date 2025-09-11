package models;

import enums.CardStatus;
import enums.CardType;
import enums.Currency;
import java.time.YearMonth;

public class CardAccount extends Account {

    private String accountNumber;
    private String cvv;
    private YearMonth expirationDate;
    private CardType cardType;
    private double balance;
    private CardStatus cardStatus;
    private Currency currency;

    // TODO CURRENCY

    public CardAccount(long accNumber, short cvvNumber, YearMonth expirationDate,
                       CardType cardType, double balance, CardStatus cardStatus, Currency currency) {

        super(accNumber, currency, balance);

        this.accountNumber = String.format("%016d", accNumber);
        if (Long.toString(accNumber).length() > 16) {
            throw new IllegalArgumentException("The account number must have exactly 16 digits!");
        }

        this.cvv = String.format("%03d", cvvNumber);
        if (Long.toString(cvvNumber).length() != 3) {
            throw new IllegalArgumentException("The CVV must contain 3 digits!");
        }

        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.balance = balance;
        this.cardStatus = cardStatus;
        this.currency = currency;

    }

    public CardType getCardType() { return cardType; }
    public void setCardType(CardType cardType) {
        if(cardType == null) { throw new IllegalArgumentException("Card type cannot be null"); }
        this.cardType = cardType;
    }
    public CardStatus getCardStatus() { return cardStatus; }
    public void setCardStatus(CardStatus cardStatus) {
        if(cardStatus == null){ throw new IllegalArgumentException("Card status cannot be null"); }
        this.cardStatus = cardStatus;
    }

    @Override
    public String toString() {
        return "CardAccount: " +
                "accountNumber='" + getAccountNumber() + '\'' +
                ", expirationDate=" + expirationDate +
                ", cardType=" + cardType +
                ", balance=" + getBalance() +
                ", cardStatus=" + cardStatus +
                ", currency=" + getCurrency();
    }

}