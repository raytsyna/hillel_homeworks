// Java Program to print any string
package homework2;

public class HelloWorld {
    public static void main(String [] args){
        System.out.println("My first program on Java, Hello world!");
    }
}

// Java Program to Convert Celsius into Fahrenheit & Kelvins
class TemperatuteConverter {
    public static void main(String[] args)
    {
        double celsius = 10.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = (celsius + 273.16);
        System.out.println("celsius:" + celsius);
        System.out.println("fahrenheit:" + fahrenheit);
        System.out.println("kelvin:" + kelvin);
    }
}
//Java Program to calculate the area of the right angle triangle
class AreaTriangle {
    public static void main(String args[]) {
        double base = 10.0;
        double height = 55.5;
        double area = (base * height)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}

//CheckOddEven Program
  class CheckOddEven {
    public static void main(String[] args) {
        int num = 29;
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("BYE");
    }
        }


