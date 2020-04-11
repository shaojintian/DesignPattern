package factory.simple;


public class Calculator {


    private Calculator(){}

    public static double calculate(String operation,double o1,double o2){
        Operation op = CalculatorFactory.createOperation(operation);
        return op.result(o1,o2);
    }

    public static void main(String[] args) {

        double answer1 = Calculator.calculate("add", 10, 20);

    }

}