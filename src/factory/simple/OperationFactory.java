package factory.simple;


public class OperationFactory {


    public static Operation createOperate(String operate) {

        Operation ope ;
        switch (operate) {

            case "+":
                ope = new OperationAdd();
                break;
            case "-":
                ope = new OperationSub();
                break;
            case "*":
                ope = new OperationMul();
                break;
            case "/":
                ope = new OperationDiv();
                break;
            default:
                throw new RuntimeException("illegal operator");


        }

        return ope;


    }

}