package factory.abstraction;

public class OperationAddFactory implements OperationFactory{


    public Operation createOperation(){

        return new OperationAdd();
    }

}
