package main.java.lld.SOLID.ocp.good;

class PaymentService {

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
