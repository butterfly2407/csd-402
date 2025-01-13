//  Katie Hilliard, 01/12/2024, M1 Assignment

import java.util.Scanner;

public class HeatWaterEnergy {
    
    // Method to calculate energy required to heat water
    public static double calculateEnergy(double waterMass, double initialTemp, double finalTemp) {
        // Specific heat capacity of water in Joules per kg per degree Celsius
        final double specificHeatCapacityOfWater = 4184;
        
        // Calculate energy (Q) using the formula
        return waterMass * (finalTemp - initialTemp) * specificHeatCapacityOfWater;
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature of the water (°C): ");
        double initialTemp = scanner.nextDouble();

        System.out.print("Enter the final temperature of the water (°C): ");
        double finalTemp = scanner.nextDouble();

        // Calculate the energy needed
        double energyNeeded = calculateEnergy(waterMass, initialTemp, finalTemp);

        // Display the result
        System.out.printf("The energy needed to heat %.2f kg of water from %.2f°C to %.2f°C is %.2f Joules.%n", 
                          waterMass, initialTemp, finalTemp, energyNeeded);
        
        // Close the scanner
        scanner.close();
    }
}



