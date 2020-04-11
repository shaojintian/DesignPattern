package factory.simple;



public class CalculatorFactory {

    public static Operation createOperation(String operation,double o1,double o2){
        if(operation.equalsIgnoreCase("add")){
            return new OperationAdd(o1,o2);
        }else if(operation.equalsIgnoreCase("subtract")){
            return new OperationSub(o1,o2);
        }else if(operation.equalsIgnoreCase("multiply")){
            return new OperationMulti(o1,o2);
        }else if(operation.equalsIgnoreCase("divide")){
            return new OperationDiv(o1, o2);
        }

        throw new IllegalArgumentException("illegal operation");

    }
}
