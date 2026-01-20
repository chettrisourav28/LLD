package main.java.lld.ocp.bad;


class PaymentService {

    public void processPayment(String paymentType, double amount) {

        if (paymentType.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment of " + amount);
        } else if (paymentType.equals("UPI")) {
            System.out.println("Processing UPI payment of " + amount);
        } else if (paymentType.equals("PAYPAL")) {
            System.out.println("Processing PayPal payment of " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment type");
        }
    }
}
