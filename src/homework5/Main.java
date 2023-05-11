package homework5;
import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("a + b = " + Calculator.add(a, b));
        System.out.println("a - b = " + Calculator.subtract(a, b));
        System.out.println("a * b = " + Calculator.multiply(a, b));
        System.out.println("a / b = " + Calculator.divide(a, b));
    }
    }
