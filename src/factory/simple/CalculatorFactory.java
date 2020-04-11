package factory.simple;

public class CalculatorFactory {

    public static Operation createOperation(String operation){
        if(operation.equalsIgnoreCase("add")){
            return new OperationAdd();
        }else if(operation.equalsIgnoreCase("subtract")){
            return new OperationSub();
        }else if(operation.equalsIgnoreCase("multiply")){
            return new OperationMulti();
        }else if(operation.equalsIgnoreCase("divide")){
            return new OperationDiv();
        }

        throw new IllegalArgumentException("illegal operation");

    }
}
