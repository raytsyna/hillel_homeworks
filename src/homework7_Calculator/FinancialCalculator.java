package homework7_Calculator;

class FinancialCalculator extends Calculator {
    public double calculateInterest(double principal, double rate, int years) {
        double interest = principal * rate * years;
        return interest;
    }
}

