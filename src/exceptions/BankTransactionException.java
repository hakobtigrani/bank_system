package exceptions;

public class BankTransactionException extends RuntimeException {
  public BankTransactionException(String message) {
    super("Bank transaction error occurred.");
  }
}
