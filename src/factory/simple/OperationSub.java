package factory.simple;

public class OperationSub extends Operation {

    @Override
    public double result() {

        return getN1() -getN2();
    }
}