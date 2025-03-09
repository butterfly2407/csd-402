// Katie Hilliard, 03/07/2025, Module 7 Redo

class Fan {
    // Constants for speed settings
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
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

    // Constructor with arguments using 'this' reference
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    // Getter and Setter methods using 'this' reference
    public int getSpeed() {
        return this.speed;
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
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // DisplayFan() method
    public void displayFan() {
        System.out.print("Fan Status: ");
        if (this.on) {
            System.out.println("ON | Speed: " + this.speed + " | Radius: " + this.radius + " | Color: " + this.color);
        } else {
            System.out.println("OFF | Radius: " + this.radius + " | Color: " + this.color);
        }
    }
}


