package factory.abstraction;

public class OperationSubFactory implements OperationFactory{

    @Override
    public Operation createOperation(){
        return new OperationSub();
    }
}
