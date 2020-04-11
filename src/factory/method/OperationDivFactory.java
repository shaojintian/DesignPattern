package factory.method;

public class OperationDivFactory implements OperationFactory {

    @Override
    public Operation createOperation(){
        return new OperationDiv();
    }
}
