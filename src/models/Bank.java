package models;

public class Bank {

    private String bankName;
    private Address address;
    private String cardholderList;

    public Bank(String bankName, Address address, String cardholderList) {
        this.bankName = bankName;
        this.address = address;
        this.cardholderList = cardholderList;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCardholderList() {
        return cardholderList;
    }

    public void setCardholderList(String cardholderList) {
        this.cardholderList = cardholderList;
    }

}
