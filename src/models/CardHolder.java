package models;

public class CardHolder {

    private String passportNumber;
    private String fullName;
    private Address address;
    private String cardList;
    private BankAccount bankAccount;

    public CardHolder(String passportNumber, String fullName, Address address, String cardList, BankAccount bankAccount) {
        this.passportNumber = passportNumber;
        this.fullName = fullName;
        this.address = address;
        this.cardList = cardList;
        this.bankAccount = bankAccount;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCardList() {
        return cardList;
    }

    public void setCardList(String cardList) {
        this.cardList = cardList;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
