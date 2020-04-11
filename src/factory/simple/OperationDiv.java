package factory.simple;

public class OperationDiv implements Operation{

    private double o1;
    private double o2;

    public OperationDiv(double o1,double o2){
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public double result(){
        if(o2==0){
            throw new IllegalArgumentException("...");
        }
        return o1/o2;
    }

}
