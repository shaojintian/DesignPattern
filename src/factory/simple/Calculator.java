package factory.simple;

import java.util.Scanner;

 abstract class Operation{
    private double n1;
    private double n2;

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public abstract double result();

}



public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input n1: ");
        double n1 = scanner.nextDouble();
        System.out.print("input operator: ");
        String operator = scanner.next();
        System.out.print("input n2: ");
        double n2 = scanner.nextDouble();

        Operation ope = OperationFactory.createOperate(operator);

        ope.setN1(n1);
        ope.setN2(n2);
        System.out.println("ans: "+ ope.result());

    }
}