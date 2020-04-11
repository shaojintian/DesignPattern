package factory.abstraction;

public class CalculatorFactory {
    public static  Operation createOperation(String operation){
        if (operation.equalsIgnoreCase("add")){
            return new OperationAddFactory().createOperation();
        }else if (operation.equalsIgnoreCase("subtract")){
            return new OperationSubFactory().createOperation();
        }else if(operation.equalsIgnoreCase("multiply")){
            return new OperationMultiFactory().createOperation();
        }else if(operation.equalsIgnoreCase("divide")){
            return new OperationDivFactory().createOperation();
        }
        throw new IllegalArgumentException("....");
    }
}
