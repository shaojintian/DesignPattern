package factory.abstraction;

public class OperationDivFactory implements OperationFactory {

    @Override
    public Operation createOperation(){
        return new OperationDiv();
    }
}
