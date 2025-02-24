// Katie Hilliard, 02/23/2024 Module 10 Assignment

// UseDivision application
public class UseDivision {
    public static void main(String[] args) {
        // Two instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("Global Sales", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asia Operations", 1002, "Japan", "Japanese");

        // Two instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("East Coast Services", 2001, "New York");
        DomesticDivision domDiv2 = new DomesticDivision("West Coast Logistics", 2002, "California");

        // Display details of each division
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
