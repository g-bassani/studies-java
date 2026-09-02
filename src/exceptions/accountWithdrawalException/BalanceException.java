package exceptions.accountWithdrawalException;

public class BalanceException extends RuntimeException {
    public BalanceException(String message) {
        super(message);
    }
}
