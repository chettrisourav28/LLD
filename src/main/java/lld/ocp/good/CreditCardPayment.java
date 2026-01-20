package main.java.lld.ocp.good;

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}
