package factory.simple;

public class OperationMul extends Operation {

    @Override
    public double result() {

        return getN1() * getN2();
    }
}