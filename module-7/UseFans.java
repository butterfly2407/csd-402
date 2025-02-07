// Katie Hilliard, 02/06/2025, Module 7

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Method to display multiple Fan instances without toString()
    public static void displayAllFans(List<Fan> fans) {
        System.out.println("\nDisplaying All Fans:");
        for (Fan fan : fans) {
            fan.displayFan();
        }
    }

    // Method to display a single Fan instance without toString()
    public static void displaySingleFan(Fan fan) {
        fan.displayFan();
    }

    public static void main(String[] args) {
        // Collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();

        // Different Fan instances
        fanCollection.add(new Fan());  // Default
        fanCollection.add(new Fan(Fan.SLOW, true, 8, "red"));
        fanCollection.add(new Fan(Fan.MEDIUM, false, 12, "green"));
        fanCollection.add(new Fan(Fan.FAST, true, 10, "blue"));
        fanCollection.add(new Fan(Fan.STOPPED, false, 5, "yellow"));

        displayAllFans(fanCollection);

        // Display single fan
        System.out.println("\nDisplaying a Single Fan:");
        displaySingleFan(fanCollection.get(1));
    }
}
