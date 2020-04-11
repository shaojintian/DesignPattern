package factory.abstraction;

public class OperationSubFactory implements OperationFactory{


    public Operation createOperation(){
        return new OperationSub();
    }
}
