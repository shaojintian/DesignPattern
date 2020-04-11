package factory.abstraction;

public class OperationDivFactory implements OperationFactory {


    public Operation createOperation(){
        return new OperationDiv();
    }
}
