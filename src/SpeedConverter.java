public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);

    }
        public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        double totalMilesFromKilometers = Math.round(kilometersPerHour / 1.609);
            return  (int)totalMilesFromKilometers;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0 ){
            System.out.println("Invalid value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + (toMilesPerHour(kilometersPerHour)) + " mi/h");
        }

    }
}
