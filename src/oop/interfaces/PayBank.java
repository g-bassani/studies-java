package oop.interfaces;

// Example system

public class PayBank implements OnlinePaymentSystem {

    public double paymentFee(double value) {
        return value * 0.02;
    }

    public double interest(double value, Integer month) {
        return value * 0.01 * month;
    }
}
