package factory.method;

import factory.simple.OperationAdd;
import factory.simple.OperationMulti;
import factory.simple.OperationSub;

public class Calculator {


    private Calculator(double o1,double o2){}

    private static Operation useOperator(String operation){
        if (operation.equalsIgnoreCase("add")){
            return new OperationAddFactory().createOperation();
        }else if (operation.equalsIgnoreCase("subtract")){
            return new OperationSubFactory().createOperation();
        }else if(operation.equalsIgnoreCase("multiply")){
            return new OperationMultiFactory().createOperation();
        }else if(operation.equalsIgnoreCase("divide")){
            return new OperationDivFactory().createOperation();
        }

        throw new IllegalArgumentException("....");
    }

    public static double calculate(String operation,double o1 ,double o2){
        return useOperator(operation).result(o1,o2);
    }

    public static void main(String[] args) {

        double answer1 = Calculator.calculate("add", 10, 20);
        double answer2 = Calculator.calculate("subtract", 10, 20);
        double answer3 = Calculator.calculate("multiply", 10, 20);
        double answer4 = Calculator.calculate("divide", 10, 20);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);

    }

}