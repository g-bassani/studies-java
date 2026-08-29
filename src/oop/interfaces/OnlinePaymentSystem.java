package oop.interfaces;

public interface OnlinePaymentSystem {

    double paymentFee(double value);

    double interest(double value, Integer month);

}
