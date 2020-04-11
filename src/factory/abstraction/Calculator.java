package factory.abstraction;


public class Calculator {


    private Calculator(double o1,double o2){}



    public static double calculate(String operation,double o1 ,double o2){
        return CalculatorFactory.createOperation(operation).result(o1, o2);
    }

    public static void main(String[] args) {



    }

}