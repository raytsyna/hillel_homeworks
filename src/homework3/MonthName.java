package homework3;
import java.util.Scanner;

//Using Switch
public class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month.");
                break;
        }
    }
}

//Using if else
class MonthName2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int month = sc.nextInt();

        if (month == 1) {
            System.out.println("JAN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MAR");
        } else if (month == 4) {
            System.out.println("APR");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("JUN");
        } else if (month == 7) {
            System.out.println("JUL");
        } else if (month == 8) {
            System.out.println("AUG");
        } else if (month == 9) {
            System.out.println("SEP");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month.");
        }
    }
}

//Triangle task
class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = sc.nextDouble();

        if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}

//Middle digits
class MiddleDigits {
    public static void main(String[] args) {
        String str1 = "August";
        String str2 = "July";

        String digits1 = str1.substring(str1.length()/2 - 1, str1.length()/2 + 1);
        String digits2 = str2.substring(str2.length()/2 - 1, str2.length()/2 + 1);

        System.out.println("Middle digits of " + str1 + ": " + digits1);
        System.out.println("Middle digits of " + str2 + ": " + digits2);
    }
}

class CompareAbsoluteValues{

    public static void main(String args[]){
        float a = -9;
        float b = 3;
        System.out.println(Math.abs(a));
        System.out.println(Math.abs(b));

        if (Math.abs(a) > Math.abs(b)) {
            System.out.println("-9 has bigger absolute value");
        } else {
                System.out.println("3 has bigger absolute value");
            }
    }
}