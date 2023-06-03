package homework7_Calculator;

abstract class Calculator {

    double Result;

    public double getResult() {
        return Result;
    }

    public double add(double a, double b){
       Result = a + b;
       return Result;
    }

    public double subtract(double a, double b){
        Result = a - b;
        return Result;
    }

    public double multiply(double a, double b){
        Result = a * b;
        return Result;
    }

    public int divide(int a, int b) {
        Result = a / b;
        return (int) Result;
    }
}









