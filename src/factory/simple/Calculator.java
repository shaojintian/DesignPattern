package factory.simple;


public class Calculator {


    private Calculator(){}

    public static double calculate(String operation,double o1,double o2){
        Operation op = CalculatorFactory.createOperation(operation);
        return op.result(o1,o2);
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