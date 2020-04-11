package factory.simple;

public class OperationDiv implements Operation{



    @Override
    public double result(double o1,double o2){
        if(o2==0){
            throw new IllegalArgumentException("...");
        }
        return o1/o2;
    }

}
