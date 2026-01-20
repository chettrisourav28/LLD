package main.java.lld.ocp.good;

class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
