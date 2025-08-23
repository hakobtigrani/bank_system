package Exceptions;

public class BankTransactionException extends RuntimeException {
  public BankTransactionException(String message) {
    super("Bank transaction error occurred.");
  }
}
