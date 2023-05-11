package homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SinTable {
    public static void main(String[] args) {
        double[] sinValues = new double[37];

        for (int i = 0; i <= 36; i++) {
            double x = Math.toRadians(i * 10);
            sinValues[i] = Math.sin(x);
        }

        System.out.println("sin(x)");
        for (int i = 0; i <= 36; i++) {
            int x = i * 10;
            System.out.printf("%d - %.2f\n", x, sinValues[i]);
        }
    }
}


 class ReplaceEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        System.out.print("Original array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("\n");
        System.out.print("Resulting array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}


class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        char[] myArray = word.toCharArray();
        int size = myArray.length;
        char [] original = Arrays.copyOf(myArray,myArray.length);

        for (int i = 0; i < size / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[size-i-1];
            myArray[size-i-1] = temp;
        }
        System.out.println("Original Array"+Arrays.toString(original));
        System.out.println("Reverse Array"+Arrays.toString(myArray));

        if(Arrays.equals(myArray, original)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }

    }
}

class MinAndMaxValues {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int value = scan.nextInt();
            array[i] = value;
        }

        int min = array[0];
        for (int i = 0; i < array.length; i ++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Minimal value: " + min);

        int max = array[0];
        for (int i = 0; i < array.length; i ++) {
            if(array[i] >= max)
                max = array[i];
        }
        System.out.println("Maximum value: " + max);
    }
}

class MinAndMax2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        System.out.print("All numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i ++) {
            if(numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("Minimal value: " + min);

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i ++) {
            if(numbers[i] >= max)
                max = numbers[i];
        }
        System.out.println("Maximum value: " + max);
    }
    }

