// Katie Hilliard, 03/05/2024 Module 12 Assignment

public class AutoService {

    // Standard service charge
    public static double yearlyService() {
        return 75.0;
    }

    // Standard service charge with oil change fee
    public static double yearlyService(double oilChangeFee) {
        return 75.0 + oilChangeFee;
    }

    // Standard service charge, oil change fee with tire rotation charge
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return 75.0 + oilChangeFee + tireRotationFee;
    }

    // Standard service charge, oil change fee, tire rotation charge with coupon discount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        return 75.0 + oilChangeFee + tireRotationFee - couponDiscount;
    }

    public static void main(String[] args) {
        // Test methods twice

        // Test 1 - Standard service charge
        System.out.println("Test 1: " + yearlyService());
        System.out.println("Test 2: " + yearlyService());

        // Test 2 - Service charge with oil change
        System.out.println("Test 3: " + yearlyService(40.0));
        System.out.println("Test 4: " + yearlyService(45.0));

        // Test 3 - Service charge, oil change with tire rotation
        System.out.println("Test 5: " + yearlyService(40.0, 20.0));
        System.out.println("Test 6: " + yearlyService(45.0, 30.0));

        // Test 4 - Service charge, oil change, tire rotation with coupon discount
        System.out.println("Test 7: " + yearlyService(40.0, 20.0, 10.0));
        System.out.println("Test 8: " + yearlyService(45.0, 30.0, 20.0));
    }
}
