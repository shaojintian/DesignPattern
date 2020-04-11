package factory.abstraction;

public class OperationMultiFactory implements OperationFactory{


    public Operation createOperation(){
        return new OperationMulti();
    }
}
