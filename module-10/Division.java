// Katie Hilliard, 02/23/2024 Module 10 Assignment

// Abstract Division class
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method defined in subclasses
    public abstract void display();
}
