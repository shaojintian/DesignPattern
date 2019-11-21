package factory.simple;

public class OperationAdd extends Operation{

    @Override
    public double result(){
        return getN1() + getN2();
    }
}