// Katie Hilliard, 02/06/2025, Module 7 Redp

import java.util.ArrayList;
import java.util.List;


public class UseFans {

    // Display multiple Fan instances without using toString()
    public static void displayAllFans(List<Fan> fans) {
        System.out.println("\nDisplaying All Fans:");
        for (Fan fan : fans) {
            fan.displayFan(); 
        }
    }

    // Display a single Fan instance without using toString()
    public static void displaySingleFan(Fan fan) {
        fan.displayFan();
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();

        // Add different Fan instances
        fanCollection.add(new Fan());
        fanCollection.add(new Fan(Fan.SLOW, true, 8, "red"));
        fanCollection.add(new Fan(Fan.MEDIUM, false, 12, "green"));
        fanCollection.add(new Fan(Fan.FAST, true, 10, "blue"));
        fanCollection.add(new Fan(Fan.STOPPED, false, 5, "yellow"));

        // Display all fans first
        displayAllFans(fanCollection);

        // Display a single fan
        System.out.println("\nDisplaying a Single Fan:");
        displaySingleFan(fanCollection.get(1)); // Display second fan
    }
}


