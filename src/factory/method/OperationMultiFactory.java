package factory.method;

public class OperationMultiFactory implements OperationFactory{


    public Operation createOperation(){
        return new OperationMulti();
    }
}
