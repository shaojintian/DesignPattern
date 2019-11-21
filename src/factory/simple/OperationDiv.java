package factory.simple;

public class OperationDiv extends Operation {

    private double n1 = this.getN1();
    private double n2 = this.getN2();
    @Override
    public double result() {
        if (n2 == 0) {
            throw new RuntimeException("divided by 0");
        }
        return n1 / n2;
    }
}