package homework7_Calculator;

class AccountingCalculator extends Calculator {
    public double calculateDepreciation(double cost, double salvageValue, int life) {
        double depreciation = (cost - salvageValue) / life;
        return depreciation;
    }
}
