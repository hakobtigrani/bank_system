import enums.BankAccountType;
import enums.CardStatus;
import enums.CardType;
import enums.Currency;
import models.BankAccount;
import models.CardAccount;
import transactions.BankAccountTransaction;
import transactions.CardTransaction;
import transactions.Transaction;

import java.time.YearMonth;

public class Main {
    public static void main(String[] args) {

        CardAccount seroj = new CardAccount(
                1234567890123456L,
                (short) 123,
                YearMonth.of(2027, 12),
                CardType.VISA,
                500.0,
                CardStatus.ACTIVE,
                Currency.USD);

        BankAccount valod = new BankAccount(
                1234567890123456L,
                Currency.USD,
                500,
                BankAccountType.CREDIT
                );

        BankAccount mesrop = new BankAccount(
                6374859273847569L,
                Currency.USD,
                200,
                BankAccountType.DEBIT
        );

        Transaction transaction1 = new CardTransaction(seroj);
        Transaction transaction2 = new BankAccountTransaction(valod);
        Transaction transaction3 = new BankAccountTransaction(mesrop);

        System.out.println(seroj);
        transaction1.deposit(800);
        System.out.println(seroj);
        transaction1.withdraw(1000);

        System.out.println("\n" + valod);
        transaction2.deposit(50);
        System.out.println(valod);
        System.out.println(mesrop);
        transaction3.transfer(valod, 200);
        System.out.println(valod);
        System.out.println(mesrop);

    }
}
