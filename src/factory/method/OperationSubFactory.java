package factory.method;

public class OperationSubFactory implements OperationFactory{

    @Override
    public Operation createOperation(){
        return new OperationSub();
    }
}
