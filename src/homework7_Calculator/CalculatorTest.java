package homework7_Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        // SimpleCalculator
        Calculator simpleCalculator = new SimpleCalculator();
        System.out.println("Simple Calculator:");
        System.out.println("Addition: " + simpleCalculator.add(5, 3));
        System.out.println("Subtraction: " + simpleCalculator.subtract(5, 3));
        System.out.println("Multiplication: " + simpleCalculator.multiply(5, 3));
        System.out.println("Division: " + simpleCalculator.divide(10, 2));
        System.out.println();

        // FinancialCalculator
        FinancialCalculator financialCalculator = new FinancialCalculator();
        System.out.println("Financial Calculator:");
        System.out.println("Addition: " + financialCalculator.add(1000, 500));
        System.out.println("Subtraction: " + financialCalculator.subtract(1000, 500));
        System.out.println("Multiplication: " + financialCalculator.multiply(1000, 1.5));
        System.out.println("Division: " + financialCalculator.divide(1000, 5));
        System.out.println("Interest: " + financialCalculator.calculateInterest(1000, 0.05, 3));
        System.out.println();

        // AccountingCalculator
        AccountingCalculator accountingCalculator = new AccountingCalculator();
        System.out.println("Accounting Calculator:");
        System.out.println("Addition: " + accountingCalculator.add(5000, 2000));
        System.out.println("Subtraction: " + accountingCalculator.subtract(5000, 2000));
        System.out.println("Multiplication: " + accountingCalculator.multiply(5000, 0.1));
        System.out.println("Division: " + accountingCalculator.divide(5000, 5));
        System.out.println("Depreciation: " + accountingCalculator.calculateDepreciation(50000, 5000, 10));
        System.out.println();

        // EngineeringCalculator
        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        System.out.println("Engineering Calculator:");
        System.out.println("Addition: " + engineeringCalculator.add(10, 20));
        System.out.println("Subtraction: " + engineeringCalculator.subtract(10, 20));
        System.out.println("Multiplication: " + engineeringCalculator.multiply(10, 20));
        System.out.println("Division: " + engineeringCalculator.divide(100, 5));
        System.out.println("Power: " + engineeringCalculator.calculatePower(2, 3));
        System.out.println();

        // ProgrammableCalculator
        ProgrammableCalculator programmableCalculator = new ProgrammableCalculator();
        System.out.println("Programmable Calculator:");
        System.out.println("Addition: " + programmableCalculator.add(7, 8));
        System.out.println("Subtraction: " + programmableCalculator.subtract(7, 8));
        System.out.println("Multiplication: " + programmableCalculator.multiply(7, 8));
        System.out.println("Division: " + programmableCalculator.divide(100, 8));
        System.out.println("Custom Calculation: " + programmableCalculator.performCustomCalculation("2 + 3 * 4 - 1"));
        System.out.println();
    }
}

