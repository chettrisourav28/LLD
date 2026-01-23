package main.java.lld.SOLID.ocp.good;

class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
