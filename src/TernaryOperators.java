public class TernaryOperators {
    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;

        double calculateDouble = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("Calculation Total: " + calculateDouble);

        double remainder = calculateDouble % 40.00d;

        boolean hasNoRemainder = remainder == 0.00d;

        System.out.println("Remainder Result: " + remainder);

        if (hasNoRemainder) {
            System.out.println("Has No Remainder");
        }
    }
}
