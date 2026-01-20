package main.java.lld.ocp.good;

public class Main {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod upi = new UpiPayment();
        PaymentMethod paypal = new PaypalPayment();

        paymentService.processPayment(creditCard, 1000);
        paymentService.processPayment(upi, 500);
        paymentService.processPayment(paypal, 2000);
    }
}
