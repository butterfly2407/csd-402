public class ProgrammingAssignment {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < (rows - i - 1) * 2; j++) {
                System.out.print(" ");
            }

            // Generate and print left side of the row
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Generate and print right side of the row
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Print the '@' symbol at end of the row
            System.out.println("@");
        }
    }
}
