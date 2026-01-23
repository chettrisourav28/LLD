package main.java.lld.SOLID.ocp.good;

class UpiPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount);
    }
}
