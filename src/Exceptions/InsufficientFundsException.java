package Exceptions;

public class InsufficientFundsException extends RuntimeException {
  public InsufficientFundsException(String message) {
    super("Insufficient funds for this transaction.");
  }
}
