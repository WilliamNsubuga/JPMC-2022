public class LengthConversion {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68) + "cm");
        System.out.println(convertToCentimeters(5, 8) + "cm");
    }

    public static double convertToCentimeters(int heightInInches){
        double inchesToCentimeters = heightInInches * 2.54d;
        return inchesToCentimeters;
    }
    public static double convertToCentimeters(int heightInFeet, int heightInInches){
        double totalHeightInInches = (heightInFeet * 12) + heightInInches;
        return convertToCentimeters((int)totalHeightInInches);
    }
}
