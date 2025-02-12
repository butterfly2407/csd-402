import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Plum");
        words.add("Strawberry");
        words.add("Orange");
        words.add("Banana");
        words.add("Cherry");
        words.add("Lime");
        words.add("Lemon");
        words.add("Grape");
        words.add("Peach");

        System.out.println("Here are the words in the list:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask uses which element they want to see again
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an index (0-9) to see word again: ");
        String userInput = scanner.nextLine();

        try {
            Integer index = Integer.parseInt(userInput);

            String selectedWord = words.get(index);
            System.out.println("You selected: " + selectedWord);
        } catch (NumberFormatException e) {
            System.out.println("Input is Invalid. Please enter a number.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds Exception has been thrown.");
        }

        scanner.close();
    }
}
