// Katie Hilliard, 02/02/2025, Module 6

class Fan {
    // Four constants for speed settings
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private Boolean fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed. Setting to STOPPED.");
            this.speed = STOPPED;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to return description of fan's state
    @Override
    public String toString() {
        if (on) {
            return "Fan is ON | Speed: " + speed + " | Radius: " + radius + " | Color: " + color;
        } else {
            return "Fan is OFF | Radius: " + radius + " | Color: " + color;
        }
    }
}

// Test code
public class FanTest {
    public static void main(String[] args) {
        // Create fan objects
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.FAST, true, 10, "blue");

        // Display fan states
        System.out.println("Default Fan: " + defaultFan);
        System.out.println("Custom Fan: " + customFan);

        // Test mutator methods
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8);
        defaultFan.setColor("red");

        // Display updated state
        System.out.println("Updated Default Fan: " + defaultFan);
    }
}
