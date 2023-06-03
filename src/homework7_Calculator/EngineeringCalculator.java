package homework7_Calculator;

class EngineeringCalculator extends Calculator {
    public double calculatePower(double base, double exponent) {
        double power = Math.pow(base, exponent);
        return power;
    }
}
