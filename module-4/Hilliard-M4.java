//  Katie Hilliard, 01/26/2024, M4 Assignment

import java.util.Arrays;

public class AverageCalculator {

    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Main Method to test overloaded methods
    public static void main(String[] args) {
        // Test the arrays
        short[] shortArray = {5, 15, 25, 35, 45};
        int[] intArray = {-100, 0, 50, 100, 150};
        long[] longArray = {1234L, 5678L, 91011L};
        double[] doubleArray = {-10.5, 0.0, 12.75, 25.5, 50.5};

        // Display and calculate averages
        System.out.println("Short Array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("Int Array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("Long Array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}
