package factory.method;

public class OperationAddFactory implements OperationFactory{
    @Override
    public Operation createOperation(){

        return new OperationAdd();
    }
}
