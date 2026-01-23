package main.java.lld.SOLID.isp.goodCode;

public class MultiPurposeMachine implements Printer,Scannner,Copier{

    @Override
    public void scan() {
        System.out.println("Scanning....");
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void copy() {
        System.out.println("Copying......");
    }

}
