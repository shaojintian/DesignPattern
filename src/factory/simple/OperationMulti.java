package factory.simple;

public class OperationMulti implements Operation{

    private double o1;
    private double o2;

    public OperationMulti(double o1,double o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public double result(){
        return o1*o2;
    }
}
