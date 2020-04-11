package factory;

public class Calculator {
    public static double calculate(String operation , double o1,double o2){
        switch (operation){
            case "add":
                return o1+o2;
            case "sub":
                return o1-o2;
            case "multiply":
                return o1*o2;
            case "divide":
                return o1/o2;
        }
        throw new IllegalArgumentException("...");
    }

    public static void main(String[] args) {
        double answer = Calculator.calculate("add", 1, 2);
    }
}
