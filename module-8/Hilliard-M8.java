// Katie Hilliard, 02/11/2025, Module 8

import java.util.ArrayList;
import java.util.Scanner;

public class KatieArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;  // If Arraylist is empty, return to 0
        }
        
        Integer maxValue = list.get(0); // First element being set at max
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (Enter 0 to stop add to the list): ");
        while (true) {
            int num = scanner.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }

        scanner.close();

        Integer largestNumber = max(numbers);
        System.out.println("Largest number in the list is: " + largestNumber);
    }
}
