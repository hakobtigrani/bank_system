package Models;

import java.time.YearMonth;

public class CardAccount {

    private String accountNumber;
    private String cvv;
    private YearMonth expirationDate;
    private String cardType;
    private double balance;
    private String cardStatus;
    private String currency;

    public CardAccount(long accNumber, short cvvNumber, YearMonth expirationDate,
                       String cardType, double balance, String cardStatus, String currency) {

        this.accountNumber = String.format("%016d", accNumber);
        if (Long.toString(accNumber).length() > 16){
            throw new IllegalArgumentException("The account number must have exactly 16 digits!");
        }

        this.cvv = String.format("%03d", cvvNumber);
        if (Long.toString(cvvNumber).length() != 3){
            throw new IllegalArgumentException("The CVV must contain 3 digits!");
        }

        this.expirationDate = expirationDate;
        this.cardType = cardType;
        this.balance = balance;
        this.cardStatus = cardStatus;
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public YearMonth getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(YearMonth expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
