package main.java.lld.SOLID.isp.badCode;


// Even for a simple printer it has all the methods from machine which is not required
public class SimplePrinter implements Machine{

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void scan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scan'");
    }

    @Override
    public void copy() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

}
