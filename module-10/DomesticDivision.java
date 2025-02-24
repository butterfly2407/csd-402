// Katie Hilliard, 02/23/2024 Module 10 Assignment

// Domestic Division subclass
public class DomesticDivision extends Division {
    private String state;

    // Constructor
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Include Abstract method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
