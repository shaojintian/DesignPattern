package factory.abstraction;

public class OperationDiv implements Operation{



    public double result(double o1 ,double o2){
        if(o2==0){
            throw new IllegalArgumentException("...");
        }
        return o1/o2;
    }

}
