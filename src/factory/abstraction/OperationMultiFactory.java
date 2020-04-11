package factory.abstraction;

public class OperationMultiFactory implements OperationFactory{

    @Override
    public Operation createOperation(){
        return new OperationMulti();
    }
}
